package com.app.controller.product;

import com.app.model.DB;
import com.app.model.Product;
import com.app.view.user.warmhouse.RemoveProduct;

public class RemoveProductController {
    public static void process(int id) {
        try {
            Product product = DB.findProdcutById(id);
            if (product != null) {
                DB.removeProduct(id);
                System.out.printf("Xoá sản phẩm ID %s thành công!\n", id);
            } else {
                System.out.printf("Không tìm thấy sản phẩm ID %s! Vui lòng thử lại!\n", id);
                new RemoveProduct().render();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
