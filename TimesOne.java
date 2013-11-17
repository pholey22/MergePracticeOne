import java.util.Scanner;

public class TimesOne{
	public static void main(String [] args){

		Scanner read = new Scanner(System.in);


		System.out.print("Enter a Number: ");
		int number = read.nextInt();
		System.out.print("Now, enter a word: ");
		String word = read.next();

		for(int i = 0; i < 10; i++){
			System.out.println(number+", "+word);

		}




	}
}
