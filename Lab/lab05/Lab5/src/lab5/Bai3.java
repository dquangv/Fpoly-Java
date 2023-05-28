package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

    public class SanPham {

        String tenSP;
        double giaSP;

        public void SanPham(String tenSP, double giaSP) {
            this.tenSP = tenSP;
            this.giaSP = giaSP;
        }

        public String getTenSP() {
            return tenSP;
        }

        public void setTenSP(String tenSP) {
            this.tenSP = tenSP;
        }

        public double getGiaSP() {
            return giaSP;
        }

        public void setGiaSP(double giaSP) {
            this.giaSP = giaSP;
        }
    }

    public class dsSP {

        public void menu() {
            System.out.println("\t\tMENU");
            System.out.println("1. Nhap danh sach ho va ten");
            System.out.println("2. Xuat danh sach ho va ten");
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat danh sach");
            System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
            System.out.println("6. Ket thuc");
            System.out.print("Ban muon (1-6): ");
        }

        public void nhapSP(ArrayList<SanPham> dssp) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Ten san pham: ");
                
                System.out.println("Gia san pham: ");
                

                System.out.println("Nhap nua hong? (Y/N): ");
                String check = sc.nextLine();
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }

        public void xuatSP(ArrayList<Object> dssp) {
            System.out.println("Danh sach san pham");
            for (int i = 0; i < dssp.size(); i++) {
                System.out.print(dssp.get(i));
            }
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<SanPham> dssp = new ArrayList<>();
        SanPham sp = new SanPham();
        
        
    }
    
}
