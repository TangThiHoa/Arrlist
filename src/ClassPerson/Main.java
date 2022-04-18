package ClassPerson;

import HocSinh.Family;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Family> familyList = new ArrayList<>();
        familyList.add(new Family("TTH", 20, "Hs", 20, 3));//them
        familyList.add(new Family("TDT", 23, "Hs", 12346, 8));
        familyList.add(new Family("DTH", 25, "Hs", 2178, 7));
        for (int i = 0; i < familyList.size(); i++) {
            System.out.println(familyList.get(i));
        }
        System.out.println(".............");

        familyList.remove(1);//xoa
        for (int i = 0; i < familyList.size(); i++) {
            System.out.println(familyList.get(i));
        }
        familyList.set(3, new Family("TVH", 23, "Hs", 2458, 5));//sua
        for (int i = 0; i < familyList.size(); i++) {
            System.out.println(familyList.get(i));
        }
//        int indexof = -1;
//        for (int i = 0; i < familyList.size(); i++) {
//            System.out.println(familyList.get(i).getName().equals("DTH"));
//            indexof = i;
//
//        }
    }
}