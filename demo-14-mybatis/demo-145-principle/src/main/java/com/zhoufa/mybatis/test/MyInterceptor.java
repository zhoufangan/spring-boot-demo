package com.zhoufa.mybatis.test;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * @author Created by zhoufangan on 2017/5/20.
 */
// 注解里描述的是指定拦截方法的签名
// [type, method, args] （即对哪种对象的哪种方法进行拦截），它在拦截前用于决断。
@Intercepts(
        {
                @Signature(
                        type = Executor.class,
                        method = "update",
                        args = {MappedStatement.class, Object.class}
                )
        }
)
public class MyInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 是实现拦截逻辑的地方，内部要通过invocation.proceed()显式地推进责任链前进，
        // 也就是调用下一个拦截器拦截目标方法。
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        // 就是用当前这个拦截器生成对目标target的代理，
        // 实际是通过Plugin.wrap(target,this) 来完成的，把目标target和拦截器this传给了包装函数。
        // 从前面可以看出，每个拦截器的plugin方法是通过调用Plugin.wrap方法来实现的。
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
        // 用于设置额外的参数，参数配置在拦截器的Properties节点里。
    }
}
