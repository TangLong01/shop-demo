package com.app.view.menu;

import com.app.view.AbstractView;
import com.app.view.user.admin.AddUser;
import com.app.view.user.ChangePassword;
import com.app.view.user.admin.ListUser;
import com.app.view.user.admin.RemoveUser;

import java.util.Scanner;

public class AdminMenu extends AbstractView {
    public void render() throws Exception {
        int selection;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("-------------------------------");
            System.out.println("Hãy lựa chọn tính năng...");
            System.out.println("1.Xem tất cả người dùng");
            System.out.println("2.Thêm người dùng");
            System.out.println("3.Xoá người dùng");
            System.out.println("4.Đổi mật khẩu của bạn");
            System.out.printf("Lựa chọn của bạn: ");
            selection = scn.nextInt();
            switch (selection) {
                case 1:
                    new ListUser().render();
                    break;
                case 2:
                    new AddUser().render();
                    break;
                case 3:
                    new RemoveUser().render();
                    break;
                case 4:
                    new ChangePassword().render();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại!");
                    break;
            }
            new AdminMenu().render();
        } while (selection < 1 || selection > 4);
    }
}
