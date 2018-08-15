/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.util.List;
import java.util.logging.Logger;
//import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Michael
 */

@Component(value = "michael2")
public class Employee extends Person {

    private double salary;

    private Company company;
    private List<String> roles;
    private Logger logger = Logger.getLogger("Test");

    public Employee() {
        System.out.println("empty");
    }

   @Autowired
    public Employee(@Qualifier("testCompany")Company company) {
        System.out.println("1");
        this.company = company;
    }

    public Employee(String name, int id, double salary, Company company) {
        super(name, id);
        this.salary = salary;
        this.company = company;
    }

    public double getSalary() {
        return salary;

    }

    public void setSalary(double salary) {
        System.out.println("4");
        this.salary = salary;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setRoles(List<String> roles) {
        System.out.println("5");
        this.roles = roles;
    }

    public List<String> getRoles() {
        return this.roles;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("6");
    }

    public void initMethod2() {
        System.out.println("mmm");
    }

    @PreDestroy
    private void destory() {
        System.out.println("7");
    }

    @Override
    public String toString() {
        System.out.println(roles);
        return super.toString()
                + " - Salary: " + this.salary + " - "
                + this.company.toString();
    }

}
