package main.vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int dist = 252;

        minivan.passaengers = 7;
        minivan.fuelcup = 16;
        minivan.mpg = 21;

        sportcar.passaengers = 2;
        sportcar.fuelcup = 14;
        sportcar.mpg = 12;


        System.out.println("Minivan can carry " + minivan.passaengers +
                " passengers to distance " + minivan.range() + " miles");
        System.out.println("Minivan need " + minivan.fuelneeded(dist) +
                " for distance " + dist + " miles");

        System.out.println("Sportcar can carry " + sportcar.passaengers +
                " passengers to distance " + sportcar.range() + " miles");
        System.out.println("Sportcar need " + sportcar.fuelneeded(dist) +
                " for distance " + dist + " miles");
    }
}
