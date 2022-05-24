package Nivell_2_1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class Principal41N2 {

	public static void main(String[] args) {
	
	}

	public static Matcher<String> length(Matcher<Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher,
	            "longitud de una cadena de texto", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	            return actual.length();
	        }
	    };
	}
	
	@Test
	public void testNumberCharOfString() {
	    assertThat("Mordor", length(is(8)));
	}
}
