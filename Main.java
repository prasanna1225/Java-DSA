import java.util.*
public class Main{
    public static void main(String[] args){
    Main res=new Main();
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


