package com.app.controller.user;

import com.app.model.DB;
import com.app.model.User;
import com.app.view.user.admin.RemoveUser;

public class RemoveUserController {
    public static void process(String username) {
        try {
            User user = DB.findUserByUsername(username);
            if (user != null) {
                if (user.role != User.UserRole.ADMIN) {
                    DB.removeUser(username);
                    System.out.printf("Xoá người dùng %s thành công!\n", username);
                } else System.out.println("Không thể xoá người dùng là ADMIN!");
            } else {
                System.out.printf("Không tìm thấy tài khoản %s! Vui lòng thử lại!\n", username);
                new RemoveUser().render();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
