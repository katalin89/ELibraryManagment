package repository;

import model.Role;
import model.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryStudentTest {
    @Test
    public void insertStudent() {
        RepositoryStudent repositoryStudent = new RepositoryStudent();
        Student student = new Student(1, "Bianca", "076435", "bia@yahoo.com", "Lacramioarei nr 6", "bia", "12345", 2);
        repositoryStudent.insertStudent(student);
    }

    @Test
    public void deleteById() {
        RepositoryStudent repositoryStudent = new RepositoryStudent();
        repositoryStudent.stergeStudentById(5);

    }

    @Test
    public void update() {
        RepositoryStudent repositoryStudent = new RepositoryStudent();

        repositoryStudent.updatePassword(1, "8888");

    }


    @Test
    public void allList() {
        RepositoryStudent repositoryStudent = new RepositoryStudent();
        List<Student> students = repositoryStudent.allStudents();
        for (Student s : students) {
            System.out.println(s.toString());
        }

    }

}