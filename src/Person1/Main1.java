package Person1;

public class Main1 {
    public static void main(String[] args) {
    LoveFamily loveFamily = new LoveFamily();
    loveFamily.add(new Person1(" Tang Thi Hoa",20,"Hsinh",23445));
    loveFamily.display();
        System.out.println(loveFamily.findByname(" Tang Thi Hoa"));



    }
}
