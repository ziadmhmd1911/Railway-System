/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railwaysystem1;

/**
 *
 * @author Zeyad
 */
public class Driver extends Person{
    int id;
    private int numOfExperiences;
    private String nationality;

    public Driver(int numOfExperiences, String nationality, String name, int nationalId, String gender, int age) {
        super(name, nationalId, gender, age);
        this.id = 0;
        this.numOfExperiences = numOfExperiences;
        this.nationality = nationality;
    }
    public Driver(int id, int numOfExperiences, String nationality, String name, int nationalId, String gender, int age) {
        super(name, nationalId, gender, age);
        this.numOfExperiences = numOfExperiences;
        this.nationality = nationality;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getNumOfExperiences() {
        return numOfExperiences;
    }

    public String getNationality() {
        return nationality;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumOfExperiences(int numOfExperiences) {
        this.numOfExperiences = numOfExperiences;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
