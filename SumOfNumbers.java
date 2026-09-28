import java.util.Scanner;
public class SumOfNumbers {
public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter N: ");
  int n = input.nextInt();

  int sum = 0; 

  for (int number = 1; number <= n; number++){
	sum = sum + number;
   }
  System.out.println(sum);

}
}