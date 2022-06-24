package repository;

import model.Duration;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryDuration  extends  Repository{
    public RepositoryDuration(){
        super();
    }

    public  void insertDuration(Duration duration){
        String insertTo="";
        insertTo+=" insert into duration ( course_id,description,type,data,time) values(";
        insertTo+=String.format("%d, '%s', '%s', '%s', '%s'",duration.getCourseId(),duration.getDescription(),duration.getType(),duration.getDate(),duration.getTime());
        insertTo+=")";
        executeStatement(insertTo);

    }

    public  void stergeDurationById(int id){
        String delete=String.format("delete from duration where id = %d",id);
        executeStatement(delete);


    }
    public  void updateData(int id,String data){
        String  update=String.format("update duration set data = '%s'",data);
        update+=String.format("where id= %d",id);
        executeStatement(update);
    }
    private ResultSet allDuration(){
        executeStatement("select * from duration");
        try {
            return  statement.getResultSet();

        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Duration> allDurations(){
        ResultSet set=allDuration();
        List<Duration>durations=new ArrayList<>();
        try{
            while(set.next()){
                durations.add(new Duration(set.getInt(1),set.getInt(2),set.getString(3),set.getString(4),set.getString(5), set.getString(6)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat lista");
        }
        return  durations;
    }
}
