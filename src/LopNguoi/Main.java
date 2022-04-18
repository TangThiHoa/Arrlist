package LopNguoi;

import java.util.List;
import java.util.Scanner;

public class Main {
    private String name ;
    private int age ;
    private String job ;
    private int CCCD;

    public Main(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }


    public Main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("MY MENU");
        System.out.println("1. ADD PERSON");
        System.out.println("2. LIST PERSON");
        int chooseMenu = Integer.parseInt(scanner.nextLine());
        System.out.println();
        switch (chooseMenu){
            case 1:
//                new StudentView();
                System.out.println(" Nhập tên :");
                String name = scanner.nextLine();
                System.out.println(" Nhập tuổi : ");
                int age = Integer.parseInt(scanner.nextLine()); //ep kieu

                System.out.println(" Nghề nghiệp : ");
//        sc.next();e
                String job = scanner.nextLine();
                System.out.println(" Số CCCD : ");
                int num = scanner.nextInt();

                break;
            case 2:



                break;






        }
    }

    public static void main(String[] args) {



        new Main();
    }


}

