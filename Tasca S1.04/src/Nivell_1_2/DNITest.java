package Nivell_1_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DNITest {
	
	public DNITest() {	
	}

	@ParameterizedTest
	@CsvSource({"43533290,V","43533291,H","43533289,Q","34526781,D","23456234,Y","31040521,C","78215620,A","23789012,C","74562390,R","65342892,F"})
	
	void dniChars(int dniNumber, char dniChar) {

		assertEquals(Principal42.calculateDniChar(dniNumber),(dniChar));
	}
}
