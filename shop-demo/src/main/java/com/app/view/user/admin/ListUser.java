package com.app.view.user.admin;

import com.app.model.DB;
import com.app.model.User;
import com.app.view.AbstractView;

import java.util.ArrayList;

public class ListUser extends AbstractView {
    public void render() throws Exception {
        ArrayList<User> listUser = DB.getAllUsername();
        for (int i = 0; i < listUser.size(); i++) {
            listUser.get(i).printf();
        }
    }
}
