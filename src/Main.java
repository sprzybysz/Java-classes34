public class Main {
    public static void main(String[] args) {
        PassengerCar mazda = new PassengerCar(210, "silver", "cx");
        Boat titanic = new Boat(50, "black", "", 100);
        System.out.println(mazda.toString());
        mazda.activatePremiumFeatures();
        System.out.println(mazda.toString());
        System.out.println(mazda.getMaxSpeed());
        System.out.println(titanic.getMaxSpeed());
    }
}