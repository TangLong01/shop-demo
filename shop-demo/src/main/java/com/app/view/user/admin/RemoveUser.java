package com.app.view.user.admin;

import com.app.controller.user.RemoveUserController;
import com.app.view.AbstractView;

import java.util.Scanner;

public class RemoveUser extends AbstractView {
    public String username;

    public void render() throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.printf("- Nhập tên đăng nhập bạn muốn xoá tài khoản: ");
        this.username = scn.nextLine();
        RemoveUserController.process(username);
    }
}
