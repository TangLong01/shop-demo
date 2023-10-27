package com.app.view.login;

import com.app.controller.LoginController;
import com.app.view.AbstractView;

import java.util.Scanner;

public class Login extends AbstractView {
    public String username, password;

    public void render() throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.printf("- Nhập tên đăng nhập: ");
        this.username = scn.nextLine();
        System.out.printf("- Nhập mật khẩu: ");
        this.password = scn.nextLine();
        LoginController.process(this);
    }
}
