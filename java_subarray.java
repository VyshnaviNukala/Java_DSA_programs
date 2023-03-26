import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner is = new Scanner(System.in);
        int N = is.nextInt();
        int [] arr = new int[N];
        for(int i =0; i < N; i++){
            arr[i] = is.nextInt();
        }
        int counter =0;
        for(int x= 0; x < N; x++){
            for(int y= x; y < N; y++){
                int sum = 0;
                for(int i = x; i <= y; i++){
                    sum += arr[i];
                }
                if(sum < 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
        is.close();
    }
}