package Package_one;

public class changeToUpperCaseAllFirstLetterInString {


	public static void main(String[] args) {
		
		String name="indeian premier leage suren";
		String[] name_array=name.split(" ");
		for(String sub_name:name_array) {
			
			System.out.print(sub_name.substring(0, 1).toUpperCase()+sub_name.substring(1)+" ");
		}
//        char letter=name.charAt(0);
//        System.out.print(Character.toUpperCase(letter));
//        for(int i=1;i<name.length();i++){
//           char ch=name.charAt(i);
//        if(Character.isSpace(ch)){
//            System.out.print(name.charAt(i));
//            i++;
//            letter=name.charAt(i);
//            System.out.print(Character.toUpperCase(letter));
//        }else{
//            System.out.print(name.charAt(i));
//            
//        }  
//        }
	}

}
