package org.example.model;


public class Bread extends ProductForSale {
    private String color;

    public Bread(String type, int price, String description)
 {
        super(type, price, description);
        this.color = color;
    }




    @Override
    public void showDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bread{" +
                "clor='" + color + '\'' +
                '}';
    }
}
