import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      System.out.println("Enter first number: ");
      int a = in.nextInt();
      System.out.println("Enter second number: ");
      int b = in.nextInt();
      System.out.println("Enter third number: ");
      int c = in.nextInt();
      System.out.println((a>b&&a>c)?a:(b>a&&b>c)?b:c);
	}

}
