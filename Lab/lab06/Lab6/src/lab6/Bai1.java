package lab6;

import java.util.Scanner;

public class Bai1 {
    
    public static void hoTen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Ho: "+hoTen.substring(0,hoTen.indexOf(" ")).toUpperCase());
        System.out.println("Ten lot: "+hoTen.substring(hoTen.indexOf(" "),hoTen.lastIndexOf(" ")));
        System.out.println("Ten: "+hoTen.substring(hoTen.lastIndexOf(" "),hoTen.length()).toUpperCase());
    }
    
    public static void main(String[] args) {
        hoTen();
        
    }

    
}
