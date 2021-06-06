import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int count = 0;
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter number of rows you want to enter: ");
	  int m = in.nextInt();
	  System.out.println("Enter number of columns you want to enter: ");
	  int n = in.nextInt();
     int[][] num = new int [m][n];
    for(int i =0; i<m ; i++) {
    	for(int j =0;j<n;j++) {
    	  	  Scanner sc = new Scanner(System.in);
    	  	  System.out.println("Enter element "+"["+i+","+j+"]"+": ");
    	  	  num[i][j]=sc.nextInt();
    	}
    }
	System.out.println("Original matrix:");
    for(int i =0; i<m ; i++) {
    	for(int j =0;j<n;j++) {
    		System.out.print(num[i][j]+" ");
    	}
    	System.out.println("");
    }
	 Scanner sc = new Scanner(System.in); 
	 System.out.println("Your choice (ascending/descending): ");
     String s= sc.next();
     switch(s) {
     case "ascending" : 
    	 System.out.println("Row sorting / Column sorting");
    	 String z = sc.next();
    	 switch(z) {
    	 case "row": 
    	      for (int i = 0; i < m; i++) {
    	          for(int j=0;j<n;j++) {
    	              for (int k = 0; k < num[i].length - j - 1; k++) {
    	                  if (num[i][k] > num[i][k + 1]) {
    	                      int t = num[i][k];
    	                      num[i][k] = num[i][k + 1];
    	                      num[i][k + 1] = t;
    	                  }
    	              }
    	          }
    	      }
    	         for(int k =0;k<m;k++) {
    	         	for(int l =0;l<n;l++) {
    	                 System.out.print(num[k][l]+" ");
    	         	} 
    	         	System.out.println("");
    	         }
    	       break;
    	 case "column" :
 	        for(int i = 0; i < m; i++){
 	            for(int j = 0; j < n; j++){
 	                for(int k = 0; k < m - 1 - j; k++){ 
 	                    if(num[k][i] > num[k + 1][i]){
 	                        int temp = num[k][i];
 	                        num[k][i] = num[k + 1][i];
 	                        num[k + 1][i] = temp;
 	                    }
 	                }
 	            }
 	        }
 	        System.out.println("Sorted matrix:");
 	        for(int i = 0; i < m; i++){
 	            for(int j = 0; j < n; j++){
 	                System.out.print(num[i][j] + " ");
 	            }
 	            System.out.println();
 	        }
    	 }
    	 break;

     case "descending":
    	 System.out.println("Row sorting / Column sorting");
    	 String w = sc.next();
    	 switch(w) {
    	 case "row":	 
         for (int i = 0; i < m; i++) {
             for(int j=0;j<n;j++) {
                 for (int k = 0; k < num[i].length - j - 1; k++) {
                     if (num[i][k] < num[i][k + 1]) {
                         int t = num[i][k];
                         num[i][k] = num[i][k + 1];
                         num[i][k + 1] = t;
                     }
                 }
             }
         }
         System.out.println("Sorted matrix:");
            for(int k =0;k<m;k++) {
            	for(int l =0;l<n;l++) {
                    System.out.print(num[k][l]+" ");
            	} 
            	System.out.println("");
            }
            break;
    	 case "column" :
    	        for(int i = 0; i < m; i++){
    	            for(int j = 0; j < n; j++){
    	                for(int k = 0; k < m - 1 - j; k++){ 
    	                    if(num[k][i] > num[k + 1][i]){
    	                        int temp = num[k][i];
    	                        num[k][i] = num[k + 1][i];
    	                        num[k + 1][i] = temp;
    	                    }
    	                }
    	            }
    	        }
    	        System.out.println("Sorted matrix:");
    	        for(int i = 0; i < m; i++){
    	            for(int j = 0; j < n; j++){
    	                System.out.print(num[i][j] + " ");
    	            }
    	            System.out.println();
    	        }
    	        break;
    	 }
     }
	}
}
