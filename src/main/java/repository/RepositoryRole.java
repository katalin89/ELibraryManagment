package repository;

import model.Duration;
import model.Role;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryRole extends Repository{
    public RepositoryRole(){
        super();
    }

    public  void insertRole(Role role){
        String insertTo="";
        insertTo+=" insert into role ( title,description) values(";
        insertTo+=String.format(" '%s', '%s'",role.getTitle(),role.getDescription());
        insertTo+=")";
        executeStatement(insertTo);

    }

    public  void stergeRoleById(int id){
        String delete=String.format("delete from role where id = %d",id);
        executeStatement(delete);


    }
    public  void updateTitle(int id,String title){
        String  update=String.format("update role set title = '%s'",title);
        update+=String.format("where id= %d",id);
        executeStatement(update);
    }
    private ResultSet allRols(){
        executeStatement("select * from role");
        try {
            return  statement.getResultSet();

        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Role> allRoles(){
        ResultSet set=allRols();
        List<Role>roles=new ArrayList<>();
        try{
            while(set.next()){
                roles.add(new Role(set.getInt(1),set.getString(2),set.getString(3)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat lista");
        }
        return  roles;
    }
}
