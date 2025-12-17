package hospital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        Doctor doctor = new Doctor();
        Appointment appointment = new Appointment();

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> patient.addPatient();
                case 2 -> doctor.addDoctor();
                case 3 -> appointment.bookAppointment();
                case 4 -> {
                    System.out.println("Thank You!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
