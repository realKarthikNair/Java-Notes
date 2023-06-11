// Write a Java program in Java to insert, update, delete & select records

import java.sql.*;

public class hInsertUpdateDeleteSelect {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestDB", "root", "12345678");
            String insertSql = "INSERT INTO student (id, name, enrol_num, status) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertSql);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Ramesh Kumar");
            pstmt.setInt(3, 12345);
            pstmt.setInt(4, 1);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Sandra");
            pstmt.setInt(3, 23456);
            pstmt.setInt(4, 1);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");


            String updateSql = "UPDATE student SET name = ?, enrol_num = ?, status = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSql);
            pstmt.setString(1, "Jane");
            pstmt.setInt(2, 54321);
            pstmt.setInt(3, 0);
            pstmt.setInt(4, 1);
            pstmt.executeUpdate();
            System.out.println("Record updated successfully.");

            String deleteSql = "DELETE FROM student WHERE id = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setInt(1, 1);
            pstmt.executeUpdate();
            System.out.println("Record deleted successfully.");

            String selectSql = "SELECT * FROM student";
            pstmt = conn.prepareStatement(selectSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int enrolNum = rs.getInt("enrol_num");
                int status = rs.getInt("status");
                System.out.println("id: " + id + ", name: " + name + ", enrol_num: " + enrolNum + ", status: " + status);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
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