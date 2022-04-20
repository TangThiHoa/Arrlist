package DemoStackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocSo {
    public static void main(String[] args) {
        Stack<Integer>hiStack= new Stack<>();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Queue<Integer> numQue = new LinkedList<>();
        while (num > 0 ){
            numQue.add(num%10);
            num/=10;
        }while (!numQue.isEmpty()){
            System.out.print(numQue.remove());
        }
    }
}
