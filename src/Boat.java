public class Boat extends Vehicle {

    private String name = "boat";
    private int crewNumber;

    public Boat(int maxSpeed, String color, String model,  int crewNumber) {
        super(maxSpeed, color, model);
        this.name = name;
        this.crewNumber = crewNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrewNumber() {
        return crewNumber;
    }

    public void setCrewNumber(int crewNumber) {
        this.crewNumber = crewNumber;
    }

    @Override
    public void startEngine() {
        System.out.println(System.out.printf("The %s %s starts.", name, super.getModel()));
    }

    @Override
    public void stopEngine() {
        System.out.println(System.out.printf("The %s %s stops.", name, super.getModel()));
    }

    @Override
    public void refuel() {

    }
}
