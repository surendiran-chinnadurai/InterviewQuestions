package Package_one;

import java.util.Scanner;

public class challeng_2 {
	public Scanner scan = new Scanner(System.in);

	void validateMark() {
		System.out.print("enter mark :");
		int mark = scan.nextInt();
		if (mark >= 35) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	void validateScholarship() {
		System.out.println("enter income :");
		int income = scan.nextInt();
		if (income > 7000) {
			System.out.println("eligible for scholarship");
		} else {
			System.out.println("not eligible for scholarship");
		}
	}
	void dividBy3And5() {
		System.out.println("enter number to division operation :");
		int input=scan.nextInt();
		if(input%3==0 && input%5==0) {
			System.out.println("number is divided by both 3 and 5");
		}else 
		{
			System.out.println("not divided by 3 and 5");
		}
	}
	void oddOrEven(int Number) {
		if(Number%2==0) {
			System.out.println("even Number");
		}else {
			System.out.println("odd Number");
		}
		
	}

	public static void main(String[] args) {
		challeng_2 obj1 = new challeng_2();
		//obj1.validateMark();
		//obj1.validateScholarship();
		//obj1.dividBy3And5();
		obj1.oddOrEven(16);
	}

}
