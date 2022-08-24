package com.knightpearl.springCore.Demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/com/knightpearl/springCore/Demo1/applicationContext.xml");
       Coach obj=(Coach) context.getBean("hockeyCoach");
       obj.getDailyWorkout();
    }
}
