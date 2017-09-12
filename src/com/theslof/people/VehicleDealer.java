package com.theslof.people;

import com.theslof.Person;
import com.theslof.Vehicle;

public class VehicleDealer extends Person {
    public VehicleDealer(){
        setProfession("Vehicle dealer");
    }
    public void sellVehicle(Person buyer, Vehicle vehicle){
        Person seller = vehicle.getOwner();
        buyer.setBankBalance(buyer.getBankBalance() - vehicle.getPrice());
        int cut = (int)(vehicle.getPrice() * 0.1);
        seller.setBankBalance(seller.getBankBalance() + vehicle.getPrice() - cut);
        this.setBankBalance(this.getBankBalance() + cut);
        vehicle.setOwner(buyer);
    }
}
