package com.example.demo.ciambiguity;

public class Addition {
	
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("setteing init");
		System.out.println("constructor:int,int");
	}

	public Addition(double a, double b) {
		
		this.a =(int) a;
		this.b =(int) b;
		System.out.println("setteing init");
		System.out.println("constructor:double,double");
	}
	
	public Addition(String a,String b)
	{
		this.a =Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("setteing init");
		System.out.println("constructor:string,string");
	
	}
	
	public void doSum()
	{
		System.out.println("value of a"+this.a);
		System.out.println("value of b"+this.b);
		System.out.println("sum is="+(this.a+this.b));
	}
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
