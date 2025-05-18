package Package_one;

public class passWordValidation {
	

	    public boolean isValidPassword(String password) {
	        String regex = "^(?=.*[@])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).*{8,24}$";
	        return password.matches(regex);
	    }

	    public static void main(String[] args) {
	        passWordValidation pw = new passWordValidation();
	        boolean output = pw.isValidPassword("Sharsourwoeu253a@23");
	        System.out.println(output); // true
	    }
	}


//	public boolean PasswordValidation(String Password) {
//		//for Strong password one special charter (@ ! #) atleast one upper and lower and numaric
//		String regex="^(?=.*[@])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])$";
//		boolean result=Password.matches(regex);
//		return result;
//	}
//	public static void main(String[] args) {
//		passWordValidation pw=new passWordValidation();
//		boolean output=pw.PasswordValidation("SecureP@ss1");
//		System.out.println(output);
//		
//
//	}


