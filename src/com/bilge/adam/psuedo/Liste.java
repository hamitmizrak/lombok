package com.bilge.adam.psuedo;

public class Liste {

	public static void main(String[] args) {
		String vocabulary = "RM WRVHVI SZFKGHGZWG AF QVMVI AVRG HVSI";
		int vowelCounter = 0, consonantCounter = 0;

		int distanceAStart = 0, distanceAStop = 0, distanceIStart = 0, distanceIStop = 0;

		String[] vocabularySplitArr = vocabulary.split(""); // asd sad
		// System.out.println(vocabularySplitArr[1]);

		String[] vowel = { "A", "E", "I", "O", "U" }; // sesli
		String[] consonant = { "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "Y", "Z",
				"W", "Q" }; // sessiz

		for (int i = 0; i < vocabularySplitArr.length; i++) {

			for (int j = 0; j < vowel.length; j++) {
				if (vocabularySplitArr[i].equals(vowel[j])) {
					vowelCounter++;
				}
			}

			for (int j = 0; j < consonant.length; j++) {
				if (vocabularySplitArr[i].equals(consonant[j])) {
					consonantCounter++;
				}
			}

			System.out.println(vocabularySplitArr[i]);
			System.out.println(i);
			if (vocabularySplitArr[i].equals("A")) {
				distanceAStart = i;
				final int sabit = i;
				System.out.println("Sabit " + sabit);
				System.out.println(String.valueOf(i));
				distanceAStop = vocabularySplitArr.length - 1;
			}

			if (vocabularySplitArr[i].equals("I")) {
				distanceIStart = i;
				distanceIStop = vocabularySplitArr.length - 1;
			}

		}

		System.out.println("sesli harf sayýsý: " + vowelCounter);
		System.out.println("sessiz harf sayýsý: " + consonantCounter);
		System.out.println("A:  " + distanceAStart + " " + distanceAStop);
		System.out.println("I:  " + distanceIStart + " " + distanceIStop);

	}
}
