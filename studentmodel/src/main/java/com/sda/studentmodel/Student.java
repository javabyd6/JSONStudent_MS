package com.sda.studentmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author marek swietlik
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private String lastname;
    private Integer index;

//    public Student(String name, String lastname, Integer index) {
//        this.name = name;
//        this.lastname = lastname;
//        this.index = index;
//    }
//    public Student(){}

}
