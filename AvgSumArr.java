
public class AvgSumArr {
	
		 public static void main(String[] args) {

		   int[] numbers = {22, 19, 10, 35, 12, 25, 22, 9, 8, 12};
		   int sum = 0;
		   Double average;
		   
		  
		   for (int number: numbers) {
		     sum += number;
		   }
		  
		   int arrayLength = numbers.length;

		
		   average =  ((double)sum / (double)arrayLength);

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
		 }
		

}
