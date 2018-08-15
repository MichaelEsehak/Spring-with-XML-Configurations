/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 *
 * @author Michael
 */
public class SpringEmployeeFactory implements FactoryBean<Employee> {

   private Employee e = new Employee("Mina", 2, 1.22, new Company("Arkedv"));

    public Employee getObject() {

        return e;
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
