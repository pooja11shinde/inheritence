package collection1;

class A {
	int a, b;
	A () {
		a= 10;
		b= 20;
		System.out.println("Constructor of class A");

	}
	void show() {
		 System.out.println("a - "+ a + "  b - "+ b);
		 System.out.println("show() of A class");

	}
}
class B extends A{
	  int x,y;
	  
	  B(){
		  x = 101;
		  y = 404;
			 System.out.println("constructor of B class");

	  }
	  void show() {
		  super.show();

		  
		  System.out.println("x - "+ x + "  y - "+ y);

			 System.out.println("show() of B class");

	  }
	  
}
class child extends B{
	  
	  child(){
			 System.out.println("constructor of child class");

	  }
	  void display() {
			 System.out.println("display() of child class");

	  }
	  
}

public class Inheritance {

	public static void main(String[] args) {
		B obj = new child();

		obj.show();
		//obj.show();
		//obj.display();
		

	}

}
