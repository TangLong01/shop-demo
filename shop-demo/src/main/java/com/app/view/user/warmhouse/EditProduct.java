package com.app.view.user.warmhouse;

import com.app.controller.product.EditProductController;
import com.app.model.DB;
import com.app.model.Product;
import com.app.view.AbstractView;

import java.util.Scanner;

public class EditProduct extends AbstractView {
    public String name;
    public int id, stock, price;

    public void render() throws Exception {
        Scanner scn = new Scanner(System.in);
        Product product;
        do {
            System.out.printf("- Nhập id sản phẩm cần sửa: ");
            this.id = scn.nextInt();
            scn.nextLine();
            product = DB.findProdcutById(id);
            if (product == null) {
                System.out.println("Id sản phẩm không tồn tại! Vui lòng nhập lại!");
            }
        }
        while (product == null);
        System.out.printf("- Nhập tên sản phẩm mới (Tên cũ: " + product.name + ") : ");
        this.name = scn.nextLine();
        System.out.printf("- Nhập số lượng tồn kho mới (Số lượng tồn kho cũ: " + product.stock + ") : ");
        this.stock = scn.nextInt();
        System.out.printf("- Nhập giá sản phẩm mới (Giá cũ: " + product.price + ") : ");
        this.price = scn.nextInt();
        EditProductController.process(id, name, stock, price);
    }
}
