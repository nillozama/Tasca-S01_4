package Nivell_2_1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class MacherNumOfChar extends FeatureMatcher<String, Integer>{

	public MacherNumOfChar(Matcher<? super Integer> subMatcher, String featureDescription, String featureName) {
		super(subMatcher, featureDescription, featureName);

	}

	@Override
	protected Integer featureValueOf(String actual) {

		 return actual.length();
	}

}
