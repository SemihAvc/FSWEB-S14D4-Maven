package org.example.model;

public class Coke extends ProductForSale{

private String sugar;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, String sugar) {
        super(type, price, description);
        this.sugar = sugar;

    }



    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "sugar='" + sugar + '\'' +
                '}';
    }
}
