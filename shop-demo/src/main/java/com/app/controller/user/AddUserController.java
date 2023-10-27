package com.app.controller.user;

import com.app.model.DB;

public class AddUserController {
    public static void process(String username, String password, int role) {
        try {
            DB.addUser(username, password, role);
            System.out.printf("Thêm người dùng %s thành công!\n", username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
