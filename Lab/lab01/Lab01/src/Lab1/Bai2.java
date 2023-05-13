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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        
        double perimeter = (length+width)*2;
        System.out.println("Perimeter of retangle: "+perimeter);
        
        double acreage = length*width;
        System.out.println("Acreage of retangle: "+acreage);
        
        double minEdge = Math.min(width, length);
        System.out.println("Min edge: "+minEdge);
    }
}
