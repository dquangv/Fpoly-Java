package asm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class TiepThi extends NhanVien {
    public BigInteger doanhSo;
    public double hueHong;

    public TiepThi() {
    }

    public TiepThi(BigInteger doanhSo, double hueHong, String maNV, String hoTen, BigDecimal luong) {
        super(maNV, hoTen, luong);
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

    @Override
    public BigDecimal getThuNhap() {
        return super.getThuNhap().add(new BigDecimal(getDoanhSo()).multiply(BigDecimal.valueOf(getHueHong())));
    }
    
    
    @Override
    public void xuatThongTin(ArrayList<NhanVien> dsNV) {
        for (int i = 0; i < dsNV.size(); i++) {
            System.out.println("\nMa nhan vien: " + dsNV.get(i).getMaNV());
            System.out.println("Ho ten: " + dsNV.get(i).getHoTen());
            System.out.println("Vi tri: Tiep thi");
            System.out.println("Luong co ban: " + dsNV.get(i));
            System.out.println("Doanh so ban hang: " + dsNV.get(i));
            System.out.println("Phan tram hue hong: "+ dsNV.get(i));
            System.out.println("Thue thu nhap: " + dsNV.get(i).getThueTN());
        }
    }
}
