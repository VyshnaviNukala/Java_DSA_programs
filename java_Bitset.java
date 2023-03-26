import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            if (op.equals("AND")) {
                if (p1 == 1) {b1.and(b2);}
                else {b2.and(b1);}
            }
            else if (op.equals("OR")) {
                if (p1 == 1) {b1.or(b2);}
                else {b2.or(b1);}
            }
            else if (op.equals("FLIP")) {
                if (p1 == 1) {
                    b1.flip(p2);
                } else {
                    b2.flip(p2);
                }
            }
            else if (op.equals("SET")) {
                if (p1 == 1) {
                    b1.set(p2);
                } else {
                    b2.set(p2);
                }
            }
            else if (op.equals("XOR")) {
                if (p1 == 1) {b1.xor(b2);}
                else {b2.xor(b1);}
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        sc.close();
    }
}