package Person1;

import java.util.ArrayList;
import java.util.List;

public class LoveFamily {
    ArrayList<Person1>person1s ;

    public LoveFamily() {
        this.person1s = new ArrayList<>() ;
    }
    public void add(Person1 person1){
        person1s.add(person1);
    }
    public void display(){
        for (int i =0;i< person1s.size();i++){
            System.out.println(person1s.get(i));
        }

    }
    public int findByname (String name){
        for ( int i=0 ; i< person1s.size();i++){
            if (person1s.get(i).getName().equals(name)){
                return i;
            }
        }return  -1 ;
    }
}
