package PackageOne;

import PackageInheritance.ClassInheritanceTwo;

public class ClassInheritanceOne{

	public static void main (String args[]){
		display();
		ClassInheritanceOne aOne = new ClassInheritanceOne();
		aOne.nonDisplay();
		//comment
		
	}
	
	public static void display(){
		System.out.println("This is a static method");
	}
	
	public void nonDisplay(){
		System.out.println("This is a non static method");
	}
}
