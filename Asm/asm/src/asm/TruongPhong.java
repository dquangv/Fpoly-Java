package asm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TruongPhong extends NhanVien {

    BigDecimal trachNhiem;

    public TruongPhong() {
    }

    public BigDecimal getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(BigDecimal trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(BigDecimal trachNhiem, String maNV, String hoTen, String viTri, BigDecimal luong) {
        super(maNV, hoTen, viTri, luong);
        this.trachNhiem = trachNhiem;
    }

    public BigDecimal getThuNhap() {
        return super.getLuong().add((getTrachNhiem()));
    }

    public void xuatThongTin() {
        System.out.println("\nMa nhan vien: " + getMaNV());
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Vi tri: " + getviTri());
        System.out.println("Luong co ban: " + getLuong());
        System.out.println("Luong trach nhiem: " + getTrachNhiem());
        System.out.println("Thu nhap: " + getThuNhap());
        System.out.println("Thue thu nhap: " + getThueTN());
    }
}
