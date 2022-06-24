package repository;

import model.Course;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryCourse extends Repository {

    public RepositoryCourse() {
        super();
    }

    public void insertCourse(Course course) {
        String insertTo = "";
        insertTo += "insert into course ( student_id,type,description,year)  values(";
        insertTo += String.format("%d, '%s' , '%s', '%s'", course.getStudentId(), course.getType(), course.getDescription(),course.getYear());
        insertTo += ")";
        executeStatement(insertTo);
    }

    public void stergeCourseById(int id) {
        String text = String.format("delete from course where id = %d", id);
        executeStatement(text);
    }

    public void updateDepartament(int id, String description) {
        String update = "";
        update += String.format("update course set description= '%s '", description);
        update += String.format("where  id = %d", id);
        executeStatement(update);
    }


    private ResultSet allCourse() {
        executeStatement("select * from course");
        try {
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    public List<Course> allCourses() {
        ResultSet set = allCourse();
        List<Course> courses = new ArrayList<>();
        try {
            while (set.next()) {
                courses.add(new Course(set.getInt(1), set.getInt(2), set.getString(3), set.getString(4),set.getString(5)));
            }
        } catch (Exception e) {
            System.out.println("Nu s-a creat lista");
        }
        return courses;
    }

    private ResultSet returnCursType(String type) {
        executeStatement(String.format(" select  *  from  course  where  type = '%s'", type));
        try {
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a execuat schita");
            return null;
        }
    }

    public Course returnCursTypes(String type) {
        ResultSet set = returnCursType(type);

        List<Course> courses = new ArrayList<>();
        try {
            while (set.next()) {
                courses.add(new Course(set.getInt(1), set.getInt(2), set.getString(3), set.getString(4),set.getString(5)));
            }
            return courses.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    public Course getCourseByType(String type){
        Course course=null;
        executeStatement(String.format("select * from course where course.type='%s'", type));
        try {
            ResultSet resultSet = statement.getResultSet();
            resultSet.next();
            course = new Course(resultSet.getInt(1),resultSet.getInt(2),
                    resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
            return course;
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }


}