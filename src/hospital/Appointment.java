package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Appointment {

    Connection con = DBConnection.getConnection();
    Scanner sc = new Scanner(System.in);

    public void bookAppointment() {
        try {
            System.out.print("Enter Patient ID: ");
            int patientId = sc.nextInt();

            System.out.print("Enter Doctor ID: ");
            int doctorId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            String sql = "INSERT INTO appointments VALUES (NULL, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setString(3, date);

            ps.executeUpdate();
            System.out.println("Appointment Booked Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
