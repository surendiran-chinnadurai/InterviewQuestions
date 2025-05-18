package Package_one;

public class addNumberFromAlphNumaricString {
	
	public static void main(String[] args) {
        String name="suren23fser50";
        int sum=0;
        String number="";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isDigit(ch)){
               number=number+ch; 
            }
            else{
                if(!number.isEmpty()){
            sum=sum+Integer.parseInt(number);
            number="";        
            }
        }
    }
        if(!number.isEmpty()){
        sum=sum+Integer.parseInt(number);
        }
        System.out.println(sum);       
    }

}
