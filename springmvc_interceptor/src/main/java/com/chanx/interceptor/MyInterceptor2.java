package com.chanx.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor2 implements HandlerInterceptor {

    /**
     * 预处理，controller方法执行前执行,return true 表示放行， return false表示不放行。
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor2::preHandle执行了");
        // 请求转发
//        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);
        return true;
    }

    /**
     * controller处理后方法，success.jsp执行前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor2::postHandle执行了");
//        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);
        /**
         * result：
         * MyInterceptor1::preHandle执行了
         * testInterceptor执行了
         * MyInterceptor1::postHandle执行了
         * success.jsp执行了...
         * */
    }

    /**
     * success.jsp方法执行后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor2::afterCompletion执行了");
    }
}
/**
 * result:
 * MyInterceptor1::preHandle执行了
 * MyInterceptor2::preHandle执行了
 * testInterceptor执行了
 * MyInterceptor2::postHandle执行了
 * MyInterceptor1::postHandle执行了
 * success.jsp执行了...
 * MyInterceptor2::afterCompletion执行了
 * MyInterceptor1::afterCompletion执行了
 */
