package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number element of array: ");
        int num = sc.nextInt();
        int array[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Enter the number for element %d: ", i + 1);
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Each element after sorting");
        for (int i = 0; i < num; i++) {
            System.out.println(array[i]);
        }

        System.out.println("The minimun element of array is " + array[0]);

        int count = 0, sum = 0;

        for (int i = 0; i < num; i++) {
            if (array[i] % 3 == 0) {
                count += 1;
                sum += array[i];
            }
        }

        System.out.println("The average of elements divided by 3 in array is " + ((float) sum / (float) count));
    }
}
