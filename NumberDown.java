import java.util.Scanner;
public class NumberDown{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter N: ");
  int n = input.nextInt();

  int sum = 0; 

  for (int number = n; number >= 1; number--){
	  System.out.println(number);
   }

}
}