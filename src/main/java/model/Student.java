package model;

public class Student {
    private int id;
    private String name;
    private String mobile;
    private String email;
    private String address;
    private String username;
    private String password;
    private int collegeId;

    public  Student(int id,String name,String mobile,String email,String address,String username,String password,int collegeId){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.address=address;
        this.username=username;
        this.password=password;
        this.collegeId=collegeId;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+name+","+ mobile+","+email+","+address+","+username+","+password+","+collegeId;
        return  text;
    }
    @Override
    public  boolean equals(Object o){
        Student student=(Student) o;
        return  student.username.equals(this.username);
    }
}
