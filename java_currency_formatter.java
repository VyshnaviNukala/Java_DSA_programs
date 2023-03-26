import java.util.*;
import java.text.*;

public class Solution {
    static Locale us = Locale.US;
    static Locale india = new Locale("en", "IN");
    static Locale china = Locale.CHINA;
    static Locale france = Locale.FRANCE;
    static String convert(double amount , Locale lo){
        NumberFormat n = NumberFormat.getCurrencyInstance(lo);
        return n.format(amount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        System.out.println("US: " + convert(payment,us));
        System.out.println("India: " + convert(payment,india));
        System.out.println("China: " + convert(payment,china));
        System.out.println("France: " + convert(payment,france));
    }
}