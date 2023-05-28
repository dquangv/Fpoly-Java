package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {

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

    public void nhapDS(ArrayList<String> dsHoTen) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ho va ten: ");
            dsHoTen.add(sc.nextLine());

            System.out.print("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuatDS(ArrayList<String> dsHoTen) {
        System.out.println("Danh sach ho va ten");
        for (String ten : dsHoTen) {
            System.out.println(ten);
        }
    }

    public void dsNgauNhien(ArrayList<String> dsHoTen) {
        Collections.shuffle(dsHoTen);
        System.out.println("Danh sach ho va ten ngau nhien");
        for (String ten : dsHoTen) {
            System.out.println(ten);
        }
    }

    public void sapXepDS(ArrayList<String> dsHoTen) {
        Collections.sort(dsHoTen);
        Collections.reverse(dsHoTen);
        System.out.println("Danh sach sap xep ho va ten theo thu tu giam dan");
        for (String ten : dsHoTen) {
            System.out.println(ten);
        }
    }

    public void timVaXoaDS(ArrayList<String> dsHoTen) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> dsTenXoa = new ArrayList<>();
        while (true) {
            System.out.print("Ho va ten ban muon xoa: ");
            String tenXoa = sc.nextLine();

            dsTenXoa.add(tenXoa);
            System.out.print("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                break;
            }
        }

        dsHoTen.removeAll(dsTenXoa);
        
        for (String ten : dsHoTen) {
            System.out.println(ten);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> dsHoTen = new ArrayList<>();
        Bai2 danhSachHoTen = new Bai2();
        do {
            danhSachHoTen.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    danhSachHoTen.nhapDS(dsHoTen);
                    break;
                case 2:
                    danhSachHoTen.xuatDS(dsHoTen);
                    break;
                case 3:
                    danhSachHoTen.dsNgauNhien(dsHoTen);
                    break;
                case 4:
                    danhSachHoTen.sapXepDS(dsHoTen);
                    break;
                case 5:
                    danhSachHoTen.timVaXoaDS(dsHoTen);
                    break;
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
