package QuanLi;

public interface Manage <T> {
    void add(T t);

    void edit(int id, T t);

    void delete(int id);

    void display();

    int findIndexById( int id );

    void findIndexByaddress(String name);
}