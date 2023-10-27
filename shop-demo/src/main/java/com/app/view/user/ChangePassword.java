package com.app.view.user;

import com.app.controller.ChangePasswordController;
import com.app.view.AbstractView;

import java.util.Scanner;

public class ChangePassword extends AbstractView {
    public String newPassword;

    public void render() throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.printf("- Nhập mật khẩu mới: ");
        this.newPassword = scn.nextLine();
        ChangePasswordController.process(newPassword);
    }
}
