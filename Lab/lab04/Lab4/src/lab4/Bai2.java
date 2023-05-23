package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    public class SanPham {

        public String maSanPham;
        public String tenSanPham;
        public double giaSanPham;

        public SanPham(String maSanPham, String tenSanPham, double giaSanPham) {
            this.maSanPham = maSanPham;
            this.tenSanPham = tenSanPham;
            this.giaSanPham = giaSanPham;
        }

    }

    public ArrayList<SanPham> nhapSP(int num) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SanPham> dssp = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.print("Ma san pham: ");
            String maSP = sc.nextLine();
            System.out.print("Ten san pham: ");
            String tenSP = sc.nextLine();
            System.out.print("Gia san pham: ");
            double giaSP = Double.parseDouble(sc.nextLine());

            SanPham sanpham = new SanPham(maSP, tenSP, giaSP);
            dssp.add(sanpham);
        }

        return dssp;
    }

    public void xuatSP() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong san pham: ");
        int num = Integer.parseInt(sc.nextLine());

        ArrayList<SanPham> dssp = nhapSP(num);

        for (int i = 0; i < num; i++) {
            System.out.println("San pham " + (i + 1));
            System.out.println("Ma san pham: " + dssp.get(i).maSanPham);
            System.out.println("Ten san pham: " + dssp.get(i).tenSanPham);
            System.out.println("Gia san pham: " + dssp.get(i).giaSanPham);
        }

    }

    public static void main(String[] args) {
        Bai2 dssp = new Bai2();
        dssp.xuatSP();
    }
}
