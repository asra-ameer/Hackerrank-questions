import java.io.*;
import java.util.*;

public class StringReverseJava {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversed = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(reversed) ? "Yes" : "No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}