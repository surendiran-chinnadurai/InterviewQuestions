package Package_one;

import java.util.HashMap;
import java.util.Map;

public class FindUniueCharFromAString {

	public static void main(String[] args) {
		String name = "surendiran";
		char[] arrayChar = name.toCharArray();
		System.out.println(arrayChar.length);
		Map<Character, Integer> Uniqu = new HashMap<>();
		for (int i = 0; i < arrayChar.length; i++) {
			if (Uniqu.containsKey(arrayChar[i])) {
				int value = Uniqu.get(arrayChar[i]);
				Uniqu.put(arrayChar[i], value + 1);
			} else {
				Uniqu.put(arrayChar[i], 1);
			}

		}
		System.out.println(Uniqu.size());
		for (int i = 0; i < arrayChar.length; i++) {
			if (Uniqu.get(arrayChar[i]) == 1) {
				System.out.println("Uniqu :" + arrayChar[i]);
			}
		}

	}

}
