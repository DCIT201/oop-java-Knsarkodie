public class car extends Vehicle {
    private boolean hasGPS;

    public car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    
}
@Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (hasGPS ? 10 : 0);
    }
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
