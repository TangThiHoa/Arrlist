package QuanLi;

import java.util.ArrayList;
import java.util.List;

public class Town implements Manage<Family> {
    private List<Family> familyList = new ArrayList<>();

    public Town() {
    }

    @Override
    public void add(Family family) {
        familyList.add(family);

    }

    @Override
    public void edit(int id, Family family) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void display() {

        for (int i = 0; i < familyList.size(); i++) {
            familyList.get(i).display();
        }


    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public void findIndexByaddress(String name) {
        for (int i = 0; i < familyList.size(); i++) {
            if (familyList.get(i).equals(name)) {
                System.out.println(familyList.get(i));
            }
        }
    }
}
