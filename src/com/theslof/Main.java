package com.theslof;

import com.theslof.people.Buyer;
import com.theslof.people.Seller;
import com.theslof.people.VehicleDealer;
import com.theslof.vehicles.Flying.Airplane;
import com.theslof.vehicles.Land.Car;
import com.theslof.vehicles.Flying.Helicopter;

public class Main {

    public static void main(String[] args) {
        Buyer b1 = new Buyer();
        b1.setName("Richy Rich");
        b1.setAge(13);
        b1.setBankBalance(150000000.0);
        Buyer b2 = new Buyer();
        b2.setName("Scrooge McDuck");
        b2.setAge(67);
        b2.setBankBalance(4000000000.0);
        Buyer b3 = new Buyer();
        b3.setName("Red Neck");
        b3.setAge(42);
        b3.setBankBalance(5000.0);
        Seller s1 = new Seller();
        s1.setName("Slick");
        s1.setAge(36);
        s1.setBankBalance(23000.0);
        Seller s2 = new Seller();
        s2.setName("\'Fingers\' Johnson");
        s2.setAge(53);
        s2.setBankBalance(13000.0);
        VehicleDealer dealer = new VehicleDealer();
        dealer.setName("Chuck Jones");
        dealer.setAge(48);
        dealer.setBankBalance(50.0);

        Airplane plane = new Airplane();
        plane.setOwner(s1);
        plane.setPrice(30000);
        plane.setWeight(1500);

        Helicopter heli = new Helicopter();
        heli.setOwner(s1);
        heli.setPrice(75000);
        heli.setWeight(500);

        Car car = new Car();
        car.setOwner(s2);
        car.setWeight(2000);
        car.setPrice(4000);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(dealer);

        System.out.println("\n" +b1.getName() + " is buying the airplane from " + plane.getOwner().getName() + " for $" + plane.getPrice());
        dealer.sellVehicle(b1, plane);
        System.out.println(b2.getName() + " is buying the helicopter from " + heli.getOwner().getName() + " for $" + heli.getPrice());
        dealer.sellVehicle(b2, heli);
        System.out.println(b3.getName() + " is buying the car from " + car.getOwner().getName() + " for $" + car.getPrice() + "\n");
        dealer.sellVehicle(b3, car);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(dealer);
    }
}
