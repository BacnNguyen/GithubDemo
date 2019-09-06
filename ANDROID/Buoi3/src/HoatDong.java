public class HoatDong {
    int thu;

    void nhap(int gtThu) {
        thu = gtThu;
    }

    void getHoatDong() {
        if (thu == 2) {
            System.out.println("Đá Bóng");
        } else if (thu == 3) {
            System.out.println("Đi Bơi");
        } else if (thu == 4) {
            System.out.println("Chơi Game");
        } else if (thu == 5) {
            System.out.println("Ngủ");
        } else if (thu == 6) {
            System.out.println("Đi Học");
        } else if (thu == 7) {
            System.out.println("Ở Nhà");
        } else if (thu == 8) {
            System.out.println("Xem Phim");
        } else {
            System.out.println("Không là thứ");
        }
    }

    void getHoatDongBySwitchCase() {
        switch (thu) {
            case 2:
                System.out.println("Đá Bóng");
                break;
            case 3:
                System.out.println("Đi Bơi");
                break;
            case 4:
                System.out.println("Chơi Game");
                break;
            case 5:
                System.out.println("Ngủ");
                break;
            case 6:
                System.out.println("Đi Học");
                break;
            case 7:
                System.out.println("Ở nhà");
                break;
            case 8:
                System.out.println("Xem Phim");
                break;
            default:
                System.out.println("Không là thứ");
                break;

        }
    }
}
