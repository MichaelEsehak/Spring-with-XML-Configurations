/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conf;

/**
 *
 * @author Michael
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import com.beans.Employee;
import com.beans.Company;
import java.util.Arrays;

import java.util.List;
import java.util.Properties;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@PropertySource("test.properties")
//@Import(EmpConf.class)
//@ImportResource("beans.xml")
@ComponentScan(basePackages = "com.beans")
public class AppConfiguration {

    @Value("${name}")
    private String name;
    @Value("${id}")
    private int id;
    @Value("${salary}")
    private double salary;

    private Company company;
    private List<String> roles;

    @Bean
    public Company testCompany() {
        return new Company("Test Company");
    }

    @Bean
    Properties dbProps() {
        Properties p = new Properties();
        
        p.setProperty("username", "sample");
        
        return p;
    }

    @Bean(name = {"michael"})
    public Employee employee5() {
        Employee e = new Employee();
        e.setId(id);
        e.setName(name);

        e.setSalary(salary);
        e.setCompany(new Company("Arkdev"));
        e.setRoles(Arrays.asList("pm", "Analyst"));
        return e;
    }
    @Value("#{dbProps.username}")String username;
    @Bean public  String testBean(){
        System.out.println("username:"+username);
        return "";
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurar() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
