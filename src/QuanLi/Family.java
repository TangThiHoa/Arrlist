package QuanLi;

import java.util.ArrayList;
import java.util.List;

public class Family implements  Manage<Person>{
    private List<Person> personList = new ArrayList<>();
    private String address ;
    private int amoutofMember ;
    private int id;

    public Family(String address, int amoutofMember) {
        this.address = address;
        this.amoutofMember = amoutofMember;
    }

    public Family(String s) {
    }



    public Family(List<Person> personList, String address, int amoutofMember) {
        this.personList = personList;
        this.address = address;
        this.amoutofMember = amoutofMember;
    }

    @Override
    public String toString() {
        return "Family{" +
                "personList=" + personList +
                ", address='" + address + '\'' +
                ", amoutofMember=" + amoutofMember +
                '}';
    }


    @Override
    public void add(Person person) {
        personList.add(person);

    }

    @Override
    public void edit(int id, Person person) {
        if (findIndexById(id) !=1){
            personList.set(findIndexById(id),person);
        }else {
            System.out.println("KHÔNG CÓ TRONG DANH SACH ");
        }

    }

    @Override
    public void delete(int id) {
        if (findIndexById(id) !=1){
            personList.remove(findIndexById(id));
            this.amoutofMember--;

        }else {
            System.out.println("KHÔNG CÓ TRONG DANH SÁCH ");
        }

    }

    @Override
    public void display() {

        for (int i =0 ; i< personList.size(); i ++){
            System.out.println( personList.get(i));
        }

    }

    @Override
    public int findIndexById(int id) {
        for ( int i = 0 ; i< personList.size(); i ++){
            if (personList.get(i).getId()== id ) {
                return i ;
            }
        }
        return 0;
    }

    @Override
    public void findIndexByaddress(String name) {

    }

    public void findIndexById(String name ) {
        for ( int i = 0 ; i< personList.size(); i ++){
            if (personList.get(i).getName().equals(name)){
                System.out.println(personList.get(i));
            }
        }

    }
    public void printTheYunges(){
        int minAge = 0 ;
        int indexOfMin =-1;
        for (int i = 0 ; i< personList.size();i++){
            if (minAge > personList.get(i).getAge()){
                minAge = personList.get(i).getAge();
                indexOfMin = i ;



            }
        }
        System.out.println(personList.get(indexOfMin));
    }

    }


