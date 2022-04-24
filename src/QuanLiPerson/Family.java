package QuanLiPerson;

import TrumManage.Management;

import java.util.ArrayList;
import java.util.List;

public class Family implements Management<Person> {
    private List<Person> personList = new ArrayList<>();
    private String adress ;
    private int amoutOfMember;

    public Family(String adress) {
        this.adress = adress;

    }

    public Family() {
    }

    public Family(List<Person> personList, String adress, int amoutOfMember) {
        this.personList = personList;
        this.adress = adress;
        this.amoutOfMember = amoutOfMember;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAmoutOfMember() {
        return amoutOfMember;
    }

    public void setAmoutOfMember(int amoutOfMember) {
        this.amoutOfMember = amoutOfMember;
    }

    @Override
    public String toString() {
        return "Family{" +
                "personList=" + personList +
                ", adress='" + adress + '\'' +
                ", amoutOfMember=" + amoutOfMember +
                '}';
    }

    @Override
    public void add(Person person) {
        personList.add(person);
        this.amoutOfMember++;


    }

    @Override
    public void edit(int id, Person person) {
        if(findIndexById(id) != -1 ){
            personList.set(findIndexById(id),person);

        }else{
            System.out.println("Không có trong danh sách ");
        }

    }

    @Override
    public void delete(int id) {
        if ( findIndexById(id) !=-1){
            personList.remove(findIndexById(id));
            this.amoutOfMember--;
        }else{
            System.out.println("Không có trong danh sách ");
        }

    }

    @Override
    public void display() {
        System.out.println("Địa chỉ : " + adress + "Số thành viên : " + amoutOfMember);
        for (int i=0;i< personList.size();i++){
            System.out.println(personList.get(i));
        }


    }

    @Override
    public int findIndexById(int id) {
        for (int i =0;i< personList.size();i++){
            if (personList.get(i).getId() == id){
                return i;            }

        }
        return -1;
    }

    @Override
    public void findIndexByName(String name) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                System.out.println(personList.get(i));

            }

            }

        }

    @Override
    public void printAll() {

    }

    public void printTheYoungest(){
        int minAge = 0 ;
            for (Person person : personList){
                if (minAge > person.getAge()){
                    minAge = person.getAge();

            }
            }
            for (Person person : personList){
                if (minAge == person.getAge()){
                    System.out.println(person);
                }




            }
        }

    }
