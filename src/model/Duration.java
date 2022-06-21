package model;

public class Duration {
    private int id;
    private  int courseId;
    private  String description;
    private  String  type;
    private String date;
    private String time;

    public  Duration(int id,int courseId,String description,String type,String data,String time){
        this.id=id;
        this.courseId=courseId;
        this.description=description;
        this.type=type;
        this.date=data;
        this.time=time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public  String toString(){
        String text="";
        text+=id+","+courseId+","+description+","+type+","+date+","+time;
        return  text;

        }

        @Override
    public  boolean equals(Object o){
        Duration duration=(Duration) o;
        return  duration.description.equals(this.description);
        }
}
