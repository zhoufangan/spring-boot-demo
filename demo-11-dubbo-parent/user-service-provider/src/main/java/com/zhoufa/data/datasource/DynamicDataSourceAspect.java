package com.zhoufa.data.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/11.
 */
@Component
@Aspect
@Order(-1)
public class DynamicDataSourceAspect {

    @Pointcut(value = "execution(* com.zhoufa.service..*.*(..))")
    public void serviceAopPoint() {

    }

    @Before(value = "serviceAopPoint()")
    public void changeDataSource(JoinPoint jp) throws NoSuchMethodException {
        // 也可以做当前存在的，不用重新设置数据源的
//        boolean exists = DynamicDataSourceContextHolder.existsDataSourceInContext();
//        if (exists) {
//            return;
//        }

        Method method = ((MethodSignature) jp.getSignature()).getMethod();
        TargetDataSource targetDataSource = getTargetDataSource(jp, method);
        if (targetDataSource != null) {
            DynamicDataSourceContextHolder.setCurrentDataSource(targetDataSource.dataSourceType());
            System.out.println("DynamicDataSource --------->>>>>>>>>> " + targetDataSource.dataSourceType().name());
        } else {
            String name = method.getName().toLowerCase();
            if (name.startsWith("find")
                    || name.startsWith("query")
                    || name.startsWith("get")
                    || name.startsWith("search")
                    || name.startsWith("select")) {
                DynamicDataSourceContextHolder.setCurrentDataSource(DataSourceTypes.SLAVER);
                System.out.println("DynamicDataSource --------->>>>>>>>>> " + DataSourceTypes.SLAVER.name());
            }
        }
    }

    @After(value = "serviceAopPoint()")
    public void resetDataSource(JoinPoint jp) {
        DynamicDataSourceContextHolder.clearCurrentDataSource();
    }


    private TargetDataSource getTargetDataSource(JoinPoint jp, Method method) {
        Object[] args = jp.getArgs();
        Class<?>[] parameterTypes = new Class[args.length];
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                if (arg != null) {
                    parameterTypes[i] = args[i].getClass();
                }
            }
        }
        TargetDataSource targetDataSource = null;
        try {
            Method targetMethod = jp.getTarget().getClass().getDeclaredMethod(method.getName(), parameterTypes);
            targetDataSource = AnnotationUtils.findAnnotation(targetMethod, TargetDataSource.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return targetDataSource;
    }


}
