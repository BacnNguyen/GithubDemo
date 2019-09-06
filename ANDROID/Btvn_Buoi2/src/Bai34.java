public class Bai34 {
    float diemT, diemL, diemH, diemTB;
    String ten;
    String MSV;
    void nhap( float diemT1, float diemL1, float diemH1, String ten1, String MSV1) {
        diemT = diemT1;
        diemH = diemH1;
        diemL = diemL1;
        ten = ten1;
        MSV = MSV1;
    }

     void kiemTra () {
        diemTB = (diemT + diemL + diemH)/3;
        if (diemTB < 6.5) {
            System.out.println("họ tên: "+ ten+ ", MSSV: " + MSV + ", Điểm trung bình: " + diemTB + ", Xếp loại trung bình");
        }
        else if (diemTB >= 8) {
            System.out.println("họ tên: "+ ten+  ", MSSV: "  + MSV + ", Điểm trung bình: " + diemTB + ", Xếp loại giởi");
        }
        else {
            System.out.println("họ tên: "+ ten+  ", MSSV: "  + MSV + ", Điểm trung bình: " + diemTB + ", Xếp loại khá");
        }
     }

    public static void main(String[] args) {
        Bai34 b34 = new Bai34();
        b34.nhap(7,9,5,"hoa","GCH");
        b34.kiemTra();
    }
}
