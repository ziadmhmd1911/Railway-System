/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railwaysystem1;

/**
 *
 * @author Zeyad
 */
public class Person {
  private String name;
  private int nationalId;
  private String gender;
  private int age;

    public Person(String name, int nationalId, String gender, int age) {
        this.name = name;
        this.nationalId = nationalId;
        this.gender = gender;
        this.age = age;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    protected void setGender(String gender) {
        this.gender = gender;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected int getNationalId() {
        return nationalId;
    }

    protected String getGender() {
        return gender;
    }

    protected int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\nNational Id : "+nationalId+"\nGender : "+gender+"\nAge : "+age+"\n";
    }
  
}

