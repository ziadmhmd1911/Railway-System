/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railwaysystem1;

import java.util.ArrayList;

/**
 *
 * @author Zeyad
 */
public class Trip {
    private String numOfTrip;

//    public void setPassengers(ArrayList<Passenger> passengers) {
//        this.passengers = passengers;
//    }
//
//    public ArrayList<Passenger> getPassengers() {
//        return passengers;
//    }
    private int idOfDriver;
    private String date;
    private int maxNumOfPassengers;
    private String time;
    private String source;
    private String destination;
    private int towingCarts;
    private ArrayList<Driver>drivers;

    public Trip(String numOfTrip, int idOfDriver, String date, int maxNumOfPassengers, String time, String source, String destination, int towingCarts, ArrayList<Driver> drivers) {
        this.numOfTrip = numOfTrip;
        this.idOfDriver = idOfDriver;
        this.date = date;
        this.maxNumOfPassengers = maxNumOfPassengers;
        this.time = time;
        this.source = source;
        this.destination = destination;
        this.towingCarts = towingCarts;
        this.drivers = drivers;
    }
    public Trip(String numOfTrip, int idOfDriver, String date, int maxNumOfPassengers, String time, String source, String destination, int towingCarts) {
        this.numOfTrip = numOfTrip;
        this.idOfDriver = idOfDriver;
        this.date = date;
        this.maxNumOfPassengers = maxNumOfPassengers;
        this.time = time;
        this.source = source;
        this.destination = destination;
        this.towingCarts = towingCarts;
        this.drivers = new ArrayList<>();
    }
//    public void addtrip(Passenger t1)
//    {
//        this.passengers.add(t1);
//    }
//    public void addpassenger(Passenger p1)
//    {
//        passengers.add(p1);
//    }
//    public void removepassenger(Passenger p2)
//    {
//        passengers.remove(p2);
//    }
    public void addDriver(Driver d1)
    {
        this.drivers.add(d1);
    }
    public String getNumOfTrip() {
        return numOfTrip;
    }

    public int getIdOfDriver() {
        return idOfDriver;
    }

    public String getDate() {
        return date;
    }

    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    public String getTime() {
        return time;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getTowingCarts() {
        return towingCarts;
    }

    public void setNumOfTrip(String numOfTrip) {
        this.numOfTrip = numOfTrip;
    }

    public void setIdOfDriver(int idOfDriver) {
        this.idOfDriver = idOfDriver;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMaxNumOfPassengers(int maxNumOfPassengers) {
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTowingCarts(int towingCarts) {
        this.towingCarts = towingCarts;
    }
}