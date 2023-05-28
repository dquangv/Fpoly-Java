package lab5;

import java.util.ArrayList;
import java.util.Scanner;


public class Bai1 {
    
    public void dsSoThuc() {
        ArrayList<Double> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nhap so thuc: ");
            Double so = Double.parseDouble(sc.nextLine());
            ds.add(so);
            
            System.out.print("Nhap nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("N") || check.equalsIgnoreCase("No")) {
                break;
            }
        }
        
        System.out.println("Danh sach so thuc");
        
        for (Double so : ds) {
            System.out.println(so);
        }
}
   
    public static void main(String[] args) {
        Bai1 ds = new Bai1();
        ds.dsSoThuc();
        
    }
    
}
