package com.t3h.bai2;
public class ChuanHoa {
    String str = "53+4-5-6+9+1--+4-+23-5";
    public void ChuanHoa(){
        str = str.replace("-+", "-");
        str = str.replace("+-", "-");
        str = str.replace("--", "-0-");
        str = str.replace("++", "+0+");
        System.out.println(str);
    }
    public void tinhTong() {
        int gttong = 0;
        int value = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) <= 57 && 48 <= str.charAt(i)) {
                value = Integer.parseInt(String.valueOf(str.charAt(i)));
                temp = temp * 10 + value;
            } else {
                if (str.charAt(i) <= 57 && 48 <= str.charAt(i) && str.charAt(i - 1) != 45 && str.charAt(i - 1) != 43) {
                    value = Integer.parseInt(String.valueOf(str.charAt(i)));
                    temp = temp * 10 + value;
                }else if (str.charAt(i - 1) == 45 && str.charAt(i) <= 57 && 48 <= str.charAt(i)) {
                    value = Integer.parseInt(String.valueOf(str.charAt(i)));
                    gttong = gttong  - value;
                } else if (str.charAt(i - 1) == 43 && str.charAt(i) <= 57 && 48 <= str.charAt(i)) {
                    value = Integer.parseInt(String.valueOf(str.charAt(i)));
                    gttong = gttong  + value;
                }else if (str.charAt(i) == 43 && str.charAt(i-2) <= 57 && 48 <= str.charAt(i-2) || str.charAt(i) == 45 && str.charAt(i-2) <= 57 && 48 <= str.charAt(i-2) ) {
                    gttong =  temp;
                    temp = 0;
                } else if (str.charAt(i) == 43) {
                    gttong = gttong + temp;
                    temp = 0;
                } else if (str.charAt(i) == 45) {
                    gttong = gttong - temp;
                    temp = 0;
                }
            }
        }
        System.out.println(gttong);
    }
}
