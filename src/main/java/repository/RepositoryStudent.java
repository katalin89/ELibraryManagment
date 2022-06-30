package repository;

import model.Role;
import model.Student;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryStudent extends  Repository{
    public RepositoryStudent(){
        super();
    }

    public  void insertStudent(Student student){
        String insertTo="";
        insertTo+=" insert into student( name, mobile, email, address, username, password, collegeId) values (";
        insertTo+=String.format(" '%s', '%s','%s', '%s','%s', '%s',%d",student.getName(),student.getMobile(),student.getEmail(),student.getAddress(),student.getUsername(),student.getPassword(),student.getCollegeId());
        insertTo+=")";
        executeStatement(insertTo);

    }

    public  void stergeStudentById(int id){
        String delete=String.format("delete from student where id = %d",id);
        executeStatement(delete);


    }
    public  void updatePassword(int id,String password){
        String  update=String.format("update student set password = '%s'",password);
        update+=String.format("where id= %d",id);
        executeStatement(update);
    }
    private ResultSet allStudent(){
        executeStatement("select * from student");
        try {
            return  statement.getResultSet();

        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Student> allStudents(){
        ResultSet set=allStudent();
        List<Student>students=new ArrayList<>();
        try{
            while(set.next()){
                students.add(new Student(set.getInt(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5),set.getString(6),set.getString(7),set.getInt(8)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat lista");
        }
        return  students;
    }

    public Student getStudentById(int id){
        String login=String.format("select * from student where id=%d",id);
        executeStatement(login);
        try{
            ResultSet result= statement.getResultSet();
            if (result!=null){
                result.next();
                return  new Student(result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getString(7),
                result.getInt(8));
            }else  return  null;
        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }


    public  Student login(String username,String password){
        String login=String .format("select * from student where username='%s'and password='%s'",username,password);
        executeStatement(login);
        try{
            ResultSet result=statement.getResultSet();
            if(result!=null){
                result.next();
                return  new Student(result.getInt(1),
                result.getString(2),
                result.getString(3),
                result.getString(4),
                result.getString(5),
                result.getString(6),
                result.getString(7),
                result.getInt(8));



            }else return  null;
        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }
}
