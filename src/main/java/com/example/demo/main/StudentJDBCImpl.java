package com.example.demo.main;

import com.example.demo.bean.Student;
import com.example.demo.dao.StudentDAO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentJDBCImpl {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        /*Student student = new Student();
        // taking values from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter roll no");
        student.setRollNo(scanner.nextInt());
        System.out.println("enter name");
        scanner.nextLine();
        student.setName(scanner.nextLine());
        System.out.println("enter age");
        student.setAge(scanner.nextInt());
        System.out.println("enter address");
        scanner.nextLine();
        student.setAddress(scanner.nextLine());
        System.out.println("enter marks");
        student.setMarks(scanner.nextInt());

        //object of StudentDAO class
        StudentDAO studentDAO = new StudentDAO();
        int rows = studentDAO.insertIntoStudent(student);
        if(rows == 1){
            System.out.println("data inserted");
        }else{
            System.out.println("data not inserted");
        }

        System.out.println("enter name of student whose marks you want to update");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("enter updated marks");
        int marks = scanner.nextInt();
        rows = studentDAO.updateStudentMarksByName(name, marks);
        if(rows > 0){
            System.out.println("data updated");
        }else{
            System.out.println("data not updated");
        }*/

       /*
        String name = "velu";
        try {
            int rows = studentDAO.deleteStudentByName(name);
            if(rows > 0 ){
                System.out.println("data deleted");
                System.out.println("rows = " + rows);
            }else{
                System.out.println("data not deleted");
            }
        } catch (SQLException e) {
            System.out.println("due to some error, deletion not possible");
        }*/
        try {
            List<Student> studentList = studentDAO.getAllStudentData();
            for (Student student : studentList) {
                System.out.println(student);
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
            studentList.sort((o1, o2) -> Integer.compare(o1.getRollNo(), o2.getRollNo()));
            for (Student student : studentList) {
                System.out.println(student);
            }

            //to sort by name
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
            studentList.sort((o1,o2)-> o1.getName().compareToIgnoreCase(o2.getName()));
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
