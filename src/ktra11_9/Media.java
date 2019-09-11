package ktra11_9;

public class Media {
    protected String Name;
    protected double price;

    public Media(String name, double price) {
        this.Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
