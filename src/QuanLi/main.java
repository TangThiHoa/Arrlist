package QuanLi;

import QuanLi.Family;
import QuanLi.Person;

public class main {
    public static void main(String[] args) {
        Family family = new Family("xóm dân cư  ");
        System.out.println("Gia đình 1 gồm  : ");
        family.add(new Person(1, "TTH ", 20));
        family.add(new Person(2, "TVH ", 23));
        family.add(new Person(3, "TTA ", 25));
        family.display();
        System.out.println("Sau khi bỏ nhà đi còn  : ");
        family.delete(3);
        family.display();
        System.out.println("Gia đình 2 gồm :");
        Family familyoflinh = new Family(" xóm ngụ cư  ");
        familyoflinh.add(new Person(1, "NVA", 18));
        familyoflinh.add(new Person(2, "NNA", 28));
        familyoflinh.add(new Person(3, "NAA", 12));
        familyoflinh.display();

        familyoflinh.findIndexById("NAV");


        Town town= new Town();
        town.add(family);
        town.add(familyoflinh);


    }
    }
