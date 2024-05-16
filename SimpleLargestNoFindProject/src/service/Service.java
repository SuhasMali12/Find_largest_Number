package service;

import dao.Dao;

public class Service {

	
public void m1() {
		Dao dd=new Dao();
		int a=dd.m1();
		int b=dd.m2();
		int c=dd.m3();
if(a>=b && a>=c){
System.out.println("a is largest");
}
else if(b>=a && b>=c){
System.out.println("b is largest");
}
else {
System.out.println("c is largest");
}
		
}
}
