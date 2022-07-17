package com.company;

import model.*;
import view.ViewStudent;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(1,"Vali","071653","vali@yahoo.com","Lacramioarei","valiii","123",1);
        ViewStudent viewStudent=new ViewStudent(student);
        viewStudent.play();
    }





    }

