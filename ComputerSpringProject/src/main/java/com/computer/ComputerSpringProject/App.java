package com.computer.ComputerSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	Alien aliens=(Alien) context.getBean("alien");
    	aliens.code();
    	
        System.out.println( "Hello World!" );
    }
}
