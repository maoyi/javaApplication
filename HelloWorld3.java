/* in HelloWorld3 it records the practices and solutions programmed from chapter 3 */
package randomProject;

import java.util.Scanner;

public class HelloWorld3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	intCheck();
	}
	public static void intCheck(){
		System.out.println("enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		boolean isInteger = number%2 ==0;
			System.out.println("is the "+number+" is integer? "+isInteger);
		
	}
}
