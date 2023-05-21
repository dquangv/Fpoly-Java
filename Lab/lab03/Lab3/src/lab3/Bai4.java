package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai4 {

    static class Student implements Comparable<Student> {

        private String name;
        private double mark;
        private String academic;

        public Student(String name, double mark) {

            this.name = name;
            this.mark = mark;
            this.academic = calculateAcademic();
        }

        public String getName() {
            return name;
        }

        public double getMark() {
            return mark;
        }

        public String calculateAcademic() {
            if (mark < 5) {
                academic = "Weak";
            } else if (mark < 6.5) {
                academic = "Average";
            } else if (mark < 7.5) {
                academic = "Pretty";
            } else if (mark < 9) {
                academic = "Good";
            } else {
                academic = "Excellent";
            }
            return academic;
        }

        @Override
        public int compareTo(Student other) {
            return Double.compare(this.mark,other.mark);
        }
    }

    public ArrayList<Student> ImportStudent(int num) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.printf("Name of student %d: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Mark of studen %d: ", i + 1);
            double mark = sc.nextDouble();
            sc.nextLine();

            Student student = new Student(name, mark);
            students.add(student);
        }

        return students;
    }
    
    public static void sortStudent(ArrayList<Student> students) {
        Collections.sort(students);
    }
    
    public void ExportStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int num = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> students = ImportStudent(num);

        sortStudent(students);
        
        for (int i = 0; i < num; i++) {
            System.out.println("Studen "+(i+1));
            System.out.println("Name: "+students.get(i).getName());
            System.out.println("Mark: "+students.get(i).getMark());
            System.out.println("Academic: "+students.get(i).calculateAcademic());
        }
    }
    
    


    public static void main(String[] args) {
       
        Bai4 student = new Bai4();
        student.ExportStudent();

    }
}
