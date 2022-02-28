package main.vehicle;

public class Vehicle {
    int passaengers;
    int fuelcup;
    int mpg; // ml per gal

    public Vehicle(int passaengers, int fuelcup, int mpg) {
        this.passaengers = passaengers;
        this.fuelcup = fuelcup;
        this.mpg = mpg;
    }

    int range() {
        return fuelcup * mpg;
    }

    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}
