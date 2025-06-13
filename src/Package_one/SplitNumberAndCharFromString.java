package Package_one;

public class SplitNumberAndCharFromString {

	public static void main(String[] args) {
		String input="ashfow87w6res9shfowrywedSHRWEE";
		String s1=input.replaceAll("[a-zA-Z]", "");  //[^a]
		System.out.println(s1);
		String s2=input.replaceAll("[0-9]", "");
		System.out.println(s2);
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=10;i++) {
			sb.append(1);
			for(int j=1;j<=1000;j++) {
				sb.append(1);
			}
		}
		
		
		System.out.println(sb.length());
		StringBuilder sb1=new StringBuilder();
		synchronized(sb1) {
			for(int i=1;i<=1000;i++) {
				sb1.append(1);
			}
			for(int i=1;i<=1000;i++) {
				sb1.append(1);
			}
		}
		System.out.println(sb1.length());
	}

}
