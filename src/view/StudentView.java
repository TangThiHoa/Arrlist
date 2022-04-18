package view;

import LopNguoi.Main;

import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    public StudentView(){
        System.out.println("Student View");
        System.out.println("Enter quit to back MENU");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
