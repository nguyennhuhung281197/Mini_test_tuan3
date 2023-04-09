import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Quan_ly {
    public ArrayList<Nhan_Vien> arr = new ArrayList<>();

    public Quan_ly() {

    }

    public void add() {
        arr.add(new Nhan_vien_FullTime(0, "hung", 26, "0", "hung@gmail", "ha noi", 500, 10, 1000));
        arr.add(new Nhan_vien_FullTime(1, "hung", 26, "0", "hung@gmail", "ha noi", 400, 20, 2000));
        arr.add(new Nhan_vien_FullTime(2, "hung", 26, "0", "hung@gmail", "ha noi", 300, 30, 300));
        arr.add(new Nhan_vien_FullTime(3, "hung", 26, "0", "hung@gmail", "ha noi", 200, 40, 400));
        arr.add(new Nhan_Vien_PastTime(4, "dung", 30, "0", "dung@", "ha noi", LocalTime.of(4, 0)));
        arr.add(new Nhan_Vien_PastTime(4, "dung", 30, "0", "dung@", "ha noi", LocalTime.of(5, 0)));
        arr.add(new Nhan_Vien_PastTime(4, "dung", 30, "0", "dung@", "ha noi", LocalTime.of(6, 0)));
        arr.add(new Nhan_Vien_PastTime(4, "dung", 30, "0", "dung@", "ha noi", LocalTime.of(7, 0)));
    }


    public double getLuongFullTime() {
        double tongLuongFullTime = 0;
        for (Nhan_Vien nv : arr) {
            if (nv instanceof Nhan_vien_FullTime) {
                tongLuongFullTime += ((Nhan_vien_FullTime) nv).getTinhLuong();

            }
        }
        return tongLuongFullTime;
    }

    public double getLuongPastTime() {
        double tongLuongPastTime = 0;
        for (Nhan_Vien nv : arr) {
            if (nv instanceof Nhan_Vien_PastTime) {
                tongLuongPastTime += ((Nhan_Vien_PastTime) nv).getTinhLuong();

            }
        }
        return tongLuongPastTime;
    }


    public double getTongLuongTB() {
        double tongTB = (getLuongFullTime() + getLuongPastTime()) / 2;

        return tongTB;
    }

    public void getThapHonLuongTB() {
        double count = 0;
        for (Nhan_Vien nv : arr) {
            if (nv instanceof Nhan_vien_FullTime) {
                count = ((Nhan_vien_FullTime) nv).getTinhLuong();
                count++;
                if (count < getTongLuongTB()) {
                    System.out.println("Lương thấp hơn Lương TB : " + count);
                }
            }
        }
    }

    public void getTongLuongTatCa() {
        double sum = 0;
        sum += (getLuongFullTime() + getLuongPastTime());
        System.out.println("Tổng tất cả lương Trong Công ty : " + sum);
    }

    public void getSapXep() {
        ArrayList<Nhan_Vien> ft = new ArrayList<>();
        for (Nhan_Vien nv : arr) {
            if (nv instanceof Nhan_vien_FullTime) {
                ft.add(nv);
            }
        }
        System.out.println(ft);
    }


    @Override
    public String toString() {
        return "Quan_ly{" +
                "arr=" + arr +
                '}';
    }
}




