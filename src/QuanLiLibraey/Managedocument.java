package QuanLiLibraey;

import TrumManage.Management;

import java.util.ArrayList;
import java.util.List;

public class Managedocument implements Management<Document> {
    private List<Document>documentList = new ArrayList<>();

    public Managedocument() {
         documentList.add(new Book(2,"VH",200));
        documentList.add(new Book(3,"VH",150));
        documentList.add(new Journal(5,"BX",250));
        documentList.add(new Book(7,"VH",50));
        documentList.add(new Journal(4,"NON",100));


    }


    @Override
    public void add(Document document) {

    }

    @Override
    public void edit(int id, Document document) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void display() {

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
        for (Document t :
                documentList) {
            System.out.println(t);

        }

    }

    public static void main(String[] args) {
        Managedocument managedocument = new Managedocument();
        managedocument.printAll();

    }
}
