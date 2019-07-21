/*
 * package com.retro.rest;
 * 
 * import
 * org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
 * import org.springframework.boot.web.server.WebServerFactoryCustomizer; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class EmbeddedServletContainerCustomizer implements
 * WebServerFactoryCustomizer<TomcatServletWebServerFactory> { public void
 * customize(TomcatServletWebServerFactory factory) {
 * if(System.getenv("PORT")!=null)
 * factory.setPort(Integer.parseInt(System.getenv("PORT")));
 * factory.setContextPath(""); }
 * 
 * }
 */