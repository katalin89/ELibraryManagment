package model;

public class Course {
    private int id;
    private int studentId;
    private String type;
    private String description;
    private String year;

    public  Course(int  id,int studentId,String type,String description,String year){
        this.id=id;
        this.studentId=studentId;
        this. type=type;
        this.description=description;
        this.year=year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    @Override
    public  String toString(){
        String text="";
        text=id+","+studentId+","+type+","+description+","+year;
        return  text;
    }

    @Override
    public  boolean equals(Object o){
        Course course=(Course) o;
        return  course.type.equals(this.type);
    }
}
