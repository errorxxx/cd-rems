package com.cd.rems;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
 * @Author 谢修继
 * @Description
 * @Date 2019/11/12 19:48
 **/
@Configuration
public class IndexView implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/main.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

     @Override
     public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(new SessionHandlerInterceptor());
     }
     private class SessionHandlerInterceptor implements HandlerInterceptor {
         @Override
         public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

//             Object user = request.getSession().getAttribute("user");
//             if (user == null) {
//                 try {
//                     response.sendRedirect("/login");
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 return false;
//
//             }
             return true;
         }

         @Override
         public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
             //controller方法处理完毕后，调用此方法
         }

         @Override
         public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
             //页面渲染完毕后调用此方法
         }
     }
}
