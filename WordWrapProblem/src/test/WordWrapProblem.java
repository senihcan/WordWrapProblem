package test;

import java.util.ArrayList;
import java.util.List;

public class WordWrapProblem {

	static void testWordAlgo(String test, int k) {

		String[] tests = test.split(" ");
		int[] testInt = new int[tests.length];
		List<String> conclusions = new ArrayList();
		for (int i = 0; i < tests.length; i++) {

			if (i != tests.length - 1) {
				testInt[i] = tests[i].length() + 1;
			} else {
				testInt[i] = tests[i].length();
			}
		}
		String character = "";
		int total = 0;
		for (int i = 0; i < testInt.length; i++) {

			total += testInt[i];

			if (total <= k + 1) {

				if (character.length() == 0) {
					character = tests[i];
				} else {
					character = character + " " + tests[i];
				}
			} else {
				conclusions.add(character);
				character = tests[i];
				total = testInt[i];
				if (i == tests.length - 1) {
					conclusions.add(character);
				}
			}

		}
		for (String conclusion : conclusions) {
			System.out.println(conclusion);
		}

	}

	public static void main(String[] args) {
		String test = "Buralara yaz günü kar yaðýyor caným Ölene kadar seni bekleyemem ona buna benzemem oyuna gelmem senin için ölmeye söz veremem";

		int M = 15;
		testWordAlgo(test, M);
	}

}
