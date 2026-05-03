public class Main {
    public static void main(String[] args) {

        Delivery d1 = new FoodDelivery("Dina", 5);
        Delivery d2 = new GroceryDelivery("Dani", 8);
        Delivery d3 = new PharmacyDelivery("Sara", 3);

        Delivery[] deliveries = {d1, d2, d3};

        for (Delivery d : deliveries) {
            d.showInfo();
            d.deliver();
            System.out.println("Fee: " + d.calculateFee());
            System.out.println("-------------------");
        }
    }
}
