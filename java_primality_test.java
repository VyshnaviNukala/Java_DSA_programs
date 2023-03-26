import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        scanner.close();
    }
}