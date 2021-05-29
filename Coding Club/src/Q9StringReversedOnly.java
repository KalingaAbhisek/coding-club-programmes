import java.util.Scanner;
public class Q9StringReversedOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      String str[] = sc.nextLine().split(" "); 
	      String res = ""; 
	      for (int i = str.length - 1; i >= 0; i--) { 
	        res += str[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + res); 
	}

}
