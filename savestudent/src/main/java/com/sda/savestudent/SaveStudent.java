package com.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author marek swietlik
 */
public class SaveStudent {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void studentList(){
        Student student1 = new Student("Adam", "Adamski", 10001);
        Student student2 = new Student("Antek", "Antkowski", 10002);
        Student student3 = new Student("Bartek", "Bartkowski", 10003);
        Student student4 = new Student("Jacek", "Jackowski", 10004);
        Student student5 = new Student("Damian", "Damianowski", 10005);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        try {
            mapper.writeValue(new File("student.json"),studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        studentList();
    }
}
