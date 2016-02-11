package com.easysport.filter;

/**
 * @Author : sgkim
 * @Date : 2016-02-11
 * @Version : 1.0
 */

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Request filter to allow Cross-Origin Resource Sharing.
 */
public class SimpleCORSFilter implements Filter {

    // Configurable origin for CORS - default: * (all)
    @Value("${http.filter.cors.origin:*}")
    private String origin;

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse,
     *      javax.servlet.FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Access-Control-Allow-Origin", origin);
        chain.doFilter(request, res);
    }

    /**
     * @see javax.servlet.Filter#destroy()
     */
    @Override
    public void destroy() {
        // nop
    }

    /**
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // nop
    }

}