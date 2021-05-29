import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int a = in.nextInt();
      int c = (int) Math.pow(a,2);
      if(c%10==a%10) {
    	  System.out.println("Automorphic Number.");
      }
      else {
    	   System.out.println("Not an Automorphic Number.");
      }
	}
	

}
