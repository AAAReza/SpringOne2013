package com.incept5.interceptors;

/**
 * Created with IntelliJ IDEA.
 * User: John Thompson
 * Date: 9/9/13
 * Time: 12:55 PM
 */
public class DisableBrowserCachingInterceptor extends HandlerInterceptorAdapter {

    public void postHandle(final HttpServletRequest request, final HttpServletResponse response,
                           final Object handler, final ModelAndView modelAndView) {
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0
        response.setDateHeader("Expires", 0); // Proxies
    }
}
