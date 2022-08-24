package com.knightpearl.springCore.Demo3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/com/knightpearl/springCore/Demo3/applicationContext.xml");
       Bike obj=context.getBean("bike",Bike.class);
       System.out.println("BIKE Specification");
       System.out.println(obj.getName()+"   "+ obj.getColor()+"   "+obj.getPrice());
       
       Car obj1=(Car) context.getBean("car");
       System.out.println("\nCAR Specification");
       System.out.println(obj1.getName()+"   "+ obj1.getColor()+"   "+obj1.getPrice());
       
    }
}
