package model;

public class Book implements Comparable<Book>{
    private  int id;
    private  int studentId;
    private String name;
    private String author;
    private int price;
    private String date;

    public  Book(int id ,int studentId,String name,String author,int price,String date){
        this.id=id;
        this.studentId=studentId;
        this.name=name;
        this.author=author;
        this.price=price;
        this.date=date;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+studentId+","+name+","+author+","+price+","+date;
        return  text;

    }

    @Override
    public  boolean equals(Object o){
        Book book=(Book)o;
        return  book.price==this.price;

    }

    @Override
    //ok
    public int compareTo(Book b) {
        if(this.price>b.price)
        {
            return 1;
        }else if(this.price<b.price){
            return -1;
        }
        return 0;
    }
}
