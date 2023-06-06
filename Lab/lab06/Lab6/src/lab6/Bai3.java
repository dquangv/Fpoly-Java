package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

    public static class SinhVien {

        Scanner sc = new Scanner(System.in);
        private String hoTen, email, sdt, cccd;

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

        public String getCccd() {
            return cccd;
        }

        public void setCccd(String cccd) {
            this.cccd = cccd;
        }

        public void nhapDS() {
            System.out.print("Ho ten: ");
            hoTen = sc.nextLine();

            while (true) {
                System.out.print("Email: ");
                email = sc.nextLine();

                if (email.matches("\\w+@fpt.edu.vn")) {
                    break;
                } else {
                    System.out.println("Nhap dung kieu email fpt dum cai ma!");
                }

            }

            while (true) {
                System.out.print("So dien thoai: ");
                sdt = sc.nextLine();

                if (sdt.matches("0\\d{9}")) {
                    break;
                } else {
                    System.out.println("Nhap dung sdt dum cai ma!");
                }
            }

            while (true) {
                System.out.print("Can cuoc cong dan: ");
                cccd = sc.nextLine();

                if (cccd.matches("\\w{12}")) {
                    break;
                } else {
                    System.out.println("Nhap du 12 so dum cai ma!");
                }
            }
        }

        public void xuatDS() {
            System.out.println("\nHo ten: " + getHoTen());
            System.out.println("Email: " + getEmail());
            System.out.println("So dien thoai: " + getSdt());
            System.out.println("Can cuoc cong dan: " + getCccd());
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
