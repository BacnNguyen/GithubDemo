package com.bac.bai1;

public class Bai1 {
    private String s;

    public Bai1(String s) {
        this.s = s;
    }

    public int tinhTongAscii(){
        int tong =0;
        for (int i = 0; i <s.length() ; i++) {
            tong+=s.codePointAt(i);
        }
        return tong;
    }

    public void sapXep(){
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i <builder.length()-1 ; i++) {
            for (int j = i+1; j <builder.length() ; j++) {
                if(builder.charAt(i)>builder.charAt(j)){
                    char tmp = builder.charAt(i);
                    builder.replace(i,i+1,builder.charAt(j)+"");
                    builder.replace(j,j+1,tmp+"");
                }
            }
        }
        s= builder.toString();
        System.out.println(s);
    }

    public void inKiTuHoa(){
        for (int i = 0; i <s.length() ; i++) {
            char tmp = s.charAt(i);
            if(tmp>='A'&&tmp<='Z') System.out.println(tmp);
        }
    }

    public boolean kiemTraDoiXung(){
        StringBuilder builder = new StringBuilder(s);
        String tmp = builder.reverse().toString();
        if(tmp.equals(s)) return true;
        else return false;
    }


//    public void chuanHoa1(){
//        StringBuilder builder = new S
//    }

    public static void main(String[] args) {

        Bai1 bai1 = new Bai1("abcba1");
//        bai1.sapXep();
//        bai1.inKiTuHoa();
//        System.out.println(bai1.kiemTraDoiXung());

    }
}
