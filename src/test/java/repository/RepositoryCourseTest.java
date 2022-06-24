package repository;

import model.Course;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryCourseTest {

    @Test
    public void insertCourse() {
        RepositoryCourse repositoryCourse = new RepositoryCourse();
        Course course = new Course(1, 1, "Geometrie", "analiza", " anul II");
        repositoryCourse.insertCourse(course);
    }

    @Test
    public void deleteById() {
        RepositoryCourse repositoryCourse = new RepositoryCourse();
        repositoryCourse.stergeCourseById(6);

    }

    @Test
    public void update() {
        RepositoryCourse repositoryCourse = new RepositoryCourse();
        repositoryCourse.updateDepartament(1, "informatica");

    }



    @Test
    public void allList() {
        RepositoryCourse repositoryCourse = new RepositoryCourse();
        List<Course> courses = repositoryCourse.allCourses();
        for (Course c : courses) {
            System.out.println(c.toString());
        }

    }

    @Test
    public void returnCurs() {
        RepositoryCourse repositoryCourse = new RepositoryCourse();

        Course curs = repositoryCourse.returnCursTypes("pedagogie" );
        System.out.println(curs.toString());
    }

}