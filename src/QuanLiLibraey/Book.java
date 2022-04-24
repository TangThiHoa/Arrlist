package QuanLiLibraey;

public class Book extends Document{
    private int soTrang;

    public Book(int ma, String tenNXB, int soTrang) {
        super(ma, tenNXB);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Book{" +
                "soTrang=" + soTrang +
                '}';
    }
}
