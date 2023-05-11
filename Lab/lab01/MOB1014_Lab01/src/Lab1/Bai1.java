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

/*
    Kiểu dữ liệu cơ bản:
    -Số nguyên: int - %d
    -Số thực: float - double | %f
    -Ký tự: String - %s

    Đặt tên biến:
    -Camel (con lạc đà): HinhChuNhat
    -Snake (con rắn): hinh_chu_nhat
*/


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your average mark: ");
        double aveMark = sc.nextDouble();
        
        System.out.print(name);
        System.out.print(" ");
        System.out.print( aveMark);
        System.out.print(" diem\n");

        System.out.printf("%s %f diem\n",name,aveMark);
        
        System.out.println(name+" "+aveMark+" diem");
    }
}
