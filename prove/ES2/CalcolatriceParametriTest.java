import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalcolatriceParametriTest {
	
	Calcolatrice calc;
	static HashMap<String, Double> amb;
	
	@BeforeAll
	static void beforeAll() {
		
		amb = new HashMap<String, Double>();
		amb.put("x", (double) 4);
		amb.put("y", (double) 6);		
	}

	@ParameterizedTest
	@MethodSource("arguments")
	void testCalcola(String espressione, Double expected) {

		calc = new Calcolatrice(espressione, amb);
		calc.calcola();
		Double actual = calc.stack.pop();
		assertEquals(expected, actual);
	}

	private static Stream<Arguments> arguments() {
		return Stream.of(
				Arguments.of("xy+", 10.0),
				Arguments.of("xy-", -2.0),
				Arguments.of("xy*", 24.0),
				Arguments.of("xy/", 0.6666666666666666)
				);
	}
}
