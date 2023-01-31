package com.example.demo.dao;

import com.example.demo.bean.Student;
import com.example.demo.util.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//this class is containing code to for inserting updating deleting and fetching data from student table
public class StudentDAO {
    private static Connection connection  = DbUtil.getDbConnection();
    //insert
    public int insertIntoStudent(Student student){
        int rows = 0;
        String sql ="INSERT INTO student VALUES (" +
                student.getRollNo() +
                ", '"+ student.getName() + "' , " +
                student.getAge() +
                ", '" + student.getAddress()+ "' ," +
                student.getMarks() + ")";
        System.out.println("sql = " + sql);


        //getting Statement object
        try {
            Statement stmt  = connection.createStatement();
            rows = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }
    // update
    //update student set marks = 555 where sname = 'vaibhav';
    public int updateStudentMarksByName(String name, int marks){
        int rows = 0;
        String sql = "UPDATE student SET marks = " + marks + " WHERE sname = '" + name + "'";
        System.out.println("sql = " + sql);

        try {
            Statement stmt = connection.createStatement();
            rows = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }
    //delete
    //delete from student where sname = 'vaibhav';
    public int deleteStudentByName(String name) throws SQLException {
        int rows = 0;
        String sql = "delete from student where sname = '" + name + "'";
        System.out.println("sql = " + sql);
        Statement stmt = connection.createStatement();
        rows = stmt.executeUpdate(sql);
        return rows;
    }
    // select
    // get all the data from student table
    public List<Student> getAllStudentData() throws SQLException {
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * FROM student";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        // processing the ResultSet
        while (rs.next()){
            int rollNo = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            String address = rs.getString(4);
            int marks = rs.getInt(5);
            Student student = new Student(rollNo, name, age, address, marks);
            //adding the object to list
            studentList.add(student);
        }
        return studentList;
    }
}
