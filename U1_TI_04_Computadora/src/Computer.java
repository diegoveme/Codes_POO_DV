public class Computer{
    private String brand;
    private String model;
    private boolean isOn;

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("The computer is now ON.");
        }
    }
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("The computer is now OFF.");
        }
    }
}