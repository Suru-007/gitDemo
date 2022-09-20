package firstSelenium;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st= "I love my india";
String st1= st+" ";
String word=" ",rev=" ";
for(int i=0;i<=st1.length()-1;i++) {
	char sen= st1.charAt(i);
	if(sen!= ' ') {
		word=word+sen;
	}
	else {
		rev= word + rev;
		word=" ";
	}
}
System.out.println(rev);
	}

}
