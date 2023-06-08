package asm;

import java.math.BigDecimal;
import java.math.BigInteger;

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
        return super.getThuNhap() + getDoanhSo() * getHueHong();
    }
    
    
}
