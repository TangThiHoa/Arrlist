package QuanLiLibraey;

public class Document {
    private static int autoId = 0;
    private int ma ;
    private String tenNXB;

    public Document() {
    }

    public Document(int ma, String tenNXB) {
        this.ma = autoId;
        autoId++;
        this.tenNXB = tenNXB;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    @Override
    public String toString() {
        return "Document : " +
                "ma : " + ma +
                ", tenNXB : '" + tenNXB + '\'' ;
    }

    public static void main(String[] args) {
        Document document = new Document(2 ," Kim Đồng ");
        Document document1 = new Document(3 ," Giáo dục  ");
        Document document2 = new Document(1," Thanh niên ");
        System.out.println(document);
        System.out.println(document1);
        System.out.println(document2);
        System.out.println("---------------------");



        Document doc = new Book( 8,"MLB" , 100);
        Document doc2= new Book(2,"TBN",150);
        Document doc4 = new Book(1,"VN",200);
        System.out.println(doc);
        System.out.println(doc2);
        System.out.println(doc4);
        System.out.println("------------------");


        Document docu = new Journal();
        Document docu2 = new Journal();
        System.out.println(docu);
        System.out.println(docu2);





    }
}
