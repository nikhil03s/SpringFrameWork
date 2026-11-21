package com.java.SpringJavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.SpringJavaBased.confug.AppJavaConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppJavaConfig.class);
    	Desktop dt=context.getBean(Desktop.class);
    	dt.compile();
    	Desktop dt2=context.getBean(Desktop.class);
    	dt2.compile();
    	
    	Alien al= context.getBean(Alien.class);
    	al.code();
    	
    }
}
