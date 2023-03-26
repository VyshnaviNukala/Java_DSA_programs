import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        StringBuilder input = new StringBuilder();
        input.append(A); 
        input.reverse().toString();
        
        // System.out.println(input);
        if(A.length()<=50){
            if(A.equals(String.valueOf(input))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
                }
        }
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
    }



