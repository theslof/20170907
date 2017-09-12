package com.theslof.vehicles;

import com.theslof.Vehicle;

public class LandVehicle extends Vehicle {
    private int km;

    public void drive(int distance) {
        setKm(getKm() + distance);
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
