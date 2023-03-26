import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{


    public static void process(String str) {
        
        String currentTag = null;
        StringBuffer tag = new StringBuffer();
        StringBuffer text = new StringBuffer();
        StringBuffer output = new StringBuffer();
        boolean inTag=false;
        for (int i = 0; i<str.length(); i++) {
            
            char c = str.charAt(i);
            
            switch (c) {
            case '<':
                tag = new StringBuffer();
                inTag = true;
                if (text!=null && text.length()>0) {
                }
                break;
            case '>':
                inTag = false;
                if (tag!=null && tag.length()>0) {
                    if (tag.charAt(0)=='/') {
                        if (currentTag!=null && currentTag.equals(tag.substring(1)) ) {
                            output.append(text.toString().trim());
                            output.append("\n");
                        }
                        currentTag = "";
                    } else {
                        currentTag = tag.toString();
                    }
                }
                text = new StringBuffer();
                
                break;
            default:
                if (inTag)
                    tag.append(c);
                else
                    text.append(c);
            }
        }
        String r = output.toString().replaceAll("(?m)^[ \t]*\r?\n", "").trim();
        System.out.println(r.length()>0?r:"None");
    }    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            process(line);
            testCases--;
        }
    }
}