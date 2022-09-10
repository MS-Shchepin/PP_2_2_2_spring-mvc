package web.model;


public class Car {
    private String brand;
    private String model;
    private CarColor color;

    public Car() {
    }

    public Car(String brand, String model, CarColor color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public enum CarColor {
        BLACK, WHITE, RED, GREEN, BLUE
    }
}
