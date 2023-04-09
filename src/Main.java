import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Quan_ly quanLy = new Quan_ly();

        quanLy.add();
        System.out.println(quanLy);
     // Tổng trung bình lương của công ty
        System.out.println("Luong TB Ca Cty : " + quanLy.getTongLuongTB());
     // Lương full time thấp hơn lương trung bình
        quanLy.getThapHonLuongTB();
     // Lương của cả công ty
        quanLy.getTongLuongTatCa();
     // Sắp xếp lương tăng dần của cả công ty
        Collections.sort(quanLy.arr);
        System.out.println(quanLy);

    }
}

