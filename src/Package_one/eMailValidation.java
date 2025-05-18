package Package_one;

public class eMailValidation {

	public static boolean validateEmail(String email) {
		
		String validate="^[A-Za-z0-9._-]+@[a-zA-Z0-9-_.]+\\.[a-zA-Z]+$";
		boolean validation=email.matches(validate);
		return validation;
		
	}
	public static void main(String[] args) {
		
		System.out.println(eMailValidation.validateEmail("raj@ibm.com"));
		
	}

}
