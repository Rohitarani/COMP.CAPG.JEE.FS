package exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args)
	{
		Fibbocal fib=new Fibbocal();
		int fib1=fib.fibrec(10);
		int fib2=fib.fibonacci(10);
		System.out.println(fib1);
		System.out.println(fib2);
		//fibonaccinonrecursion f=new fibonaccinonrecursion();
		//int check2=f.fibonacci(10);
		//System.out.println(check2);
	}
}
