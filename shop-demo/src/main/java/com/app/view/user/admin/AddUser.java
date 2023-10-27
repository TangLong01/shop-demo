package com.app.view.user.admin;

import com.app.controller.user.AddUserController;
import com.app.view.AbstractView;

import java.util.Scanner;

public class AddUser extends AbstractView {
    public String username, password;
    int role;

    public void render() throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.printf("- Nhập tên đăng nhập: ");
        this.username = scn.nextLine();
        System.out.printf("- Nhập mật khẩu: ");
        this.password = scn.nextLine();
        do {
            System.out.printf("- Nhập chức vụ (admin/sale/warmhouse): ");
            String roleInput = scn.nextLine();
            switch (roleInput) {
                case "admin":
                    this.role = 101;
                    break;
                case "sale":
                    this.role = 102;
                    break;
                case "warmhouse":
                    this.role = 103;
                    break;
                default:
                    this.role = 0;
                    System.out.println("Chức vụ không hợp lệ! Vui lòng nhập lại!");
            }
        } while (this.role == 0);

        AddUserController.process(username, password, role);
    }
}
