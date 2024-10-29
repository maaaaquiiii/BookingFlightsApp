package org.example;

public class Destination {
    private String code;
    private String city;
    private double price;

    public Destination(String code, String city, double price) {
        this.code = code;
        this.city = city;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }
}
