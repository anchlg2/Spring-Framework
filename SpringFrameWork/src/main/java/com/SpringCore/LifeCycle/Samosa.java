package com.SpringCore.LifeCycle;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    public Samosa(double price) {
        super();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init()
    {
        System.out.println("Init method");
    }
    public void destroy()
    {
        System.out.println("Destroy method");
    }

}
