package com.retro.rest;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

public class EmbeddedServletContainerCustomizer implements
WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
	 public void customize(ConfigurableServletWebServerFactory factory) {
		 if(System.getenv("PORT")!=null)
	        factory.setPort(Integer.parseInt(System.getenv("PORT")));
	      factory.setContextPath("");
	     }

}
