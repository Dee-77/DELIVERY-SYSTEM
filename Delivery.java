abstract class Delivery {
    protected String customerName;
    protected double distance;

    public Delivery(String customerName, double distance) {
        this.customerName = customerName;
        this.distance = distance;
    }

    public abstract double calculateFee();
    public abstract void deliver();

    public void showInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Distance: " + distance + " km");
    }
}
