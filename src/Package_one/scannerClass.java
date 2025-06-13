package Package_one;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String name =scan.nextLine();
		int age=scan.nextInt();
		scan.nextLine();
		String address=scan.nextLine();
		char grade=scan.next().charAt(0);
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
		System.out.println(address);
		String name1="surendira";
		
		
		
	}

}
