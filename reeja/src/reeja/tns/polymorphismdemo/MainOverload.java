package reeja.tns.polymorphismdemo;

public class MainOverload {
	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		System.out.println(ob.add(10,20));
		System.out.println(ob.add(10,20,30));
		System.out.println(ob.add(2.3f, 2.3f));
	}

}
