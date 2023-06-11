package asm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien extends NhanVien {

    ArrayList<NhanVien> dsNV = new ArrayList<>();

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

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Ma nhan vien: ");
            String maNV = sc.nextLine();
            System.out.print("Ho ten: ");
            String ten = sc.nextLine();
            System.out.print("Vi tri: ");
            String viTri = sc.nextLine();
            if (viTri.equalsIgnoreCase("Hanh chinh")) {
                NhanVien nvHC = new NhanVien();
                nvHC.setMaNV(maNV);
                nvHC.setHoTen(ten);
                nvHC.setviTri(viTri);
                System.out.print("Luong co ban: ");
                nvHC.setLuong(new BigDecimal(sc.nextLine()));
                dsNV.add(nvHC);
            } else if (viTri.equalsIgnoreCase("Tiep thi")) {
                TiepThi nvTT = new TiepThi();
                nvTT.setMaNV(maNV);
                nvTT.setHoTen(ten);
                nvTT.setviTri(viTri);
                System.out.print("Luong co ban: ");
                nvTT.setLuong(new BigDecimal(sc.nextLine()));
                System.out.print("Doanh so ban hang: ");
                nvTT.setDoanhSo(new BigInteger(sc.nextLine()));
                System.out.println("Phan tram hue hong: ");
                nvTT.setHueHong(Double.parseDouble(sc.nextLine()));
                dsNV.add(nvTT);
            } else if (viTri.equalsIgnoreCase("Truong phong")) {
                TruongPhong nvTP = new TruongPhong();
                nvTP.setMaNV(maNV);
                nvTP.setHoTen(ten);
                nvTP.setviTri(viTri);
                System.out.println("Luong co ban: ");
                nvTP.setLuong(new BigDecimal(sc.nextLine()));
                System.out.println("Luong trach nhiem: ");
                nvTP.setTrachNhiem(new BigDecimal(sc.nextLine()));
                dsNV.add(nvTP);
            } else {
                System.out.println("Khong ton tai vi tri nay");
            }

            System.out.print("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }

        }

    }

    public void xuatDanhSach() {
        for (NhanVien nv : dsNV) {
            nv.xuatThongTin();
        }
    }

    public void timThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thong tin nhan vien ban muon tim: ");
        String thongTin = sc.nextLine();
        int countCheck = 0;

        for (int i = 0; i < dsNV.size(); i++) {
            if (dsNV.get(i).getMaNV().equalsIgnoreCase(thongTin) || dsNV.get(i).getHoTen().equalsIgnoreCase(thongTin) || String.format("%.0f", dsNV.get(i).getThuNhap()).equalsIgnoreCase(thongTin)) {
                dsNV.get(i).xuatThongTin();
                countCheck++;
            }
        }

        if (countCheck == 0) {
            System.out.println("Khong tim thay thong tin nhan vien thoa du lieu da nhap");
        }
    }

    public void xoaThongTin() {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> dsXoa = new ArrayList<>();

        while (true) {
            System.out.print("Nhap thong tin nhan vien ban muon xoa: ");
            String thongTinXoa = sc.nextLine();

            for (NhanVien nv : dsNV) {
                if (nv.getMaNV().equalsIgnoreCase(thongTinXoa) || nv.getHoTen().equalsIgnoreCase(thongTinXoa) || String.format("%.0f", nv.getThuNhap()).equalsIgnoreCase(thongTinXoa)) {
                    dsXoa.add(nv);
                }
            }

            System.out.print("Muon xoa them hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }

        dsNV.removeAll(dsXoa);

        System.out.println("Danh sach sau khi xoa");
        xuatDanhSach();
    }

    public void capNhatThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien ban muon cap nhat thong tin: ");
        String nameCheck = sc.nextLine();

        boolean found = false;

        for (NhanVien nv : dsNV) {
            if (nv.getHoTen().equalsIgnoreCase(nameCheck)) {
                found = true;
                System.out.print("Nhap thong tin ban muon cap nhat (ma, ho ten, luong): ");
                String infoCheck = sc.nextLine();

                switch (infoCheck) {
                    case "ma":
                        System.out.print("Nhap ma nhan vien moi: ");
                        nv.setMaNV(sc.nextLine());
                        break;
                    case "ho ten":
                        System.out.println("Nhap ho ten moi: ");
                        nv.setHoTen(sc.nextLine());
                        break;
                    case "luong":
                        System.out.println("Nhap luong co ban moi: ");
                        nv.setLuong(new BigDecimal(sc.nextLine()));
                        break;
                    default:
                        System.out.println("Muc thong tin khong hop le");
                        break;
                }
            }
        }

        if (!found) {
            System.out.println("Khong tim thay nhan vien co ten: " + nameCheck);
        } else {
            System.out.println("Danh sach sau khi cap nhat");
            xuatDanhSach();
        }
    }

    public void timLuong() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap khoang luong ma ban muon tim: ");
        String khoangLuong = sc.nextLine();

        String[] mocLuong = khoangLuong.split(" ");

        ArrayList<NhanVien> nvLuong = new ArrayList<>();

        int check = 0;

        for (int i = 0; i < dsNV.size(); i++) {
            if (dsNV.get(i).getThuNhap().compareTo(new BigDecimal(mocLuong[0])) >= 0 && dsNV.get(i).getThuNhap().compareTo(new BigDecimal(mocLuong[1])) <= 0) {
                nvLuong.add(dsNV.get(i));
                check++;
            }
        }

        if (check == 0) {
            System.out.printf("Khong co nhan vien nao co muc luong trong khoang %s den %s", mocLuong[0], mocLuong[1]);
        } else {
            System.out.printf("Danh sach nhan vien co luong trong khoang %s den %s\n", mocLuong[0], mocLuong[1]);
            for (NhanVien nv : nvLuong) {
                nv.xuatThongTin();
            }
        }
    }

    public void sapXepTen() {
        Collections.sort(dsNV, new NhanVien());
        System.out.println("Danh sach nhan vien sau khi sap xep theo ten");
        xuatDanhSach();
    }

    public void sapXepThuNhap() {
        Collections.sort(dsNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getThuNhap().compareTo(o2.getThuNhap());
            }
        });

        System.out.println("Danh sach nhan vien sau khi sap xep theo thu nhap");
        xuatDanhSach();
    }

    public void topLuong() {
        Collections.sort(dsNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getThuNhap().compareTo(o2.getThuNhap());
            }
        });
        Collections.reverse(dsNV);
        for (int i = 0; i < 5; i++) {
            dsNV.get(i).xuatThongTin();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        do {

            try {
                System.out.print("Chon chuc nang: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("NHAP DANH SACH NHAN VIEN TU BAN PHIM");
                        qlnv.nhapDanhSach();
                        break;
                    case 2:
                        System.out.println("XUAT DANH SACH NHAN VIEN RA MAN HINH");
                        qlnv.xuatDanhSach();
                        break;
                    case 3:
                        System.out.println("TIM VA HIEN THI NHAN VIEN THEO THONG TIN NHAP TU BAN PHIM");
                        qlnv.timThongTin();
                        break;
                    case 4:
                        System.out.println("XOA NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        qlnv.xoaThongTin();
                        break;
                    case 5:
                        System.out.println("CAP NHAT THONG TIN NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        qlnv.capNhatThongTin();
                        break;
                    case 6:
                        System.out.println("TIM CAC NHAN VIEN THEO KHOANG LUONG NHAP TU BAN PHIM");
                        qlnv.timLuong();
                        break;
                    case 7:
                        System.out.println("SAP XEP NHAN VIEN THEO HO VA TEN");
                        qlnv.sapXepTen();
                        break;
                    case 8:
                        System.out.println("SAP XEP NHAN VIEN THEO THU NHAP");
                        qlnv.sapXepThuNhap();
                        break;
                    case 9:
                        System.out.println("XUAT 5 NHAN VIEN CO THU NHAP CAO NHAT");
                        qlnv.topLuong();
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
