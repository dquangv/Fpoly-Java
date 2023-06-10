package asm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class HanhChinh extends NhanVien {

    @Override
    public BigDecimal getThuNhap() {
        return super.getLuong();
    }

    @Override
    public void nhapThongTin(ArrayList<NhanVien> dsNV) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            NhanVien nvHC = new HanhChinh();

            System.out.print("Ma nhan vien: ");
            nvHC.setMaNV(sc.nextLine());
            System.out.print("Ho ten: ");
            nvHC.setHoTen(sc.nextLine());
            System.out.println("Nganh: ");
            nvHC.setNganh(sc.nextLine());
            System.out.println("Luong co ban: ");
            nvHC.getLuong();
            System.out.println("Thu nhap: ");
            nvHC.getThuNhap();

            dsNV.add(nvHC);

            System.out.print("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
