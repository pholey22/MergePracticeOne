import java.util.Scanner;

public class TimesTwo{
	public static void main(String [] args){

		Scanner read = new Scanner(System.in);


		System.out.print("Enter a Number: ");
		int number = read.nextInt();

		for(int i = 0; i < 10; i++){
			System.out.println(number * 2);

		}




	}
}