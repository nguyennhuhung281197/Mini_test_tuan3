import java.util.Comparator;

public class Nhan_vien_FullTime extends Nhan_Vien {
    private double soTienThuong;
    private double soTienPhat;
    private double luongCung;

    public Nhan_vien_FullTime() {
    }

    public Nhan_vien_FullTime(double soTienThuong, double soTienPhat, double luongCung) {
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public Nhan_vien_FullTime(int maNhanVien, String hoTen, int tuoi, String sdt, String email, String diaChi, double soTienThuong, double soTienPhat, double luongCung) {
        super(maNhanVien, hoTen, tuoi, sdt, email, diaChi);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public double getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(double soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public double getTinhLuong() {
        return this.luongCung + (this.soTienThuong - this.soTienPhat);
    }

    @Override
    public double getSapXep() {
return getTinhLuong();
    }
    @Override
    public String toString() {
        return "Nhan_vien_FullTime{ " + getTinhLuong() + " } ";
    }


}

    




