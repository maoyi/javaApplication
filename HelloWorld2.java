package randomProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld2 {
  
	
	public static void main(String[] args){
		temperature();
	}
	 public static void degreeChange(){
		System.out.println("enter a degree in Celsisus: ");
		Scanner input = new Scanner(System.in);
		double cel = input.nextDouble();	
		double fahr = (9/5)*cel+32;
		System.out.println(cel + " celsius is " + fahr+" Fahreheit");
	 }
	 public static void volumeCal(){
		 System.out.println("enter the radius and length of a cylinder: ");
		 Scanner input = new Scanner(System.in);
		 double radius = input.nextDouble();
		 double length = input.nextDouble();
		 
		 double area = radius*radius*Math.PI;
		 double volume = area * length;
		 System.out.println("the area is " + area);
		 System.out.println("the volume is "+ volume);
	 }
	 public static void yearInterest(){
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter investment amount: ");
		 double investNum = input.nextDouble();
		 System.out.println("enter the annual interest rate: ");
		 double annulRate = input.nextDouble();
		 System.out.println("enter the years of investment taken: ");
		 double year = input.nextDouble();
		 
		 double investValueTotal = investNum * Math.pow(1 + annulRate, year);
		 System.out.println("The total investment value within "+year+" is: " + investValueTotal);
	 }
	 public static void bankDeposite(){
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("please enter the inital amount of money, months and yearly rate: ");
		 double money = input.nextDouble();
		 int month = input.nextInt(); 
		 double annulRate = input.nextDouble();
		 double monthRate = annulRate/12;
		 
		 
		 double finalTotal = money * (1 + monthRate);
		
		 System.out.println("the total money after 1st month is " + finalTotal);
		 if(month > 1){
			  
			 for(int i = 2; i<=month;i++){
		 
				finalTotal = (money+finalTotal) * (1 + monthRate);
		 System.out.println("the total money afer " + i + "th month is: " + finalTotal);
			 }
		 }
		 }
	 public static void temperature(){
		 Scanner input = new Scanner(System.in);
		 System.out.println("please enter the temperature in Fahrenheit: ");
		 String temperature = input.nextLine();
		 System.out.println("please enter the wind speed: ");
		 String windSpeed = input.nextLine();
		 
		 
		 if(java.lang.Character.isDigit(temperature.charAt(0))&&java.lang.Character.isDigit(windSpeed.charAt(0))){
			 double newTemp = Double.parseDouble(temperature);
			 double ws = Double.parseDouble(windSpeed);
			 if(newTemp > 41 || newTemp < -58){
				 System.out.println("please enter a temperature between -58 to 41");	 
			 }else if(ws < 2){
				 System.out.println("please enter a wind speed higher than 2");
			 }else{
				double windChillIndex = 35.74+0.6215*newTemp-35.75*Math.pow(ws, 0.16)+0.4275*newTemp*Math.pow(ws, 0.16);
				System.out.println("The wind chill index is: "+windChillIndex);
			 }
			 }else{
		 System.out.println("please enter a numeric value!");
		 }
		 
	 }
	
 }

