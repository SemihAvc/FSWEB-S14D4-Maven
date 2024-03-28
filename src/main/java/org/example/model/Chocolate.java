package org.example.model;

public class Chocolate extends  ProductForSale {
private  String  color;
private  boolean sugar;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String color, boolean sugar) {
        super(type, price, description);
        this.color = color;
        this.sugar = sugar;

    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                ", sugar=" + sugar +
                '}';
    }
}
