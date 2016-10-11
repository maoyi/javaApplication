/* in HelloWorld3 it records the practices and solutions programmed from chapter 3 */
package randomProject;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HelloWorld3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	guessNumber();
	}
	static <K,V extends Comparable<? super V>> 
	List<Entry<K,V>> entriesSortedByValues(Map<K,V> result){
List<Entry<K,V>> sortedEntries = new ArrayList<Entry<K,V>>(result.entrySet());

Collections.sort(sortedEntries,
		new Comparator<Entry<K,V>>(){
		@Override
		public int compare(Entry<K,V> e1, Entry<K,V> e2){
			return e2.getValue().compareTo(e1.getValue());
		}
});
 return sortedEntries;
}
	
	public static void guessNumber(){
		
		int randomNumber = (int)(Math.random()*101);
		System.out.println("enter a number between 1-100: " + randomNumber+" and"
				+ " type 'quit' to exit the game");
		Scanner input = new Scanner(System.in);
		
		
		Map<String, Integer> result = new HashMap<String, Integer>(); 
	 
		
		
		
		int guess = -1;
		int counter = 1;
	
	while(guess != randomNumber){
		String s = input.nextLine();
	
	if(s.trim().isEmpty()){	
		System.out.println("plz enter something");
	}else{
			if(java.lang.Character.isDigit(s.charAt(0))){
				double decimal = Double.parseDouble(s);
				
				if(decimal % 1==0){
					guess = (int) decimal;
					if(guess>100 || guess <0){
					System.out.println("out of range!, plz guess from 1 - 100");
					counter++;
					}else if(guess < randomNumber){
					System.out.println("lower guess!");
					counter++;
					}else if(guess > randomNumber){
					System.out.println("higher guess!");
					counter++;
					}
					if(guess == randomNumber){
						
					System.out.println("correct guess!");
					System.out.println("please enter your name here: ");
					String player = input.nextLine();
					System.out.println("you have used "+counter+" times to get the correct answer");					
					System.out.println("would you like to play again?(y/n)");
					result.put(player, counter);
					
					String b = "unspecified";
					while(!b.equalsIgnoreCase("y") && !b.equalsIgnoreCase("n")){
					String c = input.nextLine();
					if(c.equalsIgnoreCase("y")){
						b = c;
						randomNumber = (int)(Math.random()*101);
						System.out.println("enter a number between 1-100: " + randomNumber+" and"
								+ " type 'quit' to exit the game");
						guess = -1;
						counter = 1;
					}else if(c.equalsIgnoreCase("n")){
						b = c;
						System.out.println("goodbye!");
					System.out.println(entriesSortedByValues(result));
						/*	for(String key : result.keySet()){
							System.out.println(key+" "+result.get(key));
						}*/
					/*	for(Map.Entry<String, Integer> entry : result.entrySet()){
							
							System.out.println("Player name: "+player+" used " +counter+" time(s).");
						} This loop only prints out hte last input name and numbers as the replayed times*/
					}/*else if(b.getKeyCode()==KeyEvent.VK_ESCAPE){
						break;
					}*/else{
						System.out.println("plz enter 'y' or 'n'!");
					}
					}
					}
				}else{
						System.out.println("enter an integer!");
					}
				
			}else if(s.equalsIgnoreCase("quit")){
				
					System.out.println("the game ends!");
					guess = randomNumber;
			}else{
				System.out.println("enter a digit number!");
			}
	}
		}
	}
		
	
}
