import java.util.*;

public class Palindrome {
	 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=n;
    int res=0;
    while(n>0) {
    	int r=n%10;
    	res=res*10+r;
    	n/=10;
    }
    if(res==m) {
    	System.out.println("Given number is palindrome");
    }else {
    	System.out.println("Given number is not a palindrome");
    }
    
       
}

}

