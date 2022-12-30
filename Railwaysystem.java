/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.railwaysystem1;

/**
 *
 * @author Zeyad
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ahmed
 */

public class Railwaysystem {
    //String path = "D:\file";
    //Read Trip Data
    public static ArrayList<Trip> readtrip(String path,ArrayList<Driver> d) throws IOException
    {
        ArrayList<Trip> tempTs = new ArrayList<>();
        File myfile = new File("D:/file/Trip.txt");
        Scanner scanner = new Scanner(myfile);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            Scanner linescanner=new Scanner(line);
            linescanner.useDelimiter(",");
            String nooftrip;
            String Date;
            int id;
            int mx;
            String source;
            String dest;
            int towingcarsno;
            String time;
            while (linescanner.hasNext())
            {
                nooftrip = linescanner.next();
                Date = linescanner.next();
                id = Integer.parseInt(linescanner.next());
                mx = Integer.parseInt(linescanner.next());
                source = linescanner.next();
                dest = linescanner.next();
                towingcarsno = Integer.parseInt(linescanner.nextLine());
                time = linescanner.next();
                ArrayList<Driver> tempD = new ArrayList<>();
                for (Driver driver: d)
                {
                    if (driver.id==id)
                    {
                        tempD.add(driver);
                    }
                }
                //String numOfTrip, String idOfDriver, String date, int maxNumOfPassengers, String time, String source, String destination, int towingCarts
                Trip tNew = new Trip(nooftrip , id , Date , mx , time , source , dest , towingcarsno);
                tempTs.add(tNew);
            }
        }
        scanner.close();
        return tempTs;
    }
    //Read Driver Data
    public static ArrayList<Driver> readDriver(String path)throws IOException
    {
        ArrayList<Driver> tempDrivers= new ArrayList<>();
        File myfile = new File("D:/file/Driver.txt");
        Scanner scanner = new Scanner(myfile);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            int ExperiecneYears,NationalId,id,age;
            String Nationality,name,gender;
            while (lineScanner.hasNext())
            {
                ExperiecneYears = Integer.parseInt(lineScanner.next());
                NationalId = Integer.parseInt(lineScanner.next());
                id = Integer.parseInt(lineScanner.next());
                Nationality = lineScanner.next();
                name = lineScanner.next();
                gender = lineScanner.next();
                age = Integer.parseInt(lineScanner.next());
                //int id, int numOfExperiences, String nationality, String name, int nationalId, String gender, int age
                Driver nw = new Driver(ExperiecneYears,Nationality,name,NationalId,gender,age);
            }
        }
        scanner.close();
        return tempDrivers;
    }
    //Read Passenger Data
    public static ArrayList<Passenger> readPassenger(String path, ArrayList<Trip> ts)throws IOException
    {
        ArrayList<Passenger> tempPE=new ArrayList<>();
        ArrayList<Trip> tempTs=new ArrayList<>();
        File myfile=new File("D:/file/Passenger.txt");
        Scanner sc = new Scanner(myfile);
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            //String nationality, int numoftrip, String name, int nationalId, String gender, int age
            String Nationality,Name,Gender;
            int nationalId,age,numoftrip;
            Nationality = sc.next();
            Name = sc.next();
            Gender = sc.next();
            nationalId = Integer.parseInt(sc.next());
            age = Integer.parseInt(sc.next());
            numoftrip = Integer.parseInt(sc.next());
            //String nationality, int numoftrip, String name, int nationalId, String gender, int age
            Passenger temppassenger = new Passenger(Nationality,numoftrip,Name,nationalId,Gender,age);
            for (Trip t: ts)
            {
                if (t.getNumOfTrip().equals(numoftrip))
                {
                    tempTs.add(t);
                }
            }
            temppassenger.trip=tempTs;
            tempPE.add(temppassenger);
        }
        sc.close();
        return tempPE;
    }
    //Write Trip Data
    public static void updateTrip (String path, ArrayList<Trip> ts) throws IOException
    {
        File obj=new File("D:/file/Trip.txt");
        obj.delete();
        obj.createNewFile();
        FileWriter fw = new FileWriter("D:/file/Trip.txt");
        for (Trip trip : ts)
        {
            String data = trip.getDate()+','+trip.getNumOfTrip();
            fw.write(data+'\n');
        }
        fw.close();
    }
    
    public static void main(String[] args) throws IOException {
        //Paths
        String Trippath="D:/file/Trip.txt";
        String Driverpath="D:/file/Driver.txt";
        String Passengerpath="D:/file/Passenger.txt";
        //Drivers
        ArrayList<Driver> drivers=readDriver(Driverpath);
        //Trips
        ArrayList<Trip> alltrips=readtrip(Trippath, drivers);
        //Store data of passengers
        ArrayList<Passenger> passengerss=readPassenger(Passengerpath, alltrips);
        Scanner scanner=new Scanner(System.in);
        boolean start=true;
        while (start)
        {
            System.out.println("1)offer trip\n2)add passenger to trip\n3)remove passenger from trip\n4)av of passenger in trip\n");
            int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter Trip NumOfTrip: :");
            String nooftrip = scanner.next();
            System.out.println("Enter Driver Id :");
            int driverid = scanner.nextInt();
            System.out.println("Enter Trip Date");
            String Date = scanner.nextLine();
            System.out.println("Max.no of Passengers");
            int mx = scanner.nextInt();
            System.out.println("Enter Time of trip.");
            String time = scanner.nextLine();
            System.out.println("Enter Trip Source");
            String source = scanner.nextLine();
            System.out.println("Enter Trip dest");
            String dest = scanner.nextLine();
            System.out.println("Enter Towing Cars no.");
            int towingcarsno = scanner.nextInt();
            //create trip
            Trip tNew = new Trip(nooftrip,driverid,Date,mx,time,source,dest,towingcarsno);
            
            alltrips.add(tNew);
            updateTrip("D:/file/Trip.txt", alltrips);
            //add driver to trip
            break;
            case 2:
            //int id, int numOfExperiences, String nationality, String name, int nationalId, String gender, int age
            int id = scanner.nextInt();
            int numofexp = scanner.nextInt();
            int natid = scanner.nextInt();
            int age = scanner.nextInt();
            String nation = scanner.next();
            String name = scanner.next();
            String gender = scanner.next();
            Driver Tnew = new Driver(id , numofexp , nation , name , natid , gender , age);
            drivers.add(Tnew);
            break;
        } 
            break;
        }
    }
}
    

