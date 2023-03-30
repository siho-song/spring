package com.example.filter.fillter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@Slf4j
//@Component
@WebFilter(urlPatterns = "/api/user/*")
public class GlobarFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //전처리
//        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
//        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
        ContentCachingRequestWrapper httpServletRequest = new ContentCachingRequestWrapper((HttpServletRequest)request);
        ContentCachingResponseWrapper httpServletResponse = new ContentCachingResponseWrapper((HttpServletResponse)response);
        String url = httpServletRequest.getRequestURI();

//        BufferedReader br = httpServletRequest.getReader();
//        br.lines().forEach(line->{
//            log.info("url : {}, line : {} ",url, line);
//        });
//        body에 대한 내용을 한번읽어버렸기 때문에 dispatcherservlet 에서 읽을 바디가 남아있지 않음 ( 커서가 젤 오른쪽으로 향해있기 때문에 )
        chain.doFilter(httpServletRequest,httpServletResponse);
//
        String reqContent = new String(httpServletRequest.getContentAsByteArray(),"UTF-8");
        log.info("request url : {} , request body : {}", url , reqContent);
//
        String resContent = new String(httpServletResponse.getContentAsByteArray(),"UTF-8");
        int httpStatusCode = httpServletResponse.getStatus();
//
        httpServletResponse.copyBodyToResponse();
//
        log.info("response status : {} , responseBody: {}",httpStatusCode,resContent);


    }
}
