package Package_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.removeAll(new ArrayList<>(Arrays.asList(1,3,4,5)));
		System.out.println(a);
		

	}
	

}
