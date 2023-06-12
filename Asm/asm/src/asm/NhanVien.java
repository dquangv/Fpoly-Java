package asm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NhanVien implements Comparator<NhanVien> {

    Scanner sc = new Scanner(System.in);

    public String maNV, hoTen, viTri;

    //kieu du lieu lon va chinh xac hon double, tuy nhien cach goi va xu ly khac voi kieu thong thuong
    public BigDecimal luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String viTri, BigDecimal luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.viTri = viTri;
        this.luong = luong;
    }

    public BigDecimal getLuong() {
        return luong;
    }

    public void setLuong(BigDecimal luong) {
        this.luong = luong;
    }

    public BigDecimal getThueTN() {
        BigDecimal thueTN;
        BigDecimal luong9000000 = new BigDecimal("9000000");
        BigDecimal luong15000000 = new BigDecimal("15000000");

        if (getThuNhap().compareTo(luong9000000) < 0) {
            thueTN = BigDecimal.ZERO;
        } else if (getThuNhap().compareTo(luong15000000) <= 0) {
            thueTN = getThuNhap().multiply(new BigDecimal("0.1"));
        } else {
            thueTN = getThuNhap().multiply(new BigDecimal("0.12"));
        }

        return thueTN;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getviTri() {
        return viTri;
    }

    public void setviTri(String viTri) {
        this.viTri = viTri;
    }

    public BigDecimal getThuNhap() {
        return getLuong();
    }

    public void xuatThongTin() {
        System.out.println("\nMa nhan vien: " + getMaNV());
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Vi tri: " + getviTri());
        System.out.println("Luong co ban: " + getLuong());
        System.out.println("Thu nhap: " + getThuNhap());
        System.out.println("Thue thu nhap: " + getThueTN());
    }

    //so sanh doi tuong theo thu tu bang chu cai tang dan
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }

}
