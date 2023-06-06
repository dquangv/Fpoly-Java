package asm;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Quang
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap: ");
        BigDecimal value = new BigDecimal(sc.nextLine());
        String stringValue = value.toString(); // Chuyển đổi thành chuỗi
        String[] parts = stringValue.split(" ");
        System.out.println(parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}
