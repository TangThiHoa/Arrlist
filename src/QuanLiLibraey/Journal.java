package QuanLiLibraey;

public class Journal extends Document{
    private int soPhatHanh ;
    public Journal(){}


    public Journal(int ma, String tenNXB, int soPhatHanh) {
        super(ma, tenNXB);
        this.soPhatHanh = soPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "soPhatHanh=" + soPhatHanh +
                '}';
    }
}
