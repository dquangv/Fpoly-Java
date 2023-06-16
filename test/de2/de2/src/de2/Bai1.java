package de2;

public class Bai1 {

    public static class SinhVien {

        private int MSSV, NamSinh;
        private String TenSV;
        private double Diem;

        public SinhVien(int MSSV, int NamSinh, String TenSV, double Diem) {
            this.MSSV = MSSV;
            this.NamSinh = NamSinh;
            this.TenSV = TenSV;
            this.Diem = Diem;
        }

        public SinhVien() {

        }

        public int getMSSV() {
            return MSSV;
        }

        public void setMSSV(int MSSV) {
            this.MSSV = MSSV;
        }

        public int getNamSinh() {
            return NamSinh;
        }

        public void setNamSinh(int NamSinh) {
            this.NamSinh = NamSinh;
        }

        public String getTenSV() {
            return TenSV;
        }

        public void setTenSV(String TenSV) {
            this.TenSV = TenSV;
        }

        public double getDiem() {
            return Diem;
        }

        public void setDiem(double Diem) {
            this.Diem = Diem;
        }

        public void inThongTin() {
            System.out.println("Ten sinh vien: " + getTenSV());
            System.out.println("Ma sinh vien: " + getMSSV());
            System.out.println("Nam sinh: " + getNamSinh());
            System.out.println("Diem: " + getDiem());
        }
    }

}
