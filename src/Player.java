import java.util.*;
public class Player {
    String name;
    Player(String name){
        this.name=name;
    }
    String selectCell(){
        Scanner scanner=new Scanner(System.in);
        return scanner.next();
    }
}
