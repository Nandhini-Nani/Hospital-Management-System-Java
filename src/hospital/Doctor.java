package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Doctor {

    Connection con = DBConnection.getConnection();
    Scanner sc = new Scanner(System.in);

    public void addDoctor() {
        try {
            System.out.print("Doctor Name: ");
            String name = sc.nextLine();

            System.out.print("Specialization: ");
            String specialization = sc.nextLine();

            System.out.print("Available (yes/no): ");
            String available = sc.nextLine();

            String sql = "INSERT INTO doctors VALUES (NULL, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, specialization);
            ps.setString(3, available);

            ps.executeUpdate();
            System.out.println("Doctor Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
