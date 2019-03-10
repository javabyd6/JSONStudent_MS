package com.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author marek swietlik
 */
public class ReadStudent {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void readStudent(){
        {
            try {
                Student[] students = mapper.readValue(new File("student.json"), Student[].class);
                List<Student> studentList = Arrays.asList(students);
                System.out.println(studentList.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void studentNameStartsWith(String letter){
        {
            try {
                Student[] students = mapper.readValue(new File("student.json"), Student[].class);
                List<Student> studentList = Arrays.asList(students);
                studentList.stream()
                        .filter(x -> x.getName().startsWith(letter))
                        .forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        readStudent();
        studentNameStartsWith("A");
    }
}
