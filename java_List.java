import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++){
            intArr.add(sc.nextInt());
        }
        int query = sc.nextInt();
        for(int i = 0; i < query; i++) {
            sc.nextLine();
            String queryStr = sc.nextLine();
            if(queryStr.equals("Insert")){
                intArr.add(sc.nextInt(), sc.nextInt()); 
            }else if(queryStr.equals("Delete")) {
                intArr.remove(sc.nextInt());
            }
        }
        for(int i = 0; i < intArr.size(); i++) {
            System.out.print(intArr.get(i).toString() + " ");
        }
    }
}