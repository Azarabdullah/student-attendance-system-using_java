import dao.StudentDAO;
import dao.AttendanceDAO;
import model.Student;
import model.Attendance;

import java.sql.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        AttendanceDAO attendanceDAO = new AttendanceDAO();

        System.out.println("1. Add Student");
        System.out.println("2. Mark Attendance");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            String roll = sc.nextLine();

            Student student = new Student(name, roll);
            studentDAO.addStudent(student);

        } else if (choice == 2) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            System.out.print("Status (Present/Absent): ");
            String status = sc.next();

            Attendance attendance = new Attendance(
                id,
                new Date(System.currentTimeMillis()),
                status
            );

            attendanceDAO.markAttendance(attendance);
        } else {
            System.out.println("Invalid option");
        }
    }
}
