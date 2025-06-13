package Package_one;

abstract class abstraction {

	abstract void template();

	abstract void template2();

	void template1() {

	}
}

abstract class abstractClass extends abstraction {

	@Override
	public void template() {
		System.out.println("AbstractClass template");

	}
}

public class AbstractClass extends abstractClass {

	@Override
	public void template() {
		System.out.println("abs class tempate");

	}

	@Override
	void template2() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		AbstractClass ab = new AbstractClass();
		ab.template();
		ab.template1();
		ab.template2();

	}
}
