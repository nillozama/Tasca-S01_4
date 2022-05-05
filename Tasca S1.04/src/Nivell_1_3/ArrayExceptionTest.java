package Nivell_1_3;

import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArrayExceptionTest {
	
	static ArrayList<Integer> emptyList;
	
	public ArrayExceptionTest() {
		
	}
	
	@BeforeAll
	
	static void generateList() {
		
		emptyList=new ArrayList<Integer>();
	}
	
	@Test
	
	public void trhowArrayIndexOutOfBoundsException() {
		
		assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
			
			Principal43.generateException(emptyList);
		});
	}
}
