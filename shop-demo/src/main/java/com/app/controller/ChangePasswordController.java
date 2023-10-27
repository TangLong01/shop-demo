package com.app.controller;

import com.app.App;
import com.app.model.DB;

public class ChangePasswordController {
    public static void process(String newPassword) {
        try {
            DB.changePassword(App.currentUser, newPassword);
            System.out.printf("Đổi mật khẩu thành công!\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
