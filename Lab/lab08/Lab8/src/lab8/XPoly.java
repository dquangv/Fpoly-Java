package lab8;

import java.util.Scanner;

final class XPoly {
    
    public static final double sum(double[] arr) {
        double total = 0;
        for (double num : arr) {
            total += num;
            
        }
        return total;
    }
    
    public static final double min(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static final double max(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static final String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            
            words[i] = upperFirstChar + words[i].substring(1);
        }
        
        String capitalizedSentence = String.join(" ", words);
        return capitalizedSentence;
    }
    
    public static final void menu() {
        System.out.println("\t\tMENU");
        System.out.println("1. Tinh tong");
        System.out.println("2. Tim min");
        System.out.println("3. Tim max");
        System.out.println("4. Viet hoa chu cai dau");
        System.out.println("5. Ket thuc");
        System.out.print("Ban muon the lao? (1-4): ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = null;
        do {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong phan tu: ");
                    int size = Integer.parseInt(sc.nextLine());
                    arr = new double[size];
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Nhap phan tu " + (i + 1) + ": ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println("Tong cac so trong mang la: " + sum(arr));
                    break;
                case 2:
                    System.out.println("So nho nhat trong mang la: " + min(arr));
                    break;
                case 3:
                    System.out.println("So lon nhat trong mang la: " + max(arr));
                    break;
                case 4:
                    System.out.print("Nhap mot cau muon viet hoa: ");
                    String sentence = sc.nextLine();
                    System.out.println("Sau khi chuyen doi: " + capitalizeWords(sentence));
                    break;
                case 5:
                    System.out.println("Cam on da su dung ung dung.");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai roi ma");
                    break;
            }
            
            System.out.print("Su dung nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("N") || check.equalsIgnoreCase("No")) {
                break;
            }
        } while (true);
    }
    
}
