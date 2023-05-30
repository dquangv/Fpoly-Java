package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

    public static class SinhVien {

        Scanner sc = new Scanner(System.in);
        private String hoTen, email, sdt, cmnd;

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSdt() {
            return sdt;
        }

        public void setSdt(String sdt) {
            this.sdt = sdt;
        }

        public String getCmnd() {
            return cmnd;
        }

        public void setCmnd(String cmnd) {
            this.cmnd = cmnd;
        }

        public void nhapDS() {
            System.out.print("Ho ten: ");
            hoTen = sc.nextLine();

            while (true) {
                System.out.print("Email: ");
                email = sc.nextLine();

                if (email.matches("\\w+@\\w+\\.\\w+")) {
                    break;
                } else {
                    System.out.println("Nhap dung kieu email dum cai!");
                }

            }

            while (true) {
                System.out.print("So dien thoai: ");
                sdt = sc.nextLine();

                if (sdt.matches("\\d{10}")) {
                    break;
                } else {
                    System.out.println("Nhap du 10 so dum cai ma!");
                }
            }

            while (true) {
                System.out.print("Chung minh nhan dan: ");
                cmnd = sc.nextLine();

                if (cmnd.matches("\\w{12}")) {
                    break;
                } else {
                    System.out.println("Nhap du 12 so dum cai ma!");
                }
            }
        }

        public void xuatDS() {
            System.out.println("\nHo ten: " + hoTen);
            System.out.println("Email: " + email);
            System.out.println("So dien thoai: " + sdt);
            System.out.println("Chung minh nhan dan: " + cmnd);
        }

        public void dsSV() {
            ArrayList<SinhVien> dssv = new ArrayList<>();

            while (true) {
                SinhVien sv = new SinhVien();
                sv.nhapDS();
                dssv.add(sv);

                System.out.print("Nhap nua hong? (Y/N): ");
                String check = sc.nextLine();
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }
            
            System.out.println("Danh sach thong tin");
            for (int i = 0; i < dssv.size(); i++) {
                dssv.get(i).xuatDS();
            }
        }
    }
    
    public static void main(String[] args) {
        SinhVien dssv = new SinhVien();
        dssv.dsSV();
    }
}
