package com.company;
import java.util.ArrayList;
public class Shop  {

    ArrayList<Product> items = new ArrayList<Product>();

    public void add(Product product) {
        if (product.stockNum >= 1) {
            items.add(product);
        } else {
            System.out.println("Product is out of stock");
        }
    }
}
