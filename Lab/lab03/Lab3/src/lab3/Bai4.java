package lab3;

import java.util.Scanner;

public class Bai4 {

    public static void ImportStudent(int num, String[] name, float[] mark) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            System.out.printf("Name of student %d: ", i + 1);
            name[i] = sc.nextLine();
            System.out.printf("Mark of studen %d: ", i + 1);
            mark[i] = sc.nextFloat();
            sc.nextLine();
        }
    }

    public static void UpdateAcademic(int num, String[] academic, float[] mark) {
        for (int i = 0; i < num; i++) {
            if (mark[i] < 5) {
                academic[i] = "Weak";

            } else if (mark[i] < 6.5) {
                academic[i] = "Average";
            } else if (mark[i] < 7.5) {
                academic[i] = "Pretty";
            } else if (mark[i] < 9) {
                academic[i] = "Good";
            } else {
                academic[i] = "Excellent";
            }

        }
    }

    public static void ArrangeStudent(int num, String[] name, String[] academic, float[] mark) {
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (mark[i] > mark[j]) {
                    String tempName = name[i];
                    name[i] = name[j];
                    name[j] = tempName;

                    float tempMark = mark[i];
                    mark[i] = mark[j];
                    mark[j] = tempMark;

                    String tempAcademic = academic[i];
                    academic[i] = academic[j];
                    academic[j] = tempAcademic;
                }
            }
        }
    }

    public static void ExportStudent(int num, String[] name, String[] academic, float[] mark) {
        for (int i = 0; i < num; i++) {
            System.out.printf("Name of student %d: %s\n", i + 1, name[i]);
            System.out.printf("Mark of student %d: %.2f\n", i + 1, mark[i]);
            System.out.printf("Academic ability of student %d: %s\n\n", i + 1, academic[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int num = sc.nextInt();
        sc.nextLine();

        String[] name = new String[num], academic = new String[num];
        float mark[] = new float[num];

        ImportStudent(num, name, mark);

        System.out.println("");

        UpdateAcademic(num, academic, mark);

        ArrangeStudent(num, name, academic, mark);

        System.out.println("List of students in ascending order of marks");

        ExportStudent(num, name, academic, mark);
    }
}