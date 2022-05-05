package Nivell_1_2;

import java.util.HashMap;
import java.util.Scanner;

public class Principal42 {
	
	public static void main(String[] args) {
		
		dni();
	}

	public static void dni() {
		
		int dniNumber;
		char dniChar;
		
		dniNumber=requireNumber("Introduce el número del DNI sin la letra.");
		dniChar=calculateDniChar(dniNumber);
		printResultDni(dniNumber, dniChar);	
		
	}
	
	public static char calculateDniChar(int number) {
		
		HashMap<Integer, Character> dniNumChar= new HashMap<Integer, Character>();
		char dniChar=' ';
		int indexNum;
		
		dniNumChar.put(0, 'T');
		dniNumChar.put(1, 'R');
		dniNumChar.put(2, 'W');
		dniNumChar.put(3, 'A');
		dniNumChar.put(4, 'G');
		dniNumChar.put(5, 'M');
		dniNumChar.put(6, 'Y');
		dniNumChar.put(7, 'F');
		dniNumChar.put(8, 'P');
		dniNumChar.put(9, 'D');
		dniNumChar.put(10, 'X');
		dniNumChar.put(11, 'B');
		dniNumChar.put(12, 'N');
		dniNumChar.put(13, 'J');
		dniNumChar.put(14, 'Z');
		dniNumChar.put(15, 'S');
		dniNumChar.put(16, 'Q');
		dniNumChar.put(17, 'V');
		dniNumChar.put(18, 'H');
		dniNumChar.put(19, 'L');
		dniNumChar.put(20, 'C');
		dniNumChar.put(21, 'K');
		dniNumChar.put(22, 'E');
		
		indexNum=number%23;
		
		dniChar=dniNumChar.get(indexNum);
		return dniChar;
	}
	
	public static void printResultDni(int dniNumber, char dniChar){
			
			System.out.println("El DNI es "+dniNumber+dniChar+".");
	}
	
	public static int requireNumber(String message) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println(message);
		num=sc.nextInt();
		
		return num;
	}
}
