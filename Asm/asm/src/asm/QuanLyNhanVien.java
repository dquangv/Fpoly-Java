package asm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien extends NhanVien {

    ArrayList<NhanVien> dsNV = new ArrayList<>();

    public void menu() {
        System.out.println("*-------------------------------------------------------------------------------*");
        System.out.println("*\t\t\t\tMENU\t\t\t\t\t\t*");
        System.out.println("*\t 1. \tNhap danh sach nhan vien tu ban phim\t\t\t\t*");
        System.out.println("*\t 2. \tXuat danh sach nhan vien ra ban phim\t\t\t\t*");
        System.out.println("*\t 3. \tTim va hien thi nhan vien theo ma nhap tu ban phim\t\t*");
        System.out.println("*\t 4. \tXoa nhan vien theo ma nhap tu ban phim\t\t\t\t*");
        System.out.println("*\t 5. \tCap nhat thong tin nhan vien theo ma nhap tu ban phim\t\t*");
        System.out.println("*\t 6. \tTim cac nhan vien theo khoang luong nhap tu ban phim\t\t*");
        System.out.println("*\t 7. \tSap xep nhan vien theo ho va ten\t\t\t\t*");
        System.out.println("*\t 8. \tSap xep nhan vien theo thu nhap\t\t\t\t*");
        System.out.println("*\t 9. \tXuat 5 nhan vien co thu nhap cao nhat\t\t\t\t*");
        System.out.println("*\t 10. \tKet thuc chuong trinh\t\t\t\t\t\t*");
        System.out.println("*-------------------------------------------------------------------------------*");
    }

    public void nhapDanhSach() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            //nhap thong tin dau vao
            System.out.print("Ma nhan vien: ");
            String maNV = sc.nextLine();
            System.out.print("Ho ten: ");
            String ten = sc.nextLine();
            System.out.print("Vi tri: ");
            String viTri = sc.nextLine();

            //tao doi tuong rieng dua tren thong tin vi tri duoc nhap
            if (viTri.equalsIgnoreCase("Hanh chinh")) {
                NhanVien nvHC = new NhanVien();

                //thiet lap thong tin nhap ben tren vao doi tuong
                nvHC.setMaNV(maNV);
                nvHC.setHoTen(ten);
                nvHC.setviTri(viTri);

                //them thong tin moi cho doi tuong
                System.out.print("Luong co ban: ");
                nvHC.setLuong(new BigDecimal(sc.nextLine()));

                //them doi tuong vao danh sach
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
                System.out.print("Phan tram hue hong: ");
                nvTT.setHueHong(Double.parseDouble(sc.nextLine()));

                dsNV.add(nvTT);

            } else if (viTri.equalsIgnoreCase("Truong phong")) {
                TruongPhong nvTP = new TruongPhong();

                nvTP.setMaNV(maNV);
                nvTP.setHoTen(ten);
                nvTP.setviTri(viTri);

                System.out.print("Luong co ban: ");
                nvTP.setLuong(new BigDecimal(sc.nextLine()));
                System.out.print("Luong trach nhiem: ");
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

        for (int i = 0; i < dsNV.size(); i++) {
            dsNV.get(i).xuatThongTin();
        }

    }

    public void timThongTin() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thong tin nhan vien ban muon tim: ");
        String thongTin = sc.nextLine();

        //bien dem de xac dinh co tim thay du lieu hay khong
        int countCheck = 0;

        for (int i = 0; i < dsNV.size(); i++) {

            //tra thong tin da nhap voi ma nhan vien, ho ten, thu nhap va thue
            if (dsNV.get(i).getMaNV().equalsIgnoreCase(thongTin) || dsNV.get(i).getHoTen().equalsIgnoreCase(thongTin) || String.format("%.0f", dsNV.get(i).getThuNhap()).equalsIgnoreCase(thongTin) || dsNV.get(i).getviTri().equalsIgnoreCase(thongTin) || String.format("%.0f", dsNV.get(i).getThueTN()).equalsIgnoreCase(thongTin)) {
                dsNV.get(i).xuatThongTin();

                //thay doi bien dem de xac dinh da tim thay du lieu
                countCheck++;
            }
        }

        //bien dem giu nguyen gia tri ban dau thi khong tim thay du lieu
        if (countCheck == 0) {
            System.out.println("Khong tim thay thong tin nhan vien thoa du lieu da nhap");
        }
    }

    public void xoaThongTin() {

        Scanner sc = new Scanner(System.in);

        //them danh sach thong tin xoa de co the xoa 1 luc nhieu thong tin
        ArrayList<NhanVien> dsXoa = new ArrayList<>();

        while (true) {
            System.out.print("Nhap thong tin nhan vien ban muon xoa: ");
            String thongTinXoa = sc.nextLine();

            for (NhanVien nv : dsNV) {

                if (nv.getMaNV().equalsIgnoreCase(thongTinXoa) || nv.getHoTen().equalsIgnoreCase(thongTinXoa) || String.format("%.0f", nv.getThuNhap()).equalsIgnoreCase(thongTinXoa) || nv.getviTri().equalsIgnoreCase(thongTinXoa) || String.format("%.0f", nv.getThueTN()).equalsIgnoreCase(thongTinXoa)) {
                    dsXoa.add(nv);
                }
            }

            System.out.print("Muon xoa them hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }

        //xoa thong tin trong danh sach nhan vien tu danh sach xoa
        dsNV.removeAll(dsXoa);

        System.out.println("Danh sach sau khi xoa");
        xuatDanhSach();
    }

    public void capNhatThongTin() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten nhan vien ban muon cap nhat thong tin: ");
        String nameCheck = sc.nextLine();

        //tao bien de kiem tra co tim thay ten cua nhan vien can cap nhat khong
        boolean found = false;

        for (NhanVien nv : dsNV) {

            if (nv.getHoTen().equalsIgnoreCase(nameCheck)) {

                //gan gia tri khac cho bien de xac dinh da tim thay ten cua nhan vien can cap nhat
                found = true;

                //xac dinh thong tin muon cap nhat
                System.out.print("Nhap thong tin ban muon cap nhat (ma nhan vien, ho ten, luong co ban): ");
                String infoCheck = sc.nextLine();

                switch (infoCheck) {
                    case "ma nhan vien":
                        System.out.print("Nhap ma nhan vien moi: ");
                        nv.setMaNV(sc.nextLine());
                        break;
                    case "ho ten":
                        System.out.print("Nhap ho ten moi: ");
                        nv.setHoTen(sc.nextLine());
                        break;
                    case "luong co ban":
                        System.out.print("Nhap luong co ban moi: ");
                        nv.setLuong(new BigDecimal(sc.nextLine()));
                        break;
                    default:
                        System.out.println("Thong tin nay khong ton tai");
                        break;
                }
            }
        }

        //thong bao neu khong tim thay ten nhan vien da nhap
        if (!found) {
            System.out.println("Khong tim thay nhan vien co ten: " + nameCheck);
        } else {
            System.out.println("\nDanh sach sau khi cap nhat");
            xuatDanhSach();
        }
    }

    public void timLuong() {

        Scanner sc = new Scanner(System.in);

        //nhập 2 đầu thu nhập, phân tách bằng khoảng trắng (ví dụ tìm thu nhập trong khoảng từ 1tr đến 5tr thì nhập: 1000000 5000000)
        System.out.print("Nhap khoang thu nhap ma ban muon tim: ");

        //gán vào biến có kiểu dữ liệu là String để phân tách
        String khoangLuong = sc.nextLine();

        //tạo mảng chứa dữ liệu được phân tách
        String[] mocLuong = khoangLuong.split(" ");

        //tạo danh sách chứa thông tin những nhân viên thuộc khoảng thu nhập đang tìm
        ArrayList<NhanVien> nvLuong = new ArrayList<>();

        //biến xác định có tìm thấy dữ liệu thoả không
        int check = 0;

        for (int i = 0; i < dsNV.size(); i++) {

            //chuyển đổi kiểu dữ liệu String trong mảng chứa dữ liệu được phân tách thành BigDecimal rồi so sánh với thu nhập của đối tượng
            if (dsNV.get(i).getThuNhap().compareTo(new BigDecimal(mocLuong[0])) >= 0 && dsNV.get(i).getThuNhap().compareTo(new BigDecimal(mocLuong[1])) <= 0) {

                //thoả điều kiện thì thêm vào danh sách riêng đã tạo
                nvLuong.add(dsNV.get(i));

                check++;
            }
        }

        if (check == 0) {

            System.out.printf("\nKhong co nhan vien nao co muc luong trong khoang %s den %s", mocLuong[0], mocLuong[1]);

        } else {

            System.out.printf("\nDanh sach nhan vien co luong trong khoang %s den %s\n", mocLuong[0], mocLuong[1]);

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

            //ghi đè để so sánh theo kiểu dữ liệu số
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

            //ghi đè ở trên nằm trong phương thức nên chỉ có hiệu lực bên trong phương thức đó, vì vậy ở phương thức này cần ghi đè lại để sử dụng trong phương thức này
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getThuNhap().compareTo(o2.getThuNhap());
            }
        });

        //sắp xếp theo chiều ngược lại (giảm dần, ở trên là tăng dần)
        Collections.reverse(dsNV);

        for (int i = 0; i < 5; i++) {
            dsNV.get(i).xuatThongTin();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        do {
            qlnv.menu();

            try {
                System.out.print("Chon chuc nang: ");
                
                //không ép kiểu để khi chạy case 9, máy đọc kiểu dữ liệu số thì sẽ không chạy qua đoạn catch
                int choice = sc.nextInt();

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

                        //kết thúc chương trình (thoát khỏi vòng lặp)
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
