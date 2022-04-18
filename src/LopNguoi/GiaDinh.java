package LopNguoi;

import HocSinh.Family;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaDinh extends Nguoi{
    private String diachi;
    private int thanhvien;

    public GiaDinh(String name, int age, String job, int num, String diachi, int thanhvien) {
        super(name, age, job, num);
        this.diachi = diachi;
        this.thanhvien = thanhvien;
    }
    GiaDinh(){}

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Family> familyList=new ArrayList<>();
//        familyList.add(new Family(1,"hv",123));

        System.out.println(familyList.size());
        for(int i =0 ; i<familyList.size();i++){
            System.out.println(familyList.get(i));
        }
        familyList.remove(1);
        System.out.println("...................");
        for (int i= 0; i<familyList.size();i++){
            System.out.println(familyList.get(i));
        }
//        familyList.set(0,new Family(4,"ketu",13));
        System.out.println("...................");
        for (int i= 0; i<familyList.size();i++) {
            System.out.println(familyList.get(i));
        }
        int indexof = -1 ;
        for (int i=0;i<familyList.size();i++){
            if (familyList.get(i).equals("TTH")){
                indexof= i;
            }
        }


        System.out.printf("Mời bạn nhập tên: ");
        String name = scanner.nextLine();

    }
}