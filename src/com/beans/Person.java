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
public abstract class Person {

    private String name;
    private int id;

    public Person() {

    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        System.out.println("2");
        this.name = name;
    }

    public void setId(int id) {
        System.out.println("3");
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Id: "+this.id+" - Name: "+this.name;
    }

}
