package oleg1dorozhko;

import java.util.Scanner;

public class Launcher {

	public String toRim(int n) throws Exception {
		if(n==1) return "|";
		if(n==2) return "||";
		if(n==3) return "|||";
		if(n==4) return "|V";
		if(n==5) return "V";
		if(n==6) return "V|";
		if(n==7) return "V||";
		if(n==8) return "V|||";
		if(n==9) return "|X";
		if(n==10) return "X";
		if(n==100) return "C"; //220 CCXX
		throw new Exception("Unknown number");
	}
	
	public static int toIntFromRim(String rim) throws Exception {
		
		if(rim.equals("|")) return 1;
		if(rim.equals("||")) return 2;
		if(rim.equals("|||")) return 3;
		if(rim.equals("|V")) return 4;
		if(rim.equals("V")) return 5;
		if(rim.equals("V|")) return 6;
		if(rim.equals("V||")) return 7;
		if(rim.equals("V|||")) return 8;
		if(rim.equals("|X")) return 9;
		if(rim.equals("X")) return 10;
		if(rim.equals("C")) return 100;
	
		throw new Exception("Unknown number");
	}
	
	public static int parseRimPhrase(String rim) throws Exception {
		String[] arr = rim.split("");
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			log(""+i,arr[i]);
			sum += toIntFromRim( arr[i] );
		}
		return sum;
	}
	
	private static void log(String msg, String s) {
		System.out.println(""+msg+" "+s);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		try 
		{
		
			log("test ok");
			 
			System.out.println("Enter phrase: ");

			String phrase = in.nextLine();  // Read user input
			if(phrase.length()>0) {
				String[] arr = phrase.split("");
				String number = arr[0];
				if(number.contains("|")) {
				
					int number1 = parseRimPhrase(number);
					log("Result is: ",""+number1);
				
				} else if(number.contains("1")) {
					
					int number1 = Integer.parseInt(number);
					log("Result is: ",""+number1);
				}
			}
			else new Exception("No correct input. Empty.");
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		finally {
			
			in.close();
			
		}
	}

	public static void log(String s) {
			System.out.println(s);
	}

}
