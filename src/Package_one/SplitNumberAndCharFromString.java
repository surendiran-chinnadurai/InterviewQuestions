package Package_one;

public class SplitNumberAndCharFromString {

	public static void main(String[] args) {
		String input="ashfow87w6r9shfowrywedSHRWEE";
		String s1=input.replaceAll("[a-zA-Z]", "");
		System.out.println(s1);
		String s2=input.replaceAll("[0-9]", "");
		System.out.println(s2);
	}

}
