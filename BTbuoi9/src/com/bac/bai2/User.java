package com.bac.bai2;

public class User {
    private String userName;
    private String password;
    private String name;
    private String dateOfBirth;
    private int age;
    private String job;

    public User(String userName, String password, String name, String dateOfBirth, int age, String job) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void showInfor(){
        System.out.println("Name :           "+this.name);
        System.out.println("UserName :       "+this.userName);
        System.out.println("Password :       "+this.password);
        System.out.println("Date of Birth :  "+ this.dateOfBirth);
        System.out.println("Age :            "+this.age);
        System.out.println("Job:             "+this.job);
    }

    public void changePassword(String password){
        if(this.password.equals(password)){
            System.out.println("Password không hợp lệ!");
        }
        else {
            this.password = password;
            System.out.println("Thay đổi mật khẩu thành công!");
        }
    }

}
