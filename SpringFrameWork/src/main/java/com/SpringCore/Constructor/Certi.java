package com.SpringCore.Constructor;

public class Certi {
    private String name;

    public Certi() {
        super();
    }

    public Certi(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "name='" + name + '\'' +
                '}';
    }
}
