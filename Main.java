public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Add Vehicles
        agency.addVehicle(new car("C01", "Sedan", 50.0, true));
        agency.addVehicle(new Motorcycle("M01", "Sport", 30.0, true));
        agency.addVehicle(new Truck("T01", "Cargo", 100.0, 2000));

        // Add a Customer
        Customer customer = new Customer("CU01", "John Doe");

        // Rent a Vehicle
        Vehicle vehicle = agency.findAvailableVehicle("Sedan");
        agency.rentVehicle(customer, vehicle, 5);

        // Return the Vehicle
        agency.returnVehicle(vehicle);
    }
}
