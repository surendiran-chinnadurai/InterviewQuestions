package Package_one;

import java.util.UUID;

public class CreateRandomAlphNumaricString {

	public static void main(String[] args) {
	UUID alpnum=UUID.randomUUID();
			String output=alpnum.toString().replaceAll("-", "").substring(0,6);
			System.out.println(output);
			
		UUID aplnu=UUID.randomUUID();
		String output1=aplnu.toString().replaceAll("-","").substring(0,30);
		System.out.println(output1);
		
	}
}
