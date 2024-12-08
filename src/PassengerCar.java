import java.util.Objects;

public class PassengerCar extends Vehicle implements PremiumVersion {
    private String name = "passenger car";
    private boolean premiumActive;

    public PassengerCar(int maxSpeed, String color, String model) {
        super(maxSpeed, color, model);
        this.name = name;
        this.premiumActive = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void startEngine() {
        System.out.printf("The %s %s starts.", name, super.getModel());
    }

    @Override
    public void stopEngine() {
        System.out.printf("The %s %s stops.", name, super.getModel());
    }

    @Override
    public void refuel() {

    }

    @Override
    public void activatePremiumFeatures() {
        premiumActive = true;
        System.out.println("Funkcje premium zostały aktywowane.");
    }

    @Override
    public boolean isPremiumActive() {
        return premiumActive;
    }

    @Override
    public void activateParkingAssistant() {
        if (premiumActive) {
            System.out.println("Asystent parkowania został aktywowany.");
        } else {
            System.out.println("Aktywuj funkcje premium, aby korzystać z asystenta parkowania.");
        }
    }

    @Override
    public void activateSeatMassage() {
        if (premiumActive) {
            System.out.println("System masażu w fotelach został uruchomiony.");
        } else {
            System.out.println("Aktywuj funkcje premium, aby korzystać z systemu masażu.");
        }
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "name='" + name + '\'' +
                ", premiumActive=" + premiumActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerCar that = (PassengerCar) o;
        return premiumActive == that.premiumActive && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, premiumActive);
    }
}
