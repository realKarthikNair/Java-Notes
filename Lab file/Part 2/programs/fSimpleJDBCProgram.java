// Create a simple JDBC program that creates a table, 
// stores data into it, retrieves & prints the data

import java.sql.*;

public class fSimpleJDBCProgram {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "12345678");
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS javatemp";
            stmt.executeUpdate(sql);
            sql = "USE javatemp";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE if not exists shopping_list (id INT NOT NULL AUTO_INCREMENT, item VARCHAR(255), PRIMARY KEY (id), quantity INT, price DOUBLE)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO shopping_list (item, quantity, price) VALUES ('Apple', 5, 10.0)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO shopping_list (item, quantity, price) VALUES ('Orange', 10, 5.0)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO shopping_list (item, quantity, price) VALUES ('Banana', 15, 2.0)";
            stmt.executeUpdate(sql);

            sql = "SELECT * FROM shopping_list";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("item") + " " + rs.getInt("quantity") + " " + rs.getDouble("price"));
            }

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