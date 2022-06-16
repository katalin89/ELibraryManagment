package model;

public class Schedule {
    private int id;
    private String name;
    private String type;
    private String description;


    public  Schedule(int id,String name,String type,String description){
        this.id=id;
        this.name=name;
        this.type=type;
        this.description=description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String decription) {
        this.description = decription;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+name+","+type+","+description;
        return  text;
    }
    @Override
    public  boolean equals(Object obj){
Schedule scedule=(Schedule)obj;
return scedule.name==this.name;

    }
}
