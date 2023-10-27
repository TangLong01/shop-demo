package com.app.view.menu;

import com.app.view.AbstractView;
import com.app.view.user.ChangePassword;
import com.app.view.user.warmhouse.AddProduct;
import com.app.view.user.warmhouse.EditProduct;
import com.app.view.user.warmhouse.ListProduct;
import com.app.view.user.warmhouse.RemoveProduct;

import java.util.Scanner;

public class WarmhouseMenu extends AbstractView {
    public void render() throws Exception {
        int selection;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("-------------------------------");
            System.out.println("Hãy lựa chọn tính năng...");
            System.out.println("1.Xem tất cả sản phẩm");
            System.out.println("2.Thêm sản phẩm");
            System.out.println("3.Sửa sản phẩm");
            System.out.println("4.Xoá sản phẩm");
            System.out.println("5.Đổi mật khẩu của bạn");
            System.out.printf("Lựa chọn của bạn: ");
            selection = scn.nextInt();
            switch (selection) {
                case 1:
                    new ListProduct().render();
                    break;
                case 2:
                    new AddProduct().render();
                    break;
                case 3:
                    new EditProduct().render();
                    break;
                case 4:
                    new RemoveProduct().render();
                    break;
                case 5:
                    new ChangePassword().render();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại!");
                    break;
            }
            new WarmhouseMenu().render();
        } while (selection < 1 || selection > 5);
    }
}
