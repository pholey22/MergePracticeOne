import java.util.Scanner;

public class TimesTwo{
	public static void main(String [] args){

		Scanner read = new Scanner(System.in);
		int number;
		String word;


		System.out.print("Enter a Number: ");
		number = read.nextInt();

		System.out.print("Enter a Word: ");
		word = read.next();

		for(int i = 0; i < 10; i++){
			System.out.println(number * 2 + " " + word);

		}




	}





}