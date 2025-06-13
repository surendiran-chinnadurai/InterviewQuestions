package Package_one;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class interviewPrograms_2 {

	
	void arrayDuplicate() {
	int[] ar = { 1, 3, 4, 3, 7, 1 };
	Set<Integer> in_array=new HashSet<>();
		for(int in:ar) {
		in_array.add(in);	
	}
	System.out.println(in_array);
	}
	public static void main(String[] args) {
		interviewPrograms_2 ob=new interviewPrograms_2();
		ob.arrayDuplicate();
		String name="surendiran";
		StringBuilder sb=new StringBuilder(name);
		System.out.println(sb.reverse());
		
		Integer a[]= {1,4,-3,2,-10,5};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		ob.ArrayUnique();
		
	}
	void ArrayUnique() {
		int a[] = { 1, 3, 4, 1, 3, 2 };
		int count=0;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && !(i==j)) {
					count++;
				}
				}
			if(count<1) {
				System.out.println(a[i]);
			}
		}
	}

}
