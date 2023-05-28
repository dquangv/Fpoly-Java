package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SanPham> dssp = new ArrayList<>();

        do {
            System.out.println("\t\tMENU");
            System.out.println("1. Nhap san pham");
            System.out.println("2. Xuat san pham");
            System.out.println("3. Sap xep san pham theo ten san pham");
            System.out.println("4. Sap xep san pham theo gia san pham");
            System.out.println("5. Ket thuc chuong trinh");
            System.out.print("Ban muon (1-4): ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    System.out.println("NHAP SAN PHAM");
                    do {
                        System.out.print("Ten san pham: ");
                        String tenSp = sc.nextLine();
                        System.out.print("Don gia: ");
                        double donGia = Double.parseDouble(sc.nextLine());
                        System.out.print("Giam gia: ");
                        double giamGia = Double.parseDouble(sc.nextLine());

                        SanPham sp = new SanPham(tenSp, donGia, giamGia);
                        dssp.add(sp);

                        System.out.print("Nhap nua hong? (yes/no): ");
                        String answer = sc.nextLine();

                        if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                            break;
                        }
                    } while (true);

                    break;
                }
                
                case 2: {
                    System.out.println("XUAT SAN PHAM");
                    for (int i = 0; i < dssp.size(); i++) {
                        System.out.println("San pham " + (i + 1));
                        System.out.println("Ten san pham: " + dssp.get(i).getTenSp());
                        System.out.println("Don gia: " + dssp.get(i).getDonGia());
                        System.out.println("Thue nhap khue: " + dssp.get(i).getThueNhapKhau());
                    }
                    break;
                }
                
                case 3:
                    System.out.println("SAP XEP SAN PHAM THEO TEN SAN PHAM");

                    Collections.sort(dssp, new Comparator<SanPham>() {
                        @Override
                        public int compare(SanPham sp1, SanPham sp2) {
                            return sp1.getTenSp().compareToIgnoreCase(sp2.getTenSp());
                        }
                    });
                    System.out.println("Da sap xep xong.");
                    System.out.println("Chon chuc nang 2 de xuat thong tin.");
                    break;
                    
                case 4:
                    System.out.println("SAP XEP SAN PHAM THEO GIA SAN PHAM");

                    Collections.sort(dssp, new Comparator<SanPham>() {
                        @Override
                        public int compare(SanPham sp1, SanPham sp2) {
                            return Double.compare(sp1.getDonGia(), sp2.getDonGia());
                        }
                    });
                    System.out.println("Da sap xep xong.");
                    System.out.println("Chon chuc nang 2 de xuat thong tin.");
                    break;

                default:
                    break;
            }

            System.out.print("Su dung nua hong? (yes/no): ");
            String answer1 = sc.nextLine();

            if (answer1.equalsIgnoreCase("no") || answer1.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

    }
}
