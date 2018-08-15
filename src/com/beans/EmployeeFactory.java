/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author Michael
 */
public class EmployeeFactory {

    public Employee getEmployee() {
        Employee e = new Employee("Ayed", 2, 1.22, new Company("Arkedv"));
        return e;
    }
}
