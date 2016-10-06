package randomProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("enter your name here: ");
    String youName = input.next();
    System.out.println("and your age is: ");
    		
    		int youAge = input.nextInt();
    		System.out.println("so you are a noob " + youName + 
    				"and you have lived " + youAge + " years for" +
    				"your useless life");
		/*ShowTime();*/
    		change();
		 
	JOptionPane.showMessageDialog(null, "welcome to java");	

}
	public static void ShowTime(){
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds % 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds /60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes /60;
		long currentHour = totalHours%24;
		System.out.println("current time is " + currentHour +
				":" + currentMinute + ":" + currentSecond + " GMT");
	}
	public static void change(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter your total money: ");
		double money = input.nextDouble();
		
		int newMon = (int) (money * 100);
		int dollar = newMon / 100;
		int quarter = (newMon % 100)/25;
		int dime = ((newMon % 100)%25)/10;
		int nickel = ((((newMon % 100)%25)%10)/5);
		int penny = ((((newMon % 100)%25)%10)%5);
		System.out.println("you have: "+dollar+
				"dollar(s)");
		System.out.println(quarter+" quarter(s)");
		System.out.println(dime+ " dime(s)");
		System.out.println(nickel + "nickel(s)");
		System.out.println(penny + "penny(s)");
	}
}