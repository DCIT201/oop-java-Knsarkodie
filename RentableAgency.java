import java.util.ArrayList;
import java.util.List;

class RentalAgency {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equalsIgnoreCase(model) && vehicle.isAvailable()) {
                return vehicle;
            }
        }
        return null;
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (vehicle != null && vehicle.isAvailable()) {  // Check if the vehicle is available using isAvailable
            vehicle.setAvailable(false);
            System.out.println(customer.getName() + " rented " + vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ") for " + days + " days at GH₵" + vehicle.calculateRentalCost(days) + ".");
        } else {
            System.out.println("Vehicle not available.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.setAvailable(true);
            System.out.println(vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ") returned successfully.");
        }
    }
}
