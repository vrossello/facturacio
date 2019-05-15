
package org.sito.facturacio.config.core;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
  
public class SpringMVCInitializer implements WebApplicationInitializer {

	
	public void onStartup(ServletContext servletContext) throws ServletException {        
		AnnotationConfigWebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        Dynamic servletDispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        servletDispatcher.setLoadOnStartup(1);
        servletDispatcher.addMapping("/");          
    } 
	
	 private AnnotationConfigWebApplicationContext getContext() {
	        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	       
	        context.setConfigLocation(org.sito.facturacio.config.AppConfig.class.getPackage().getName());
	        return context;
	    }
	
	

}
