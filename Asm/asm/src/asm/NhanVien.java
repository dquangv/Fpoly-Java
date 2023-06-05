package asm;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien {

    Scanner sc = new Scanner(System.in);
    public String maNV, hoTen;
    public double luong;

    public double getThueTN() {
        if (luong < 9000) {
            return 0;
        } else if (luong <= 15000000) {
            return luong * 0.1;
        } else {
            return luong * 0.12;
        }
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getThuNhap() {
        return luong;
    }

    public void setThuNhap(double luong) {
        this.luong = luong;
    }

    public static void menu() {
        System.out.println("*-------------------------------------------------------------------------------*");
        System.out.println("*\t\t\t\t\tMENU\t\t\t\t\t*");
        System.out.println("*\t 1. \tNhap danh sach nhan vien tu ban phim\t\t\t\t*");
        System.out.println("*\t 2. \tXuat danh sach nhan vien ra ban phim\t\t\t\t*");
        System.out.println("*\t 3. \tTim va hien thi nhan vien theo ma nhap tu ban phim\t\t*");
        System.out.println("*\t 4. \tXoa nhan vien theo ma nhap tu ban phim\t\t\t\t*");
        System.out.println("*\t 5. \tCap nhat thong tin nhan vien theo ma nhap tu ban phim\t\t*");
        System.out.println("*\t 6. \tTim cac nhan vien theo khoang luong nhap tu ban phim\t\t*");
        System.out.println("*\t 7. \tSap xep nhan vien theo ho va ten\t\t\t\t*");
        System.out.println("*\t 8. \tSap xep nhan vien theo thu nhap\t\t\t\t\t*");
        System.out.println("*\t 9. \tXuat 5 nhan vien co thu nhap cao nhat\t\t\t\t*");
        System.out.println("*\t 10. \tKet thuc chuong trinh\t\t\t\t\t\t*");
        System.out.println("*-------------------------------------------------------------------------------*");
    }

    public static void nhapThongTin(ArrayList<NhanVien> dsNV) {
        System.out.println("NHAP DANH SACH NHAN VIEN TU BAN PHIM");
        Scanner sc = new Scanner(System.in);
        while (true) {
            NhanVien nhanVien = new NhanVien();

            System.out.print("Ma nhan vien: ");
            nhanVien.setMaNV(sc.nextLine());
            System.out.print("Ho ten: ");
            nhanVien.setHoTen(sc.nextLine());
            System.out.print("Thu nhap: ");
            nhanVien.setThuNhap(Double.parseDouble(sc.nextLine()));

            dsNV.add(nhanVien);

            System.out.print("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuatThongTin(ArrayList<NhanVien> dsNV) {
        System.out.println("XUAT DANH SACH NHAN VIEN RA MAN HINH");
        for (int i = 0; i < dsNV.size(); i++) {
            System.out.println("\nMa nhan vien: " + dsNV.get(i).getMaNV());
            System.out.println("Ho ten: " + dsNV.get(i).getHoTen());
            System.out.println("Luong: " + dsNV.get(i).getThuNhap());
            System.out.println("Thue thu nhap: " + dsNV.get(i).getThueTN());
        }
    }

    public static void timThongTin(ArrayList<NhanVien> dsNV) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TIM VA HIEN THI NHAN VIEN THEO THONG TIN NHAP TU BAN PHIM");

        System.out.print("Nhap thong tin nhan vien ban muon tim: ");
        String thongTin = sc.nextLine();
        int countCheck = 0;

        for (int i = 0; i < dsNV.size(); i++) {
            if (dsNV.get(i).getMaNV().equalsIgnoreCase(thongTin) || dsNV.get(i).getHoTen().equalsIgnoreCase(thongTin) || String.format("%.0f", dsNV.get(i).getThuNhap()).equalsIgnoreCase(thongTin)) {
                System.out.println("\nMa nhan vien: " + dsNV.get(i).getMaNV());
                System.out.println("Ho ten: " + dsNV.get(i).getHoTen());
                System.out.println("Luong: " + dsNV.get(i).getThuNhap());
                System.out.println("Thue thu nhap: " + dsNV.get(i).getThueTN());
                countCheck++;
            }
        }

        if (countCheck != 0) {
            System.out.println("Khong tim thay thong tin nhan vien thoa du lieu da nhap");
        }
    }

    public static void xoaThongTin(ArrayList<NhanVien> dsNV) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> dsTenXoa = new ArrayList<>();
        System.out.println("XOA NHAN VIEN THEO MA NHAP TU BAN PHIM");
        while (true) {
            System.out.print("Nhap thong tin nhan vien ban muon xoa: ");
            String thongTinXoa = sc.nextLine();

            dsTenXoa.add(thongTinXoa);
            System.out.print("Muon xoa them hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }
        for (int i = 0; i < dsNV.size(); i++) {
            for (int j = 0; i < dsTenXoa.size(); j++) {
                if (dsNV.get(i).getMaNV().equalsIgnoreCase(dsTenXoa.get(j)) || dsNV.get(i).getHoTen().equalsIgnoreCase(dsTenXoa.get(j)) || String.format("%.0f", dsNV.get(i).getThuNhap()).equalsIgnoreCase(dsTenXoa.get(j))) {
                    dsNV.removeAll(dsTenXoa);
                }

            }
        }

        System.out.println("Danh sach sau khi xoa");
        for (int i = 0; i < dsNV.size(); i++) {
            System.out.println("\nMa nhan vien: " + dsNV.get(i).getMaNV());
            System.out.println("Ho ten: " + dsNV.get(i).getHoTen());
            System.out.println("Luong: " + dsNV.get(i).getThuNhap());
            System.out.println("Thue thu nhap: " + dsNV.get(i).getThueTN());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> dsNV = new ArrayList<>();
        do {
            menu();
            try {
                System.out.print("Chon chuc nang: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        nhapThongTin(dsNV);
                        break;
                    case 2:
                        xuatThongTin(dsNV);
                        break;
                    case 3:
                        timThongTin(dsNV);
                        break;
                    case 4:
                        xoaThongTin(dsNV);
                        break;
                    case 5:
                        System.out.println("CAP NHAT THONG TIN NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        break;
                    case 6:
                        System.out.println("TIM CAC NHAN VIEN THEO KHOANG LUONG NHAP TU BAN PHIM");
                        break;
                    case 7:
                        System.out.println("SAP XEP NHAN VIEN THEO HO VA TEN");
                        break;
                    case 8:
                        System.out.println("SAP XEP NHAN VIEN THEO THU NHAP");
                        break;
                    case 9:
                        System.out.println("XUAT 5 NHAN VIEN CO THU NHAP CAO NHAT");
                        break;
                    case 10:
                        System.out.println("Cam on da su dung dich vu!");
                        System.exit(0);
                    default:
                        System.out.println("Nhap dung dum cai ma!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("nhap so tu 1 den 10 dum cai!");

            }
        } while (true);
    }

}
