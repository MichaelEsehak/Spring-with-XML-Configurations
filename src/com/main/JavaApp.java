/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

/**
 *
 * @author Michael
 */
import com.beans.Employee;
import com.conf.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initThroughJavaConf();
    }

    public static void initThroughJavaConf() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Employee e = context.getBean("michael2", Employee.class);
        System.out.println(e);
    }

    public static void initThroughXml() {
        // TODO code application logic here
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        //Resource r=context.getResource("beans.xml");
        //Employee e=(Employee)r.getBean("employee");
        Employee e = (Employee) context.getBean("michael2");
        System.out.println(e.toString());
        context.close();
//        Singleton s=(Singleton)context.getBean("singleton");
//        System.out.println(s.getName());
    }

}
