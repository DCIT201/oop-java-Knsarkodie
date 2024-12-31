 class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasHelmet) {
        super(vehicleId, model, baseRentalRate);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // Implement the calculateRentalCost method
    @Override
    public double calculateRentalCost(int days) {
        double cost = super.getBaseRentalRate() * days;  // Basic calculation (rate * days)
        if (!hasHelmet) {
            cost += 5.0;  // Add a surcharge if the motorcycle does not come with a helmet
        }
        return cost;
    }
}
