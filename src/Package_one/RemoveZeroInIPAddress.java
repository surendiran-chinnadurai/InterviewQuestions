package Package_one;

public class RemoveZeroInIPAddress {

	public static void main(String[] args) {
		String ip="0130.040.044.0010";
		String[] ip_array=ip.split("\\.");
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<ip_array.length;i++) {
			int output=Integer.parseInt(ip_array[i]);
			String output1=Integer.toString(output);
			if(i<3) {
			StringBuilder sb2=sb1.append(output1).append(".");
			}
			if(i==3) {
				StringBuilder sb2=sb1.append(output1);
				System.out.println(sb2);
			}
		}
	}	
}
