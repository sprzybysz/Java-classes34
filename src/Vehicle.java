public abstract class Vehicle {
    private int maxSpeed;
    private String color;

    private String model;

    public Vehicle(int maxSpeed, String color, String model) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void refuel();
}
