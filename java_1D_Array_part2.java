import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        while(!q.isEmpty()){
            int i = q.poll();
            
            if(i < 0){
                continue;
            }
            
            if(i>=game.length){
               return true; 
            }
            
            if(game[i] == 1){
                continue;
            }
            
            game[i] = 1;
            q.add(i-1);
            q.add(i+1);
            q.add(i+leap);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}