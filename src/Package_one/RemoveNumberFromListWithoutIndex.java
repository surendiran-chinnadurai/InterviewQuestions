package Package_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveNumberFromListWithoutIndex {

	public static void main(String[] args) {
		//List<Integer> b=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));	}
		
		
		List<Integer> a=new ArrayList<>();
		for(int i=10;i>0;i--) {
			a.add(i);
		}
		Collections.shuffle(a);
		
		Iterator<Integer> b=a.iterator();
		while(b.hasNext()) {
			int c=b.next();
			if(c==4 || c==7) {
				b.remove();
			}
			
		}
		System.out.println(a);
	}
}
