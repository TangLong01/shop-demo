package com.app.view.user.warmhouse;

import com.app.controller.product.RemoveProductController;
import com.app.view.AbstractView;

import java.util.Scanner;

public class RemoveProduct extends AbstractView {
    public int id;

    public void render() throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.printf("- Nhập id sản phẩm bạn muốn xoá: ");
        this.id = scn.nextInt();
        RemoveProductController.process(id);
    }
}
