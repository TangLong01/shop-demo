package com.app;

import com.app.model.DB;
import com.app.view.login.Login;

public class App {
    public static String currentUser;

    public static void main(String[] args) {
        try {
            DB.init();
            new Login().render();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
