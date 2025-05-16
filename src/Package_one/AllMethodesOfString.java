package Package_one;

public class AllMethodesOfString {

	public static void main(String[] args) {
		String name = "Hello world i love java";
		String name1 = " Hello world i love java";
		System.out.println(name.charAt(4)); // print the 4th index char
		System.out.println(name.length()); // length of Sting
		System.out.println(name.equals("Hello world i love java")); // compare with given String
		System.out.println(name.equalsIgnoreCase("Hello World I LOVE java")); // compare string not case sensitive
		System.out.println(name.compareTo(name1)); // compare to another String
		System.out.println(name.indexOf('o')); // provide the index number char
		System.out.println(name.indexOf("love")); // provide the index number of String
		System.out.println(name.lastIndexOf('o')); // provide the index number of char which apperas last
		System.out.println(name.lastIndexOf("java"));// provide the index number of string which apperas last
		System.out.println(name.startsWith("Hello")); // return boolean if starts is given string
		System.out.println(name.endsWith("java")); // return boolean if ends with given string
		System.out.println(name.substring(3)); // sub string is used to print string starts from index number 3
		System.out.println(name.substring(6, 12)); // create sub string
		System.out.println(name.replace('o', 'O')); // replace o by O
		System.out.println(name.replaceFirst("love", "LOVE")); // if multiple value finds it replace only first value
		System.out.println(name.replaceAll("[a-z]", "")); // remove all except a-z
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name1.split("a")); // split into string array
		System.out.println(name1.trim()); // removes white space in the front of string
		System.out.println(name1.join(" - ", "i", "Know", "java", "Selenium")); // join all substring with delimeter " -
																				// "
		System.out.println(name1.toCharArray()); // convert the String into Char array
		System.out.println(name1.repeat(3)); // print the string 3 times.

	}

}
