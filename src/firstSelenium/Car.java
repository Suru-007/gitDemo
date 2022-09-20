package firstSelenium;


public class Car {
public static void main(String... args) {

String str="Sourabh";
char[] arr= str.toCharArray();
 for(int i= arr.length-1;i>=0;i--) {
	 System.out.print(arr[i]);
 }

 System.out.println("*****");
 for(int i= str.length()-1;i>=0;i--) {
	 System.out.print(str.charAt(i));
 }
StringBuilder st= new StringBuilder(str);
System.out.println(st.reverse());

StringBuilder sb= new StringBuilder(str);
System.out.println(sb.reverse());
}
}


