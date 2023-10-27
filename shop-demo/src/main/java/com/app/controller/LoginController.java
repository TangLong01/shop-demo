package com.app.controller;

import com.app.App;
import com.app.model.DB;
import com.app.model.User;
import com.app.view.login.Login;
import com.app.view.menu.AdminMenu;
import com.app.view.menu.WarmhouseMenu;

import java.util.Objects;

public class LoginController {
    public static void process(Login view) {
        try {
            User user = DB.findUserByUsername(view.username);
            if (user != null) {
                if (Objects.equals(view.password, user.password)) {
                    System.out.println("Đăng nhập thành công!");
                    App.currentUser = view.username;
                    switch (user.role) {
                        case ADMIN:
                            new AdminMenu().render();
                            break;
                        case WAREHOUSE:
                            new WarmhouseMenu().render();
                            break;
                    }
                } else {
                    System.out.println("----- Sai mật khẩu! Vui lòng thử lại! -----");
                    new Login().render();
                }
            } else {
                System.out.println("----- Sai tên đăng nhập! Vui lòng thử lại! -----");
                new Login().render();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
