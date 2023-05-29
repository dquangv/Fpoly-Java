package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {

    public static class SanPham implements Comparator<SanPham> {

        private String tenSP;
        private double giaSP;

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

        @Override
        public int compare(SanPham o1, SanPham o2) {
            return Double.compare(o2.giaSP, o1.giaSP);
        }

    }

    public static class dsSP {
        
        ArrayList<SanPham> dssp = new ArrayList();

        public void menu() {
            System.out.println("\t\tMENU");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Sap xep giam dan va xuat danh sach");
            System.out.println("3. Tim va xoa ho ten nhap tu ban phim");
            System.out.println("4. Xuat gia trung binh cua cac san pham");
            System.out.println("5. Ket thuc");
            System.out.print("Ban muon (1-5): ");
        }

        public void nhapSP() {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Ten san pham: ");
                String ten = sc.nextLine();
                System.out.print("Gia san pham: ");
                double gia = Double.parseDouble(sc.nextLine());

                SanPham sp = new SanPham();
                sp.setTenSP(ten);
                sp.setGiaSP(gia);
                dssp.add(sp);
                System.out.print("Nhap nua hong? (Y/N): ");
                String check = sc.nextLine();
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }


        public void sapXepDS() {
            Collections.sort(dssp, new SanPham());
            for (int i = 0; i < dssp.size(); i++) {
                System.out.println("San pham " + (i + 1));
                System.out.println("Ten san pham: " + dssp.get(i).getTenSP());
                System.out.println("Gia san pham: " + dssp.get(i).getGiaSP() + "\n");
            }
        }
        
        public void timVaXoaDS() {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> dsTenXoa = new ArrayList<>();
            
            while(true) {
                System.out.print("Ten san pham muon xoa: ");
                String tenXoa = sc.nextLine();
                
                dsTenXoa.add(tenXoa);
                System.out.print("Nhap nua hong? (Y/N): ");
                String check = sc.nextLine();
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }
            
            dssp.removeIf(sp -> dsTenXoa.contains(sp.getTenSP()));
            for (int i = 0; i < dssp.size(); i++) {
                System.out.println("San pham " + (i + 1));
                System.out.println("Ten san pham: " + dssp.get(i).getTenSP());
                System.out.println("Gia san pham: " + dssp.get(i).getGiaSP() + "\n");
            }
        }
        
        public double tinhGiaTrungBinh() {
            double tongGia = 0;
            for (SanPham sp: dssp) {
                tongGia += sp.getGiaSP();
            }
            
            return tongGia/dssp.size();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dsSP ds = new dsSP();
        
        do {
            ds.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                   ds.nhapSP();
                   break;
                case 2:
                    ds.sapXepDS();
                    break;
                case 3:
                   ds.timVaXoaDS();
                   break;
                case 4:
                    System.out.println("Gia trung binh cua cac san pham: "+ds.tinhGiaTrungBinh());
                default:
                    System.exit(0);
            }
            
            System.out.print("Su dung nua hong? (yes/no): ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

}

