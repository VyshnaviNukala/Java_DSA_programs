    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int[] counts = new int[10000001];
            int n = in.nextInt(), m = in.nextInt(), count=0;
            for (int i=0; i<m; i++) {
                int v = in.nextInt();
                deque.add(v);
                if (counts[v]==0) count++;
                counts[v]++;
            }
            int maxcount=count;
            for (int i=m; i<n; i++) {
                int v = in.nextInt(), oldv = deque.poll();
                counts[oldv]--;
                if (counts[oldv]==0) count--;
                deque.add(v);
                if (counts[v]==0) count++;
                counts[v]++;
                if (count>maxcount) maxcount = count;
            }
            System.out.println(maxcount);
        }

    }

