package ClassPerson;

import java.util.ArrayList;
import java.util.List;

public class KhuTaoSong extends Person{
    private String danhsach;

    public KhuTaoSong(String name, int age, String job, int num, String danhsach) {
        super(name, age, job, num);
        this.danhsach = danhsach;
    }
    KhuTaoSong(){
    }

    public void setDanhsach(String danhsach) {
        this.danhsach = danhsach;
    }

    @Override
    public String toString() {
        return "KhuTaoSong{" +
                " danhsach='" + danhsach + '\'' +
                " name : " + getName() + " Tuoi :" +getAge() +
                " Job " + getJob() + " Số cccd : " + getNum()+

                '}';
    }

    public static void main(String[] args) {
        List<KhuTaoSong> khuTaoSongList = new ArrayList<>();
        khuTaoSongList.add(new KhuTaoSong("NVA ",20,"chăn bò",154565,"Nhaso1"));
        khuTaoSongList.add(new KhuTaoSong("NVb ",27,"chăn trâu",15,"Nhaso2"));
        khuTaoSongList.add(new KhuTaoSong("NVc ",24,"đi chơi",565,"Nhaso3"));
        for (int i = 0; i < khuTaoSongList.size(); i++) {
            System.out.println(khuTaoSongList.get(i));
        }
        System.out.println(".............");
        khuTaoSongList.remove(1);
        for (int i = 0; i < khuTaoSongList.size(); i++) {
            System.out.println(khuTaoSongList.get(i));

        }
        System.out.println(".............");
        khuTaoSongList.set(0,new KhuTaoSong("TVB",25,"ở nhà",542,"Nhaso3"));
        for(int i=0;i< khuTaoSongList.size();i++){
            System.out.println(khuTaoSongList.get(i));
        }int indexof = -1 ;





    }


}
