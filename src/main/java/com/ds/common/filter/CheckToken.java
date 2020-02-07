package com.ds.common.filter;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.ds.common.enums.StatusCodeEnum;
import com.ds.common.util.ResultData;
import com.ds.common.util.SignUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @author : sunpx
 * @desc : 验证token
 * @date : 2020/02/07 18:17:00
 * @params : null
 * @return :
 */

@Slf4j
@Component
@WebFilter(value = "/*")
public class CheckToken implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String token = req.getHeader("token");
        if (token != null) {
            log.info("auth success");

            if (SignUtil.isToken(token)) {
                Cookie cookie = new Cookie("token", SignUtil.getToken());
                cookie.setPath("/");
                cookie.setMaxAge(60 * 60);
                response.addCookie(cookie);
                filterChain.doFilter(req, response);
            }
            erreAll(servletResponse);
        } else {
            erreAll(servletResponse);
        }

    }

    private void erreAll(ServletResponse servletResponse) throws IOException {
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("application/json; charset=utf-8");
        PrintWriter out = servletResponse.getWriter();
        ResultData resultData = new ResultData(StatusCodeEnum.TOKEN_LAPSE.getCode(), "token出错");
        JSONObject jsonObject = JSONUtil.parseObj(resultData);

        out.append(jsonObject.toString());
    }

}
