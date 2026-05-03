class PharmacyDelivery extends Delivery {

    public PharmacyDelivery(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public double calculateFee() {
        return 15 + (distance * 4);
    }

    @Override
    public void deliver() {
        System.out.println("Delivering medicine to " + customerName);
    }
}
