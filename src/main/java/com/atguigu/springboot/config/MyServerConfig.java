package com.atguigu.springboot.config;

import com.atguigu.springboot.filter.MyFilter;
import com.atguigu.springboot.listener.MyListener;
import com.atguigu.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyServerConfig {
    ServletRegistrationBean servletBean;
    //注册三大组件
    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet = new MyServlet();
        servletBean = new ServletRegistrationBean(myServlet,"/myServlet");
        servletBean.setLoadOnStartup(1);
        return servletBean;
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter = new MyFilter();
        FilterRegistrationBean filterBean = new FilterRegistrationBean();
        filterBean.setFilter(myFilter);
        filterBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filterBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<MyListener> listenerBean = new ServletListenerRegistrationBean<>(new MyListener());
        return listenerBean;
    }

}
