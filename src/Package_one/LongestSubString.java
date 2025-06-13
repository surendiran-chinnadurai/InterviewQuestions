package Package_one;

public class LongestSubString {

	public static void main(String[] args) {
		String name = "surendiranashvithamadhukshara";
		String longest = "";
		String current = "";
		for (char ch : name.toCharArray()) {
			String a = String.valueOf(ch);
			if (current.contains(a)) {
				current = current.substring(current.indexOf(a)+1);
			}
			current = current + a;
			if (current.length() > longest.length()) {
				longest = current;

			}

		}
		System.out.println("longest String is :"+ longest);
	}

}
