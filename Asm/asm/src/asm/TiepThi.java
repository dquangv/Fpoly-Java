package asm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class TiepThi extends NhanVien {

    public BigInteger doanhSo;
    public double hueHong;

    public TiepThi() {
    }

    public TiepThi(BigInteger doanhSo, double hueHong, String maNV, String hoTen, String viTri, BigDecimal luong) {
        super(maNV, hoTen, viTri, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public BigInteger getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(BigInteger doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    public BigDecimal getThuNhap() {
        return super.getLuong().add(new BigDecimal(getDoanhSo()).multiply(BigDecimal.valueOf(getHueHong())));
    }

    public void xuatThongTin() {
        System.out.println("\nMa nhan vien: " + getMaNV());
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Vi tri: " + getviTri());
        System.out.println("Luong co ban: " + getLuong());
        System.out.println("Doanh so ban bang: " + getDoanhSo());
        System.out.println("Phan tram hue hong: " + getHueHong());
        System.out.println("Thu nhap: " + getThuNhap());
        System.out.println("Thue thu nhap: " + getThueTN());
    }
}
