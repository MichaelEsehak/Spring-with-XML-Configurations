/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import org.springframework.stereotype.Component;

/**
 *
 * @author Michael
 */
@Component
public class Company {

    private String name;

    public Company(){
        this.name="new Company";
    }
    public Company (String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Company: "+this.name;
    }
}
