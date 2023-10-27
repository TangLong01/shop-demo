package com.app.model;

public class User {
    public enum UserRole {
        ADMIN,
        SALE,
        WAREHOUSE
    }

    public int id;
    public String username, password;
    public UserRole role;

    public User(String username, String password, int role) {
        this.username = username;
        this.password = password;
        switch (role) {
            case 101:
                this.role = UserRole.ADMIN;
                break;
            case 102:
                this.role = UserRole.SALE;
                break;
            case 103:
                this.role = UserRole.WAREHOUSE;
                break;
        }
    }

    public User(int id, String username, int role) {
        this.id = id;
        this.username = username;
        switch (role) {
            case 101:
                this.role = UserRole.ADMIN;
                break;
            case 102:
                this.role = UserRole.SALE;
                break;
            case 103:
                this.role = UserRole.WAREHOUSE;
                break;
        }
    }

    public void printf() {
        System.out.printf("- Id: %s | Tên: %s | Chức vụ: %s\n", id, username, role);
    }
}
