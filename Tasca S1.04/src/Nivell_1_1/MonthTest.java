package Nivell_1_1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MonthTest {
	
	static ArrayList<Month> monthList;
	
	public MonthTest() {
		
	}
	
	@BeforeAll
	
	static void generateList() {
		
		monthList=new ArrayList<Month>();
		
		monthList=Principal41.generateMonthList(monthList);
	}
	
	@Test
	void twelveMonthSize() {
		
		assertEquals(monthList.size(), 12);
	}
	
	@Test
	void listNotNull() throws Exception {
		
		assertNotNull(monthList);
	}
	
	@Test
	void AugustPosition() {
		
		assertEquals(monthList.get(7).getName(), "Agost");
	}
	
	@AfterAll
	
	static void printList() {
		
		Principal41.printMonthList(monthList);
	}	

}
