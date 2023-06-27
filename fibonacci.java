package myfirst;

import java.util.*;

public class MyFirst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		int a=0;
		int b=1;
		while(n>=0) {
			sum+=a;
			System.out.print(a);
			int c=a+b;
			a=b;
			b=c;
			n--;
		}
		System.out.println();
		System.out.println(sum);
	}

}
