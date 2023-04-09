import java.time.LocalTime;
import java.util.List;

public abstract class Nhan_Vien implements Comparable<Nhan_Vien>{
    protected int maNhanVien;
    protected String hoTen;
    protected int tuoi;
    protected String sdt;
    protected String email;
    protected String diaChi;

    public Nhan_Vien() {
    }

    public Nhan_Vien(int maNhanVien, String hoTen, int tuoi, String sdt, String email, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract double getTinhLuong();
    public abstract double getSapXep();
    public int compareTo(Nhan_Vien o) {
       if (getSapXep() < o.getSapXep()){
           return -1;
       }else if (getSapXep() > o.getSapXep()){
           return 1;
       }else {
           return 0;
       }
    }
}
