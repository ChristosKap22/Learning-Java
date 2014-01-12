package methods;

public class PrintName {

	public static void main(String[] args) {
		String name = "Denis Rizov";
		printName(name);
	}
	
	public static void printName(String name) {
		System.out.printf("Hello, %s!", name);
	}

}
