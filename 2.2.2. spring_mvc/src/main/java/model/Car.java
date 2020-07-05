package model;

public class Car {

    private String model;
    private String owner;
    private long price;

    public Car() {
    }

    public Car(String model, String owner, long price) {
        this.model = model;
        this.owner = owner;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}