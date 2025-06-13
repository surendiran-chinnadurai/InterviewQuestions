package Package_one;

public class CountNumberOfchar {

	public static void main(String[] args) {
		 //count non space char
        String input="This is a string";
        char[] ch=input.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(!Character.isSpace(ch[i]))  {
        		count++;
            }
        }
        
        System.out.println("number of char is :" + count);
        
        

	}

}
