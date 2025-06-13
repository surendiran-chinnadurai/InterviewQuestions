package Package_one;

import java.util.Arrays;

public class SortaArrayFindSecLargestValue {

	public static void main(String[] args) {
		int[] a= {2,4,5,3,6};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}

}
