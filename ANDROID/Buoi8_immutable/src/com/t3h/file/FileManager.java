package com.t3h.file;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

public class FileManager {
    private String path = "D:/ANDROID/Buoi8_immutable/Info.txt";
    public void getFile(){
        File f = new File(path);
        boolean exists = f.exists();
        //f.listFiles();
        //f.isDirectory(); kiểm tra xem có phải vào thư mục ko
        //f.isFile(); kiểm tra có phải file hay không
        if (exists) {
            System.out.println(f.getName());
            System.out.println(f.length());
            long time = f.lastModified();
            System.out.println(time);
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println(format.format(time));
        }
        else {
            try {
                f.getParentFile().mkdirs();
                f.createNewFile();
                System.out.println("create file success");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*public void readAllFile(File file) {
        try {
            File[] files = file.listFiles();
            for (File f: files) {
                if (f.isDirectory()) {
                    readAllFile(f);
                } else {
                    System.out.println(f.getName());
                }
            }
        }catch (Exception ex){}
    }*/

    public void write() {
        try {
            File f = new File(path); //tạo đối tượng file trỏ vào path
            //in output: thực thi trên internet. FileoutputStrem dùng local
          if(f.exists()==false){
              f.getParentFile().mkdirs();
              f.createNewFile();
          }
            FileOutputStream out = new FileOutputStream(f,false);
          String str = "hello world \n";
          out.write(str.getBytes());
          out.write(str.getBytes());
          out.write(str.getBytes());
          out.close();//để đóng luồng stream

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void read(){
        try {
            File file = new File(path);
            if(file.exists()==false){
                System.out.println("File not exist");
                return;//để kết thúc quá trình xử lý
            }
            FileInputStream in = new FileInputStream(file);
            byte[] b = new byte[1024];
            int count = in.read(b);//nếu không truyền b thì đọc 1byte, count: số byte đọc đc
            StringBuilder stringBuilder = new StringBuilder();// chuyển về string để đọc
            while (count != -1){
                String s = new String(b,0,count,"utf8");//chuyển byte về chuỗi//ofset: phần tử bắt đầu
                stringBuilder.append(s);
                count = in.read();
            }
            in.close();
            System.out.println(stringBuilder);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void downLoad(String link){
        try {
            File f = new File("D:/video1.mp4");
            f.getParentFile().mkdirs();
            f.createNewFile();
            FileOutputStream out = new FileOutputStream(f);
            URL url = new URL(link);
            URLConnection urlConnection = url.openConnection();
            InputStream in = urlConnection.getInputStream();
            byte[] b = new byte[1024];
            int count = in.read(b);

            long total = urlConnection.getContentLengthLong();
            long downloaded = 0;
            int currentPercent = 0;
            while (count != -1) {
                downloaded += count;
                int percent = (int) ((double) downloaded / total * 100);
                if (currentPercent != percent){
                System.out.println(percent);
                currentPercent = percent;//để in percent 1 lần
            }
                out.write(b,0,count);
                count = in.read(b);
            }
            out.close();
            in.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
