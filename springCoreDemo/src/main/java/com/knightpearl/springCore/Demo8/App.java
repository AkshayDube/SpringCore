package com.knightpearl.springCore.Demo8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
       ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/knightpearl/springCore/Demo8/applicationContext.xml");
       Laptop obj=context.getBean("laptop",Laptop.class);
       System.out.println(obj);
       
       Laptop obj1=context.getBean("laptop",Laptop.class);
       System.out.println(obj1);
       
       System.out.println("Hash code for first Laptop is "+obj.hashCode());
       System.out.println("Hash code for second Laptop is "+obj1.hashCode());
    }
}
