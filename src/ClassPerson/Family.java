package ClassPerson;

import LopNguoi.Nguoi;

public class Family extends Person{

        private String diachi;
        private int thanhvien;

        public Family(String name, int age, String job, int num, String diachi, int thanhvien) {
            super(name, age, job, num);
            this.diachi = diachi;
            this.thanhvien = thanhvien;
        }
        Family(){}

        public String getDiachi() {
            return diachi;
        }


        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }

        public int getThanhvien() {
            return thanhvien;
        }

        public void setThanhvien(int thanhvien) {
            this.thanhvien = thanhvien;
        }

        @Override
        public String toString() {
            return "GiaDinh{" +
                    "diachi='" + diachi + '\'' +
                    ", thanhvien=" + thanhvien +
                    '}';
        }
    }


