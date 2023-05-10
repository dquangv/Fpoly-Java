/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01;
import java.util.Scanner;
/**
 *
 * @author Quang
 */
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your average mark: ");
        double aveMark = sc.nextDouble();
        
        System.out.print(name);
        System.out.print(" ");
        System.out.print( aveMark);
        System.out.print(" diem");
        System.out.println("");

        System.out.printf("%s %f diem",name,aveMark);
        System.out.println("");
        
        System.out.println(name+" "+aveMark+" diem");
    }
}
