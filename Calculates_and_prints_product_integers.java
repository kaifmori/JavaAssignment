import java.util.Scanner;
public class Calculates_and_prints_product_integers {
	 public static void main(String[] args)
	   {
	      Scanner sc = new Scanner(System.in);

	      int a,b,c,product; 
	      
	      System.out.print("Enter first integer: "); 
	      a = sc.nextInt(); 

	      System.out.print("Enter second integer: "); 
	      b = sc.nextInt(); 
	      
	      System.out.print("Enter third integer: "); 
	      c = sc.nextInt(); 

	      product = a * b * c; 

	      System.out.printf("Product %d%n", +product);
	   } 

}
