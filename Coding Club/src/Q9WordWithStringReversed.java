import java.util.Scanner;
public class Q9WordWithStringReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner in = new Scanner(System.in);
	  String rev = "";
	  String str = in.nextLine();
	  char ch[] = str.toCharArray();
	  for(int i=ch.length-1;i>=0;i--) {
		  rev+=ch[i];
	  }
	  System.out.println(rev);
      
	}

}
