package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void ImportArray(int num, int array[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            System.out.printf("Enter the number for element %d: ", i + 1);
            array[i] = sc.nextInt();
        }
    }

    public static void ExportArray(int num, int array[]) {
        for (int i = 0; i < num; i++) {
            System.out.println(array[i]);
        }
    }

    public static float AverageElement(int num, int array[]) {
        int count = 0, sum = 0;

        for (int i = 0; i < num; i++) {
            if (array[i] % 3 == 0) {
                count += 1;
                sum += array[i];
            }
        }

        return (float) sum / (float) count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number element of array: ");
        int num = sc.nextInt();
        int array[] = new int[num];

        ImportArray(num, array);

        Arrays.sort(array);

        ExportArray(num, array);

        System.out.println("The minimun element of array is " + array[0]);

        System.out.println("The average of elements divided by 3 in array is " + AverageElement(num, array));
    }
}
