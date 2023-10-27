package com.app.model;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    static final String DB_URL = "jdbc:mysql://localhost:3306/shop?autoReconnect=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "long200801";
    static Connection conn;

    public static void init() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static User findUserByUsername(String username) throws SQLException {
        final String TABLE_NAME = "user";
        final String QUERY = "select * from " + TABLE_NAME + " where user.username='" + username + "'";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);

        if (rs.next()) {
            return new User(rs.getString("username"), rs.getString("password"), rs.getInt("role"));
        }
        return null;
    }

    public static ArrayList<User> getAllUsername() throws SQLException {
        final String TABLE_NAME = "user";
        final String QUERY = "select id, username, role from " + TABLE_NAME;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        ArrayList<User> userList = new ArrayList<>();

        while (rs.next()) {
            userList.add(new User(rs.getInt("id"), rs.getString("username"), rs.getInt("role")));
        }
        return userList;
    }

    public static void addUser(String username, String password, int role) throws SQLException {
        final String TABLE_NAME = "user";
        final String QUERY = "insert into " + TABLE_NAME + "(username, password, role) values ('" + username + "','" + password + "'," + role + ")";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(QUERY);
    }

    public static void removeUser(String username) throws SQLException {
        final String TABLE_NAME = "user";
        final String QUERY = "delete from " + TABLE_NAME + " where username='" + username + "'";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(QUERY);
    }

    public static void changePassword(String username, String newPassword) throws SQLException {
        final String TABLE_NAME = "user";
        final String QUERY = "update " + TABLE_NAME + " set password='" + newPassword + "' where username='" + username + "'";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(QUERY);
    }

    public static ArrayList<Product> getAllProduct() throws SQLException {
        final String TABLE_NAME = "product";
        final String QUERY = "select * from " + TABLE_NAME;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        ArrayList<Product> productsList = new ArrayList<>();

        while (rs.next()) {
            productsList.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("stock"), rs.getInt("price")));
        }
        return productsList;
    }

    public static Product findProdcutById(int id) throws SQLException {
        final String TABLE_NAME = "product";
        final String QUERY = "select * from " + TABLE_NAME + " where product.id='" + id + "'";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);

        if (rs.next()) {
            return new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("stock"), rs.getInt("price"));
        }
        return null;
    }

    public static void addProduct(String name, int stock, int price) throws SQLException {
        final String TABLE_NAME = "product";
        final String QUERY = "insert into " + TABLE_NAME + "(name, stock, price) values ('" + name + "'," + stock + "," + price + ")";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(QUERY);
    }

    public static void editProduct(int id, String name, int stock, int price) throws SQLException {
        final String TABLE_NAME = "product";
        final String QUERY = "update " + TABLE_NAME + " set name='" + name + "',stock=" + stock + ",price=" + price + " where id=" + id;

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(QUERY);
    }

    public static void removeProduct(int id) throws SQLException {
        final String TABLE_NAME = "product";
        final String QUERY = "delete from " + TABLE_NAME + " where id='" + id + "'";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(QUERY);
    }
}
