package com.app.controller.product;

import com.app.model.DB;

public class EditProductController {
    public static void process(int id, String newName, int newStock, int newPrice) {
        try {
            DB.editProduct(id, newName, newStock, newPrice);
            System.out.printf("Sửa sản phẩm có ID %s thành công!\n", id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
