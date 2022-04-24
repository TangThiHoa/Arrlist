package TrumManage;

public interface Management <T> {
    void add(T t);

    void edit(int id, T t);

    void delete(int id);

    void display();
    int findIndexById(int id );

    void findIndexByName (String name );

    void printAll();

}

