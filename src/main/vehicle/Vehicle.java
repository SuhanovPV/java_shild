package main.vehicle;

public class Vehicle {
    int passaengers;
    int fuelcup;
    int mpg; // ml per gal

    int range() {
        return fuelcup * mpg;
    }

    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}
