/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conf;

import com.beans.Company;
import com.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Michael
 */
@Configuration
public class EmpConf {

    @Bean
    public Employee monty() {
        return new Employee(new Company("monty"));
    }
}
