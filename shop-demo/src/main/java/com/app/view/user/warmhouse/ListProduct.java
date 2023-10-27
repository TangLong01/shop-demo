package com.app.view.user.warmhouse;

import com.app.model.DB;
import com.app.model.Product;
import com.app.view.AbstractView;

import java.util.ArrayList;

public class ListProduct extends AbstractView {
    public void render() throws Exception {
        ArrayList<Product> listProduct = DB.getAllProduct();
        for (int i = 0; i < listProduct.size(); i++) {
            listProduct.get(i).printf();
        }
    }
}
