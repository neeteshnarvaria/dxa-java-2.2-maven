package com.sdl.tridiondxa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import static com.sdl.webapp.common.util.InitializationUtils.loadActiveSpringProfiles;
import static com.sdl.webapp.common.util.InitializationUtils.registerListener;
import static com.sdl.webapp.common.util.InitializationUtils.registerServlet;

/**
 * Initializes the web application instead of <code>web.xml</code>.
 */
@Slf4j
@SpringBootApplication
public class WebAppInitializer {
    public static void main(String[] args) { //NOSONAR
        SpringApplication.run(WebAppInitializer.class, args);
    }
}
