package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("SUGAR", 20, "15", "BLACK", true);

        products[1] = new Bread("SUGAR", (int) 20, "15");


        products[2] = new Bread("SUGAR", (int) 20, "12");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}
