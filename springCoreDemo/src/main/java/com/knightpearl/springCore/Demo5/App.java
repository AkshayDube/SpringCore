package com.knightpearl.springCore.Demo5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/knightpearl/springCore/Demo5/applicationContext.xml");
       Student obj=context.getBean("student",Student.class);
       System.out.println("Student Details");
       System.out.println(obj);
       
       Child obj1=context.getBean("child",Child.class);
       System.out.println("\nChildren Details");
       System.out.println(obj1);
       
    }
}
