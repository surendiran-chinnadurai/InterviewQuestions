package Package_one;

public class findUpperCaseLowerCaseAndSpecialCharacter {

	public static void main(String[] args) {
		
		String input="asfsRasdL@";
		char[] ch=input.toCharArray();
		for(char letter:ch) {
			if(Character.isLowerCase(letter)) {
				System.out.println(letter +" is lowercase");
			}if(Character.isUpperCase(letter)) {
				System.out.println(letter+" is uppercase");
			}if(!Character.isLetterOrDigit(letter)) {
				System.out.println(letter+" is specialchar");
			}
		}

	}

}
