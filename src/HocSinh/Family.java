package HocSinh;

import ClassPerson.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family extends Person {
    private int id ;


    public Family(String name, int age, String job, int num, int id) {
        super(name, age, job, num);
        this.id = id;

    }

    Family(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id + " ten " + getName()+ " tuoi " + getAge() +
                " nghe nghiep "+ getJob() + " so thanh vien "+ getNum() +
                '}';
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Family>studentList=new ArrayList<>();
//        studentList.add(new Family(1,"TTH",20));
//        studentList.add(new Family(2,"DTH",25));
//        studentList.add(new Family(3,"TTT",23));
        System.out.println(studentList.size());
        for(int i =0 ; i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
        studentList.remove(1);
        System.out.println("...................");
        for (int i= 0; i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
//        studentList.set(0,new Family(4,"ketu",13));
        System.out.println("...................");
        for (int i= 0; i<studentList.size();i++) {
            System.out.println(studentList.get(i));
        }
        int indexof = -1 ;
        for (int i=0;i<studentList.size();i++){
            if (studentList.get(i).equals("TTH")){
                indexof= i;
            }
        }


        System.out.printf("Mời bạn nhập tên: ");
        String name = scanner.nextLine();

    }
}

