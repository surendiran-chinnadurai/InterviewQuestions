package Package_one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicateofSubString {

	public static void main(String[] args) {
		String name="java php java selenium c## selenium sql php";
		String[] split=name.split(" ");
		//List<String> list_str=Arrays.asList(split);
		Set<String> s1=new HashSet<>(Arrays.asList(split));
		System.out.println(s1);
//		Object[] ob=s1.toArray();
//		System.out.println(Arrays.toString(ob));
		String str = "Jav%a4567&$%";
		System.out.println(str.replaceAll("[a-zA-Z0-9]",""));

	}

}
