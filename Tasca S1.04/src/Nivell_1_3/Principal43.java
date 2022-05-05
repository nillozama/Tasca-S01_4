package Nivell_1_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal43 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> emptyList=new ArrayList<Integer>();
		
		int resultado;
		resultado=requireIntNumber("Introduce un 0 si quieres probocar un ArrayIndexOutOfBoundsException.");
		
		if(resultado!=0) {
			
			emptyList.add(resultado);
		}
		
		try {
			
			generateException(emptyList);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Excepcion tipo ArrayIndexOutOfBoundsException");
		}
	}

	public static void generateException(ArrayList<Integer> emptyList) throws ArrayIndexOutOfBoundsException{
		
		if(emptyList.size()==0) {
			
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			
			System.out.println("La lista no está vacía.");
			System.out.println(emptyList);
		}
	}
	
	public static int requireIntNumber(String message) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println(message);
		num=sc.nextByte();
		
		return num;
	}
}
