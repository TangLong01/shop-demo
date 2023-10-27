package com.app.model;

public class Product {
    public String name;
    public int id, stock, price;

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public Product(int id, String name, int stock, int price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public void printf() {
        System.out.printf("- Id: %s | Tên: %s | Tồn kho: %s | Giá: %s$\n", id, name, stock, price);
    }
}
