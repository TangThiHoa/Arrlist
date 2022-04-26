package File;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class GiaiPtFile {
    public static void main(String[] args) throws Exception {
        //Tạo file
        File file = new File("input.txt");
        File file1 = new File("output.txt");
        PrintWriter writer = new PrintWriter(file1);

        //Nhập số
        Scanner scanner = new Scanner(file);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + "" + b);
        // Giai pt
        if (a==0){
            if (b==0){
                writer.println("Phương trình vô số nghiệm");
            }else {
                writer.println("Phương trình vô nghiệm ");
            }
        }writer.close();




    }
}
