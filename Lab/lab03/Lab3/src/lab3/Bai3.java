package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai3 {

    public static void ImportArrayList(int num, ArrayList<Integer> array) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            System.out.printf("Enter the number for element %d: ", i + 1);
            array.add(sc.nextInt());
        }
    }

    public static void ExportArrayList(int num, ArrayList<Integer> array) {
        for (int i = 0; i < num; i++) {
            array.get(i);
        }
    }

    public static float AverageElement(int num, ArrayList<Integer> array) {
        int count = 0, sum = 0;

        for (int i = 0; i < num; i++) {
            if (array.get(i) % 3 == 0) {
                count += 1;
                sum += array.get(i);
            }
        }

        return (float) sum / (float) count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number element of array: ");
        int num = sc.nextInt();
        ArrayList<Integer> array = new ArrayList(num);

        ImportArrayList(num, array);

        Collections.sort(array);

        ExportArrayList(num, array);

        System.out.println("The minimun element of array is " + array.get(0));

        System.out.println("The average of elements divided by 3 in array is " + AverageElement(num, array));
    }
}
