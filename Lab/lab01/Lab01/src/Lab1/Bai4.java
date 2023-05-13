/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;
import java.util.Scanner;
/**
 *
 * @author Quang
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ax^2+bx+c=0");
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        System.out.println("Enter c = ");
        int c = sc.nextInt();
        
        System.out.println("Square root of delta = "+Math.sqrt(Math.pow(b, 2)-4*a*c));
    }
}
