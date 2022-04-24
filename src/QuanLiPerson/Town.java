package QuanLiPerson;

import TrumManage.Management;

import java.util.ArrayList;
import java.util.List;

public class Town implements Management< Family> {
    private List<Family>familyList = new ArrayList<>();

    public Town(List<Family> familyList) {
        this.familyList = familyList;
    }

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
        for (int i=0;i< familyList.size();i++){
            familyList.get(i).display();
        }


    }
 @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public void findIndexByName(String name) {


    }

    @Override
    public void printAll() {

    }

    }

