package com.SpringCore.AutoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    private String name;
//    @Autowired
//@Qualifier("address1")
    private Address address;

    public Emp() {
        super();
    }
    //@Autowired  it can be used with constructor only when there is no primitive members in class
    public Emp(String name, Address address) {
        super();
        this.name = name;

        this.address = address;
    }
    @Autowired   //can be used like this
//@Qualifier("address1")  // cannot be used with constructor like this
    public Emp(@Qualifier("address1") Address address) { // can be used with constructor like this

        super();


        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }
//@Autowired
//@Qualifier("address1")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
