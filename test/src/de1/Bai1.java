package de1;

import java.util.Scanner;

public class Bai1 {

    public static void tongChan_tongLe(int[] arr) {
        Scanner sc = new Scanner(System.in);

        int tongChan = 0, tongLe = 0;

        System.out.println("nhap 10 so bat ki ");
        for (int i = 0; i < 10; i++) {
            System.out.print("nhap so thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
            if (arr[i] % 2 == 0) {
                tongChan += arr[i];
            } else {
                tongLe += arr[i];
            }
        }

        System.out.println("Tong cac so chan trong mang: " + tongChan);
        System.out.println("Tong cac so le trong mang: " + tongLe);

    }

    public static void soNguyenTo(int[] arr) {

        System.out.println("Cac so nguyen to trong mang la: ");
        for (int i = 0; i < 10; i++) {
            int check = 0;
            for (int j = 2; j < arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    check++;
                }
            }
            if (check == 0 && arr[i] != 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        tongChan_tongLe(arr);
        soNguyenTo(arr);
    }

}
