package firstSelenium;

public class replaceSpecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= " J A VA ";
		String st1= str.trim();
		String st2= str.replaceAll("\\s", "");
		System.out.print(st1);
		System.out.print(st2);
	}

}
