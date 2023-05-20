package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    public class SanPham {

        public String tenSp;
        public double donGia, giamGia;

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ten san pham:");
            this.tenSp = sc.nextLine();

            System.out.println("Don gia:");
            this.donGia = sc.nextFloat();

            System.out.println("Giam gia:");
            this.giamGia = sc.nextFloat();
        }

        public double getThueNhapKhau() {
            double thue = this.donGia*0.1;
            return thue;
        }
    }

}
