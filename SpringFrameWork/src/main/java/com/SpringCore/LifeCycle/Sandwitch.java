package com.SpringCore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sandwitch {
    private int price;

    public Sandwitch() {
        super();
    }

    public Sandwitch(int price) {
        super();
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sandwitch{" +
                "price=" + price +
                '}';
    }
    @PostConstruct
public void init()
{
    System.out.println("init");
}
@PreDestroy
public void destroy()
{
    System.out.println("destroy");
}
}
