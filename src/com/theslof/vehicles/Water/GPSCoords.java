package com.theslof.vehicles.Water;

public class GPSCoords {
    private int degreesLat;
    private int minutesLat;
    private int secondsLat;
    private int degreesLon;
    private int minutesLon;
    private int secondsLon;

    public GPSCoords() {

    }

    public GPSCoords(int dla, int mla, int sla, int dlo, int mlo, int slo) {
        setDegreesLat(dla);
        setMinutesLat(mla);
        setSecondsLat(sla);
        setDegreesLon(dlo);
        setMinutesLon(mlo);
        setSecondsLon(slo);
    }

    public int getDegreesLat() {
        return degreesLat;
    }

    public void setDegreesLat(int degreesLat) {
        this.degreesLat = degreesLat;
    }

    public int getMinutesLat() {
        return minutesLat;
    }

    public void setMinutesLat(int minutesLat) {
        this.minutesLat = minutesLat;
    }

    public int getSecondsLat() {
        return secondsLat;
    }

    public void setSecondsLat(int secondsLat) {
        this.secondsLat = secondsLat;
    }

    public int getDegreesLon() {
        return degreesLon;
    }

    public void setDegreesLon(int degreesLon) {
        this.degreesLon = degreesLon;
    }

    public int getMinutesLon() {
        return minutesLon;
    }

    public void setMinutesLon(int minutesLon) {
        this.minutesLon = minutesLon;
    }

    public int getSecondsLon() {
        return secondsLon;
    }

    public void setSecondsLon(int secondsLon) {
        this.secondsLon = secondsLon;
    }

    @Override
    public String toString() {
        return "[" + degreesLat + "° " + minutesLat + "\' " + secondsLat + "\" N "
                + degreesLon + "° " + minutesLon + "\' " + secondsLon + "\" W]";
    }
}
