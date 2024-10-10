package com.plurasight;

public class Product {
    String sku, productName, department;
    double price;

    public Product(String sku, String productName, String department, double price) {
        this.sku = sku;
        this.productName = productName;
        this.department = department;
        this.price = price;
    }

    //Getters
    public String getSku() {
        return sku;
    }

    public String getProductName() {
        return productName;
    }

    public String getDepartment() {
        return department;
    }

    public double getPrice() {
        return price;
    }
}
