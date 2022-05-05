package Nivell_1_1;

import java.util.ArrayList;

public class Principal41 {

	public static void main(String[] args) {

		ArrayList<Month> monthList=new ArrayList<Month>();
		
		monthList=generateMonthList(monthList);
		
		printMonthList(monthList);
	}
	
	public static ArrayList<Month> generateMonthList(ArrayList<Month> monthList) {
		
		Month month;
		month=new Month("Gener");
		monthList.add(month);
		
		month=new Month("Febrer");
		monthList.add(month);
		
		month=new Month("Març");
		monthList.add(month);
		
		month=new Month("Abril");
		monthList.add(month);
		
		month=new Month("Maig");
		monthList.add(month);
		
		month=new Month("Juny");
		monthList.add(month);
		
		month=new Month("Juliol");
		monthList.add(month);
		
		month=new Month("Agost");
		monthList.add(month);
		
		month=new Month("Setembre");
		monthList.add(month);
		
		month=new Month("Octubre");
		monthList.add(month);
		
		month=new Month("Novembre");
		monthList.add(month);
		
		month=new Month("Desembre");
		monthList.add(month);
		
		return monthList;
	}
	
	public static void printMonthList (ArrayList<Month> monthList){
		
		for(Month i:monthList) {
			
			System.out.println(i);
		}
	}
}

