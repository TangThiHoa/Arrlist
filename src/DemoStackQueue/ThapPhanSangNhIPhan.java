package DemoStackQueue;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhIPhan {
    public static void main(String[] args) {
        Stack<Integer>niStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0 ){
            int soDu = num% 2 ;
            niStack.push(soDu);
            num/=2 ;

        }while (!niStack.isEmpty()){
            System.out.print(niStack.pop());
        }
    }
}
