package dao;

import model.Attendance;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AttendanceDAO {

    public void markAttendance(Attendance attendance) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO attendance(student_id, date, status) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, attendance.getStudentId());
            ps.setDate(2, attendance.getDate());
            ps.setString(3, attendance.getStatus());

            ps.executeUpdate();
            System.out.println("Attendance marked successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
