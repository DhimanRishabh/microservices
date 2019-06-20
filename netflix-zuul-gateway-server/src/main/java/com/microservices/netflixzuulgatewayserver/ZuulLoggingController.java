package com.microservices.netflixzuulgatewayserver;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


public class ZuulLoggingController extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(ZuulLoggingController.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        log.warn("requested url is -> {" + request.getRequestURI() + "}");
        return null;
    }
}
