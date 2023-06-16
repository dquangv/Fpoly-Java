package de2;

import de2.Bai1.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> dssv = new ArrayList<>();

    public void nhapSV() {

        while (true) {
            SinhVien sv = new SinhVien();

            System.out.println("Ten sinh vien: ");
            sv.setTenSV(sc.nextLine());
            System.out.println("Ma sinh vien: ");
            sv.setMSSV(Integer.parseInt(sc.nextLine()));
            System.out.println("Nam sinh: ");
            sv.setNamSinh(Integer.parseInt(sc.nextLine()));
            System.out.println("Diem: ");
            sv.setDiem(Double.parseDouble(sc.nextLine()));
            System.out.println("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();

            dssv.add(sv);

            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }

    }

    public void xuatSV() {
        for (int i = 0; i < dssv.size(); i++) {
            dssv.get(i).inThongTin();
        }
    }

    public void quaMon() {
        System.out.println("DANH SACH NHUNG SINH VIEN QUA MON");
        for (int i = 0; i < dssv.size(); i++) {
            if (dssv.get(i).getDiem() >= 5) {
                dssv.get(i).inThongTin();
            }
        }
    }

    public void timSV() {
        System.out.println("Nhap ma sinh vien muon tim: ");
        int ma = Integer.parseInt(sc.nextLine());
        int check = 0;

        for (SinhVien sv : dssv) {
            if (sv.getMSSV() == ma) {
                sv.inThongTin();
                check++;
            }
        }

        if (check == 0) {
            System.out.println("Khong tim thay sinh vien co ma da nhap");
        }
    }

    public void svUDPM() {
        while (true) {

            System.out.println("Ten sinh vien: ");
            String ten = sc.nextLine();
            System.out.println("Ma sinh vien: ");
            int mssv = Integer.parseInt(sc.nextLine());
            System.out.println("Nam sinh: ");
            int namsinh = Integer.parseInt(sc.nextLine());
            System.out.println("Diem Java: ");
            double java = Double.parseDouble(sc.nextLine());
            System.out.println("Diem C: ");
            double c = Double.parseDouble(sc.nextLine());
            System.out.println("Diem: ");
            double diem = Double.parseDouble(sc.nextLine());

            Bai4.SinhVienUDPM sv = new Bai4.SinhVienUDPM(java, c, mssv, namsinh, ten, diem);
            System.out.println("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();

            dssv.add(sv);

            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        xuatSV();
    }
}
