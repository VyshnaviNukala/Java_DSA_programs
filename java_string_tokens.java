import java.io.*;
import java.util.*;

public class Solution {

      public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine().trim();
    // Write your code here.
    scan.close();

    if (s.length() == 0) {
        System.out.println(0);
        return;
    }

    String[] tokens = s.split("[ !,?._'@]+");
    System.out.println(tokens.length);

    for (String token : tokens) {
        System.out.println(token);
    }

}
}

