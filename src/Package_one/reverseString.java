package Package_one;

import java.util.HashSet;
import java.util.Set;

public class reverseString {
	void reversaString(String name) {
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}

	void printUniquChar(String name) {
		char[] letters = name.toCharArray();
		Set<Character> uniqu = new HashSet<>();
		for (int i = 0; i < letters.length; i++) {
			uniqu.add(letters[i]);
		}
		System.out.println(uniqu);
	}

	void uniquCharWithoutCollections(String name) {
		name = name.toLowerCase();
		int[] uniqu = new int[256];
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			System.out.println(uniqu[ch]);
			uniqu[ch] = uniqu[ch] + 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (uniqu[ch] == 1) {
				sb.append(name.charAt(i));
			}

		}
		System.out.println(sb);
	}

	void reversaSubString(String name, String substring) {
		String[] name_array = name.split(" ");
		for (int i = 0; i < name_array.length; i++) {
			if (name_array[i].equalsIgnoreCase(substring)) {
				StringBuilder sb = new StringBuilder();

				for (int j = name_array[i].length() - 1; j >= 0; j--) {
					sb.append(name_array[i].charAt(j));
				}
				System.out.print(sb + " ");
			} else {
				System.out.print(name_array[i] + " ");
			}

		}
	}

	void findingVowelsInString(String name) {
		char[] name_ar = name.toLowerCase().toCharArray();
		int count = 0;
		for (int i = 0; i < name_ar.length; i++) {
			if (name_ar[i] == 'a' || name_ar[i] == 'e' || name_ar[i] == 'i' || name_ar[i] == 'o' || name_ar[i] == 'u') {
				count = count + 1;
			}
		}
		System.out.println(count);

	}

	int factorialOfGivenNumber(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	int countEvenNumbers(int start_number, int end_number) {
		int count = 0;
		for (int i = start_number; i <= end_number; i++) {
			if (i % 2 == 0) {
				count = count + 1;
			}
		}
		return count;

	}

	int sumOfEvenNumbers(int start_number, int end_number) {
		int sum = 0;
		for (int i = start_number; i <= end_number; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;

	}

	void ReversTheNumber(int input) { // 456
		int i = 0, j = 0;
		while (input > 9) {
			i = input % 10;
			j = (j * 10) + i;
			input = input / 10;
		}
		if (input < 9) {
			j = (j * 10) + input;
		}
		System.out.println(j);
	}

	void palindromeNumber(int input, int end) {

		for (int start = input; start <= end; start++) {
			int i = 0, j = 0, n = 0;
			n = start;
			int start_1 = start;

			while (start_1 > 9) {
				i = start_1 % 10;
				j = (j * 10) + i;
				start_1 = start_1 / 10;
			}
			if (start_1 < 9) {
				j = (j * 10) + start_1;
			}
			if (n == j) {
				System.out.println(j);
			}

		}
	}

	void countDigits(int a) {

		int count = 0;
		while (a > 0) {
			a = a / 10;
			count += 1;
		}
		System.out.println(count);
	}

	void sumOfDigits(int a) {
		int sum = 0, j = 0;
		while (a > 0) { // 222 22 2
			j = a % 10; // 2
			sum += j; // 2
			a = a / 10;
		}
		System.out.println(sum);
	}

	void fibonachiSerios(int d) {
		int a = 0, b = 1, c = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 0; i < d; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

	void fibonachiSeriosSum(int d) {
		int a = 0, b = 1, c = 0, e = 0;
		for (int i = 0; i < d; i++) {
			c = a + b;
			a = b;
			b = c;
			e = e + c;
		}
		System.out.println(e);
	}

	void palindromeString(String input) {
		String name = input;
		String output = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			output = output + ch;
		}
		if (name.equals(output)) {
			System.out.println(output);
		} else {
			System.out.println("not a palindrom");
		}

	}

	void shortArray() {
		int[] input = { 20, 100, 80, 10, 5 };
		int temp;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		for (int k = 0; k < input.length; k++) {
			System.out.println(input[k]);
		}
	}

	void assendingArrayLessSecondValue() {
		int a[] = { 10, 100, 90, 20, 40 };
		int[] b = new int[a.length - 1];
		int temp;
		for (int i = 0; i < a.length-1; i++) {
			b[i] = a[i] - a[i + 1];
		}
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}StringBuilder sb=new StringBuilder();
			sb.setCharAt(0, 'h');
		}
		for(int i=0;i<b.length;i++) {
			System.err.println(b[i]);
		}
	}

	public static void main(String[] args) {
		reverseString ob = new reverseString();
		// ob.reversaString("java");
		// ob.printUniquChar("surendiran");
		// ob.uniquCharWithoutCollections("Madhukshara");
		// ob.reversaSubString("i love my lovely family","lovely");
		// ob.findingVowelsInString("surendiRan");
		// System.out.println(ob.factorialOfGivenNumber(5));
		// System.out.println(ob.countEvenNumbers(1, 100));
		// System.out.println(ob.sumOfEvenNumbers(1, 500));
		// ob.ReversTheNumber(1234567);
		// ob.palindromeNumber(1,555);
		// ob.countDigits(2234567);
		// ob.sumOfDigits(22394723);
		// ob.fibonachiSerios(10);
		// ob.fibonachiSeriosSum(2);
		// ob.palindromeString("appa");
		//ob.shortArray();
		ob.assendingArrayLessSecondValue();
	}

}
