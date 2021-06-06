import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int z;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number: ");
      z = in.nextInt();
      String n=Integer.toString(z);
      String m = n+n;
      String o = n+n+n;
      System.out.println(Integer.parseInt(n)+Integer.parseInt(m)+Integer.parseInt(o));
	}

}
