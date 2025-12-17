package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Patient {

    Connection con = DBConnection.getConnection();
    Scanner sc = new Scanner(System.in);

    public void addPatient() {
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            String sql = "INSERT INTO patients VALUES (NULL, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, gender);
            ps.setString(4, phone);

            ps.executeUpdate();
            System.out.println("Patient Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
