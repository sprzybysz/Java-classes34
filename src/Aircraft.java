public class Aircraft extends Vehicle {
    private String name = "aircraft";

    public Aircraft(int maxSpeed, String color, String name, String model) {
        super(maxSpeed, color, model);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void startEngine() {
        System.out.printf("The %s %s takes off.", name, super.getModel());
    }

    @Override
    public void stopEngine() {
        System.out.printf("The %s %s lands.", name, super.getModel());
    }

    @Override
    public void refuel() {

    }
}
