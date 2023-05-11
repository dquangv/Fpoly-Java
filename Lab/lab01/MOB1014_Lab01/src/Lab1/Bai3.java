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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the edge measure: ");
        double edge = sc.nextDouble();
        
        double volume = edge*edge*edge;
        System.out.println("Volume of the cube: "+volume);
    }
}