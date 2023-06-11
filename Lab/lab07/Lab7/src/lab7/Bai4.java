package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import lab7.Bai2.SinhVienPoly;
import lab7.Bai3.SinhVienIT;
import lab7.Bai3.dssv;

public class Bai4 extends dssv {

    class CompareDiem implements Comparator<SinhVienPoly> {
        @Override
        public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
            double diem1 = sv1.getDiem();
            double diem2 = sv2.getDiem();
            
            if (diem1 < diem2) {
                return -1;
            } else if (diem1 > diem2) {
                return 1;
            } 
            
            return 0;
        }
    }
    
    public static void menu() {
        System.out.println("\t\tMENU");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat thong tin danh sach sinh vien");
        System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4. Sap xep danh sach sinh vien theo diem");
        System.out.println("5. Xuat danh sach sinh vien theo nganh hoc");
        System.out.println("6. Ket thuc");
        System.out.print("Ban muon (1-6): ");
    }
    
    public void locSV() {
        for (int i = 0; i < dssv.size(); i++) {
            if (dssv.get(i).getHocLuc().equalsIgnoreCase("Gioi")) {
                dssv.get(i).xuat();
            }
        }
    }
    
    public void sapXepSV() {
        Collections.sort(dssv, new CompareDiem());
        for (int i = 0; i < dssv.size(); i++) {
            dssv.get(i).xuat();
        }
    }
    
    public void xuatDSSVNganh() {
        
        ArrayList<SinhVienPoly> dsSVIT = new ArrayList<>();
        ArrayList<SinhVienPoly> dsSVBIZ = new ArrayList<>();
        
        for (int i = 0 ; i < dssv.size(); i++) {
            boolean check = dssv.get(i) instanceof SinhVienIT;
            if (check) {
                dsSVIT.add(dssv.get(i));
            } else {
                dsSVBIZ.add(dssv.get(i));
            }
        }
        
        System.out.println("\nDanh sach sinh vien IT");
        for (int i =0; i <dsSVIT.size();i++) {
            dsSVIT.get(i).xuat();
        }
        
        System.out.println("\nDanh sach sinh vien Biz");
        for (int i=0; i <dsSVBIZ.size();i++) {
            dsSVBIZ.get(i).xuat();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai4 dssv = new Bai4();
        do {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    dssv.nhapDSSV();
                    break;
                case 2:
                    dssv.xuatDSSV();
                    break;
                case 3:
                    dssv.locSV();
                    break;
                case 4:
                    dssv.sapXepSV();
                    break;
                case 5:
                    dssv.xuatDSSVNganh();
                    break;
                case 6:
                    System.out.println("Cam on da su dung dich vu");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai goi ma");
                    break;
            }

            System.out.print("Su dung nua hong? (yes/no): ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

    
}

