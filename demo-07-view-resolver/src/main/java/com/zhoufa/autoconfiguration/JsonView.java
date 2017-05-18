package com.zhoufa.autoconfiguration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/5.
 */
public class JsonView implements View {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        // 时间不设置: 返回long类型数,由js控制
        // mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
    }

    private String contentType = "application/json; charset=utf-8";

    @Override
    public String getContentType() {
        return this.contentType;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Object obj = model.get("resultModel");
        String json = mapper.writeValueAsString(obj);
        PrintWriter out = response.getWriter();
        out.write(json);
        out.flush();
        out.close();
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
