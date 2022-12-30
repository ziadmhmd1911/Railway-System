/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railwaysystem1;

/**
 *
 * @author Zeyad
 */
import java.util.ArrayList;
public class Passenger extends Person{
    private String nationality;
    private int numoftrip;
    ArrayList<Trip> trip;
    public Passenger(String nationality, int numoftrip, String name, int nationalId, String gender, int age) {
        super(name, nationalId, gender, age);
        this.nationality = nationality;
        this.numoftrip = numoftrip;
        this.trip = new ArrayList<>();
    }
    
//    public Passenger (String nationality , int numoftrip)
//    {
//        this.nationality = nationality;
//        this.numoftrip=numoftrip;
//        this.trip = new ArrayList<>();
//    }

    public void addTrip(Trip t1)
    {
        this.trip.add(t1);
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setNumoftrip(int numoftrip) {
        this.numoftrip = numoftrip;
    }

    public String getNationality() {
        return nationality;
    }

    public int getNumoftrip() {
        return numoftrip;
    }
}
