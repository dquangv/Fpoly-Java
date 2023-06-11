package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    abstract public static class SinhVienPoly {

        public String hoTen, nganh;

        public SinhVienPoly() {
        }
        
        public SinhVienPoly(String hoTen, String nganh) {
            this.hoTen = hoTen;
            this.nganh = nganh;
        }

        abstract public double getDiem();

        public String getHocLuc() {
            double diem = getDiem();
            if (diem < 5) {
                return "Yeu";
            } else if (diem < 6.5) {
                return "Trung binh";
            } else if (diem < 7.5) {
                return "Kha";
            } else if (diem < 9) {
                return "Gioi";
            } else {
                return "Xuat sac";
            }
        }

        public void xuat() {
            System.out.println("\nHo ten: " + hoTen);
            System.out.println("Nganh: " + nganh);
            System.out.println("Diem: " + getDiem());
            System.out.println("Hoc luc: " + getHocLuc());
        }

        public void dsSV() {
            ArrayList<SinhVienPoly> dssv = new ArrayList<>();

            while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ho ten: ");
            hoTen = sc.nextLine();
            System.out.print("Nganh: ");
            nganh = sc.nextLine();

            if (nganh.equalsIgnoreCase("IT") || nganh.equalsIgnoreCase("Cong nghe thong tin")) {
                SVIT sv = new SVIT(hoTen, nganh);
                sv.nhapdiem();
                sv.getDiem();
                dssv.add(sv);
            } else if (nganh.equalsIgnoreCase("Marketing") || nganh.equalsIgnoreCase("Mar")) {
                SVMar sv = new SVMar(hoTen, nganh);
                sv.nhapdiem();
                sv.getDiem();
                dssv.add(sv);
            }
                System.out.print("Nhap nua hong? (Y/N): ");
                String check = sc.nextLine();
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }
            
            for (int i = 0; i < dssv.size(); i++) {
                dssv.get(i).xuat();
            }
        }
    }

    public static class SVIT extends SinhVienPoly {

        public double java;
        public double c;

        public SVIT(String hoTen, String nganh) {
            super(hoTen, nganh);
        }

        public void nhapdiem() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap diem java: ");
            java = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap diem c: ");
            c = Double.parseDouble(sc.nextLine());
        }

        @Override
        public double getDiem() {
            return (c + java * 2) / 3;
        }
    }

    public static class SVMar extends SinhVienPoly {

        public double content;
        public double media;
        public double analyst;

        public SVMar(String hoTen, String nganh) {
            super(hoTen, nganh);
        }

        public void nhapdiem() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap diem content: ");
            content = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap diem media: ");
            media = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap diem analyst: ");
            analyst = Double.parseDouble(sc.nextLine());
        }

        @Override
        public double getDiem() {
            return (content * 2 + media * 2 + analyst * 3) / 7;
        }
    }

    public static void main(String[] args) {
        SinhVienPoly svPoly = new SinhVienPoly() {
            @Override
            public double getDiem() {
                return 0;
            }
        };
        svPoly.dsSV();
        
        
    }
}
