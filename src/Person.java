import java.util.*;
public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    String selectCell(){
        Scanner scanner=new Scanner(System.in);
        return scanner.next();
    }
}
