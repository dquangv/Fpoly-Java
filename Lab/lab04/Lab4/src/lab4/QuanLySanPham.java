package lab4;

import java.util.Scanner;

public class QuanLySanPham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t\tMENU");
        System.out.println("1. Nhap san pham");
        System.out.println("2. Xuat san pham");
        System.out.println("3. Sap xep san pham theo ten san pham");
        System.out.println("4. Sap xep san pham theo gia san pham");
        System.out.println("5. Ket thuc chuong trinh");
        System.out.println("Ban muon (1-4): ");
        
        int choice = Integer.parseInt(sc.nextLine());
        
        switch (choice) {
            case 1:
                System.out.println("NHAP SAN PHAM");
            case 2:
                System.out.println("XUAT SAN PHAM");
            case 3:
                System.out.println("SAP XEP SAN PHAM THEO TEN SAN PHAM");
            case 4:
                System.out.println("SAP XEP SAN PHAM THEO GIA SAN PHAM");
        }
        
        
    }
}
