package DemoStackQueue;

import java.util.Scanner;
import java.util.Stack;

public class ChuoiDoiXung {
    public static void main(String[] args) {
        Stack<Character> kuStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần xét : ");
        String inp = sc.nextLine();
        for ( int i = 0 ; i< inp.length(); i++){
            kuStack.push(inp.charAt(i));
        }
        String chuoiDaoNguoc= "";
        while (!kuStack.isEmpty()){
            chuoiDaoNguoc = chuoiDaoNguoc + String.valueOf(kuStack.pop());
        }
        if( inp.equals(chuoiDaoNguoc))
            System.out.println("Đối xứng : ");
        else
            System.out.println(" Không đối xứng : ");
    }
}
