package com.springFrame.SpringProjectFirst;

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
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	Student student=(Student) context.getBean("stud");
        student.study();
        System.out.println(student.getAge());
        
        
      //  Books books= (Books) context.getBean("book");
        
//    	System.out.println( "Hello World!" );
    }
}
