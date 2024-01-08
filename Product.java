package kiosk;

public class Product extends Menu{
    String price;


    public Product(String name, String price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
