package com.bac.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<User> arrayUser;

    public Manager() {
        arrayUser = new ArrayList<>();
    }

    public void signIn(User user) {
        boolean check = true;
        for (User u : arrayUser) {
            if (u.equals(user)) {
                System.out.println("Sign in failed!");
                check = false;
                break;
            }
        }
        if (check == true) arrayUser.add(user);
    }

    public int login() {
        System.out.println("------Login----------");
        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.print("User Name :");
        username = sc.nextLine();
        System.out.print("Password : ");
        password = sc.nextLine();
        int vitri = -1;
        boolean check = true;
        for (int i = 0; i < arrayUser.size(); i++) {
            User u = arrayUser.get(i);
            if (u.getUserName().equals(username) && u.getPassword().equals(password)) {
                System.out.println("Đăng nhập thành công!");
                vitri = i;
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("Tài khoản hoặc mật khẩu không đúng!");
        }
        return vitri;
    }


    public void changePassword() {
        System.out.println("Change Password--------------------");
        int index = -1;
        while (index == -1) {
            index = login();
        }
        User user = arrayUser.get(index);
        System.out.println("Nhập vào mật khẩu mới :");
        Scanner sc = new Scanner(System.in);
        String newPassword = sc.nextLine();
        user.changePassword(newPassword);
    }

    public void removeUser(){
        System.out.println("Remove User---------------------");
        int index = -1;
        while (index==-1){
            index = login();
        }
        arrayUser.remove(index);
        System.out.println("Xoá thành công!");
    }

    public void searchUser(){
        System.out.println("Search User------------------");
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên user :");
        String name = sc.nextLine();
        for (User u:arrayUser) {
            if(u.getName().equals(name)) {
                u.showInfor();
                check = false;
                break;
            }
        }
        if(check==true){
            System.out.println("Không tìm thấy user nào!");
        }
    }
}
