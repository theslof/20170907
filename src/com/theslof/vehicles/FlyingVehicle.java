package com.theslof.vehicles;

import com.theslof.Vehicle;

public class FlyingVehicle extends Vehicle {
    private int altitude;

    public void fly(boolean isFlying) {
        if (!isFlying) {
            setAltitude(0);
        } else {
            setAltitude((int) (getAltitude() + Math.random() * 50));
        }
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
