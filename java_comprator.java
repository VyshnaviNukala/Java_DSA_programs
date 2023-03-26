import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player>{
    public int compare(Player o1, Player o2){
        if(o1.score < o2.score){
            return 1;
        }
        else if(o1.score > o2.score){
            return -1;
        }
        else{
            if(o1.name.compareTo(o2.name) <= -1){
                return -1;
            }
            else if (o1.name.compareTo(o2.name) >= 1){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}

class Player{