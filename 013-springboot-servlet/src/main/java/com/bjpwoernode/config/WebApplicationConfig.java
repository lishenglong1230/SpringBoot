package com.bjpwoernode.config;

import com.bjpwoernode.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Lishenglong
 * @Date: 2022/1/30 17:57
 */

@Configuration
public class WebApplicationConfig {

    //定义方法 注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        //public ServletRegistrationBean(T servlet, String... urlMappings)
        //第一个参数是Servlet对象，第二个是url地址

        //ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/myservlet");


        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login","/test");// <url - pattern>
        return bean;

    }
}
