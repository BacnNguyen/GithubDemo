package com.t3h.bai2;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    public void add(Student student){
        studentArrayList.add(student);
    }

    public void printList(){
        for (Student student:studentArrayList) {
            System.out.println( student.toString());
            System.out.println("----------------");
        }
    }

    public void findStudentByScore(int score){
        for (int i = 0; i <studentArrayList.size() ; i++) {
            if(studentArrayList.get(i).getScore()==(score)) {
                System.out.println(studentArrayList.get(i).getName());
            }
            else {
                System.out.println("không có sinh viên");
            }
        }

    }




}
