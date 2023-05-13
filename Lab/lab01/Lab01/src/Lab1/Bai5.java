/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;
/**
 
 * @author Quang
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st edge measure: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd edge measure: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd edge measure: ");
        int num3 = sc.nextInt();
        
        String check = (num1+num2>num3 && Math.abs(num1-num2)<num3) && (num1+num3>num2 && Math.abs(num1-num3)<num2) && (num3+num2>num1 && Math.abs(num3-num2)<num1) ? "Bo 3 so do la bo canh cua 1 tam giac" : "Bo 3 so do khong phai la bo canh cua 1 tam giac";
        System.out.println(check);
    }
            
}
