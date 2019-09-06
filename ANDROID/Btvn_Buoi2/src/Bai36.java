public class Bai36 {
    float a;
    float b;
    void nhap(float gta, float gtb) {
        a = gta;
        b = gtb;
    }
    void cong(){
        float c = a + b;
        System.out.println(" a + b: " + c);
    }
    void tru(){
        float c = a - b;
        System.out.println(" a - b: " + c);
    }
    void nhan(){
        float c = a * b;
        System.out.println(" a * b: " + c);
    }
    void  chia(){
        if(b ==0) {
            System.out.println("nhập lại b");
        } else {
            float c = a / b;
            System.out.println(" a : b: "+ c);
        }
    }

    public static void main(String[] args) {
        Bai36 b36 = new Bai36();
        b36.nhap(4,2);
        b36.cong();
        b36.tru();
        b36.nhan();
        b36.chia();
    }
}
