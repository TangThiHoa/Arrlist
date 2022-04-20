package DemoStackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<>();
        Scanner sc = new Scanner(System.in);
        String chuoi = sc.nextLine();
        for ( int i=0;i< chuoi.length();i++){
            stack.push(chuoi.charAt(i) + " ");
        }
        while (!stack.isEmpty()){
            System.out.printf(stack.pop());
        }
    }
}
