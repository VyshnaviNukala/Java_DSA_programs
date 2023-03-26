import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b)
 {
         // First convert the both Strings to lowerCase
     a=a.toLowerCase();
     b=b.toLowerCase();
             // and then check the length of both String is it not match it    return false
     if(a.length()!=b.length())
     {
         return false;
     }
             //convert the both strings into an Array for sorting pourpose
     char [] charArray1=a.toCharArray();
     char [] charArray2=b.toCharArray();
             //sort the both strings 
    java.util.Arrays.sort(charArray1);
    java.util.Arrays.sort(charArray2);
    //compare both strings by using .equals()
    return java.util.Arrays.equals(charArray1,charArray2);
}


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
