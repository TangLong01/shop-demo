package com.app.controller.product;

import com.app.model.DB;

public class AddProductController {
    public static void process(String name, int stock, int price) {
        try {
            DB.addProduct(name, stock, price);
            System.out.printf("Thêm sản phẩm %s thành công!\n", name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
