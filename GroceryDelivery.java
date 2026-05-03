class GroceryDelivery extends Delivery {

    public GroceryDelivery(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public double calculateFee() {
        return 10 + (distance * 3);
    }

    @Override
    public void deliver() {
        System.out.println("Delivering groceries to " + customerName);
    }
}
