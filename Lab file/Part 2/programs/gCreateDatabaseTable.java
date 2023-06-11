// Write a Java program in Java to create database table using Java

import java.sql.*;

public class gCreateDatabaseTable {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "12345678");
        stmt = conn.createStatement();
        String sql = "CREATE DATABASE IF NOT EXISTS TestDB";
        stmt.executeUpdate(sql);
        System.out.println("Database TestDB created successfully...");
        sql = "USE TestDB";
        stmt.executeUpdate(sql);
        sql = "CREATE TABLE if not exists student (id INT NOT NULL, name VARCHAR(255), enrol_num INT, status INT, PRIMARY KEY (id))";
        stmt.executeUpdate(sql);
        System.out.println("Table student created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}