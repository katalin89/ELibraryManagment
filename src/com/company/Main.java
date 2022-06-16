package com.company;

import model.*;

public class Main {

    public static void main(String[] args) {
        Course course=new Course(1,1,"type","descriere","2017.01.01");
        Course course2=new Course(1,1,"type1","descriere","2017.01.01");
        System.out.println(course.equals(course2));





    }
}
