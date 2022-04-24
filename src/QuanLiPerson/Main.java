package QuanLiPerson;

import QuanLiPerson.Family;
import QuanLiPerson.Person;
import QuanLiPerson.Town;

public class Main {
    public static void main(String[] args) {
        Family familyofh1 = new Family("Khu người nghèo  .  ");
        familyofh1.add(new Person(1,"TTH", 20));
        familyofh1.add(new Person(2,"TVH", 23));
        familyofh1.add(new Person(4,"DTH", 25));
        familyofh1.add(new Person(9,"DNA", 24));
        familyofh1.display();
        familyofh1.delete(2);
        System.out.println("Sau khi xóa : ");
        familyofh1.display();

        Family familyofxh = new Family("Khu người giàu . ");
        familyofxh.add(new Person(1,"TDT ", 23));
        familyofxh.add(new Person(2,"LVS ", 29));
        familyofxh.add(new Person(3,"CXT ", 22));
        familyofxh.display();

//        familyofh1.printTheYoungest();
        System.out.println("-----------------");
        Town town = new Town();
        town.add(familyofh1);
        town.add(familyofxh);
        town.display();











    }
}
