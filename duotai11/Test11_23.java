package duotai11;

public class Test11_23 {
	public static void main(String[] args) {
		new A();
		new B();
		System.out.println("1");
	}
}
class A{
	int i=7;
	
	public A() {
		setI(20);
		System.out.println("i from A is "+i);
		
	}
	public void setI(int i) {
		this.i=2*i;
	}
}

class B extends A{
	public B() {
		System.out.println("i from B is "+i);
	}
	
	public void setI(int i) {
		this.i=3*i;
	}
}