import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Quadratic{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=Math.sqrt((b*b)-(4*a*c));
        double r1,r2;
        r1=(-b+d)/(2*a);
        r2=(-b-d)/(2*a);
        if(d>0 && r1!=r2){
            System.out.println("Roots are real and un-equal");
            System.out.println("Root1:"+r1);
              System.out.println("Root2:"+r2);
        }
        else if(d==0){
             System.out.println("Roots are real and equal");
                 System.out.println("Root1:"+r1);
              System.out.println("Root2:"+r2);
        }
        else{
             System.out.println("Roots are imaginary");
        }
        
    }
}