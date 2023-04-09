import java.time.LocalTime;

public class Nhan_Vien_PastTime extends Nhan_Vien {
    LocalTime gioLamViec;

    public Nhan_Vien_PastTime() {
    }

    public Nhan_Vien_PastTime(LocalTime gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public Nhan_Vien_PastTime(int maNhanVien, String hoTen, int tuoi, String sdt, String email, String diaChi, LocalTime gioLamViec) {
        super(maNhanVien, hoTen, tuoi, sdt, email, diaChi);
        this.gioLamViec = gioLamViec;
    }

    public LocalTime getGioLamViec() {
        return gioLamViec;
    }

    public void setTime(LocalTime gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    @Override
    public double getTinhLuong() {
        return this.gioLamViec.getHour() * 100;
    }

    @Override
    public double getSapXep() {
        return getTinhLuong();
    }

    @Override
    public String toString() {
        return "Nhan_Vien_PastTime{ " + getTinhLuong() + " }";
    }

}
