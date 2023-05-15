package com.genn.test_demo.filter;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Component
public class AuthFilter extends OncePerRequestFilter {

    public static final String HEADER_NAME = "token";

    public static final Set<String> WHITE_LIST = new HashSet<>();

    static {
        WHITE_LIST.add("/handler/login");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String token = request.getHeader(HEADER_NAME);
        for (String x : WHITE_LIST) {
            if (!requestURI.contains(x) && !StringUtils.hasLength(token)) {
                response.setCharacterEncoding("UTF-8");
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().write("{\"code\":\"500\",\"message\":\"无权限\"}");
                return;
            }
        }
        filterChain.doFilter(request, response);
    }
}
