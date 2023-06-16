package de2;

import de2.Bai1.SinhVien;

public class Bai4 {

    public static class SinhVienUDPM extends SinhVien {

        private double Java, C;

        public double getJava() {
            return Java;
        }

        public void setJava(double Java) {
            this.Java = Java;
        }

        public double getC() {
            return C;
        }

        public void setC(double C) {
            this.C = C;
        }

        public SinhVienUDPM(double Java, double C, int MSSV, int NamSinh, String TenSV, double Diem) {
            super(MSSV, NamSinh, TenSV, Diem);
            this.Java = Java;
            this.C = C;
        }

        public SinhVienUDPM() {
        }

        public void inThongTin() {
            System.out.println("Ten sinh vien: " + getTenSV());
            System.out.println("Ma sinh vien: " + getMSSV());
            System.out.println("Nam sinh: " + getNamSinh());
            System.out.println("Diem Java: " + getJava());
            System.out.println("Diem C: " + getC());
            System.out.println("Diem: " + getDiem());
        }
    }
}
