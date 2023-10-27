package com.app.view.user.warmhouse;

import com.app.controller.product.AddProductController;
import com.app.view.AbstractView;

import java.util.Scanner;

public class AddProduct extends AbstractView {
    public String name;
    int stock, price;

    public void render() throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.printf("- Nhập tên sản phẩm: ");
        this.name = scn.nextLine();
        System.out.printf("- Nhập tồn kho: ");
        this.stock = scn.nextInt();
        System.out.printf("- Nhập giá: ");
        this.price = scn.nextInt();

        AddProductController.process(name, stock, price);
    }
}
