import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc = new Scanner(System.in);
	  System.out.println("How much element you want to display ?");
	  int n = sc.nextInt();
       int a = 0;
       int b = 1;
       int c = 1;
       int d = a+b+c;
       System.out.print(a+" "+b+" "+c+" "+d+" ");
      for(int i =5;i<=n;i++) {
          a=b;
          b=c;
          c=d;
    	  d=a+b+c;
    	  System.out.print(d+" ");
      }
      
	}

}
