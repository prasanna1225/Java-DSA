import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Factorial res=new Factorial();
        var result=res.factorial(5);
        System.out.println(result);
    }
    public int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}



