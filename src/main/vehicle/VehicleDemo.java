package main.vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        int dist = 252;
        double gallons;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Minivan can carry " + minivan.passaengers +
                " passengers to distance " + minivan.range() + " miles");
        System.out.println("Minivan need " + gallons +
                " for distance " + dist + " miles\n");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("Sportcar can carry " + sportcar.passaengers +
                " passengers to distance " + sportcar.range() + " miles");
        System.out.println("Sportcar need " + gallons +
                " for distance " + dist + " miles\n");
    }
}
