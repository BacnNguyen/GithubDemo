package com.bac.bai2;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("bacnv1","123","Nguyen Van Bac1","04/03/1999",20,"IT");
        User user2 = new User("bacnv2","1234","Nguyen Van Bac2","04/03/1999",20,"IT");
        User user3 = new User("bacnv3","12345","Nguyen Van Bac3","04/03/1999",20,"IT");
        User user4 = new User("bacnv4","123456","Nguyen Van Bac4","04/03/1999",20,"IT");
//        user.showInfor();
        Manager manager = new Manager();
        manager.signIn(user1);
        manager.signIn(user2);
        manager.signIn(user3);
        manager.signIn(user4);
//        manager.changePassword();
        manager.searchUser();
        manager.removeUser();
    }
}
