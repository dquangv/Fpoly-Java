package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    public static class SanPham {

        Scanner sc = new Scanner(System.in);
        private String tenSP, hang;
        private double donGia;

        public String getTenSP() {
            return tenSP;
        }

        public void setTenSP(String tenSP) {
            this.tenSP = tenSP;
        }

        public String getHang() {
            return hang;
        }

        public void setHang(String hang) {
            this.hang = hang;
        }

        public double getDonGia() {
            return donGia;
        }

        public void setDonGia(double donGia) {
            this.donGia = donGia;
        }

        public void nhapSP() {
            System.out.print("Ten san pham: ");
            tenSP = sc.nextLine();
            System.out.print("Gia san pham: ");
            donGia = Double.parseDouble(sc.nextLine());
            System.out.print("Hang: ");
            hang = sc.nextLine();
        }

        public void xuatSP() {
            System.out.println("Ten san pham: " + tenSP);
            System.out.println("Gia san pham: " + donGia);
            System.out.println("Hang: " + hang);
        }
    }

    public static class dsSP {

        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> dssp = new ArrayList<>();

        public void dssp() {

            while (true) {
                SanPham sp = new SanPham();
                sp.nhapSP();
                dssp.add(sp);

                System.out.print("Nhap nua hong? (Y/N): ");
                String check = sc.nextLine();
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }

        }

        public void locDSSP() {
            System.out.print("Ten hang muon san xuat: ");
            String find = sc.nextLine();
            for (int i = 0; i < dssp.size(); i++) {
                if (dssp.get(i).getHang().equalsIgnoreCase(find)) {
                    dssp.get(i).xuatSP();
                }
            }
        }
    }

    public static void main(String[] args) {
        dsSP dssp = new dsSP();
        dssp.dssp();
        dssp.locDSSP();
    }
}
