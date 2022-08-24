package com.knightpearl.springCore.Demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/com/knightpearl/springCore/Demo2/applicationContext.xml");
       Car obj=context.getBean("car",Car.class);
       System.out.println("CAR Specification");
       System.out.println(obj.getName()+"   "+ obj.getColor()+"   "+obj.getPrice());
       
       Bike obj1=(Bike) context.getBean("bike");
       System.out.println("\nBike Specification");
       System.out.println(obj1.getName()+"   "+ obj1.getColor()+"   "+obj1.getPrice());
       
    }
}
