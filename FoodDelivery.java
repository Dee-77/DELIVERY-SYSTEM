class FoodDelivery extends Delivery {

    public FoodDelivery(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public double calculateFee() {
        return 20 + (distance * 5);
    }

    @Override
    public void deliver() {
        System.out.println("Delivering hot food to " + customerName);
    }
}
