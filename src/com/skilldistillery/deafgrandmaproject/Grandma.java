package com.skilldistillery.deafgrandmaproject;

public class Grandma {
	// Field

	// Methods
	// Describes the response from Grandma
	public String speakTo(String youSay) {

		String uc = youSay.toUpperCase();
		String output = " ";

		if (youSay.equals("GOODBYE")) {
			output = farewellResponse();
			System.out.println(output);
			output = youSay;

		} else if (uc.equals(youSay)) {
			output = positiveRandomResponse();
		}

		else if (!uc.equals(youSay)) {
			output = negativeRandomResponse();
		}

		return output;

	}

	public String positiveRandomResponse() {
		String response = " ";
		String[] positiveResponseArray = { "HELLO SON!", "HOW ARE YOU TODAY!", "HAVE A WONDERFUL DAY",
				"WOULD YOU LIKE SOMETHING TO EAT!", " YOU ARE WONDERFUL", " BLESS YOU ALWAYS!" };
		for (int i = 0; i < positiveResponseArray.length; i++) {

			int positiveRandomIndex = (int) (Math.random() * positiveResponseArray.length);
			response = positiveResponseArray[positiveRandomIndex];
		}
		return response;
	}

	public String negativeRandomResponse() {
		String response = " ";
		String[] negativeResponseArray = { "You are a bad guy!", "Get away from me", "Why are you here.",
				"I will call the Police!", "You are a terrible person", "Done come near me!" };

		for (int i = 0; i < negativeResponseArray.length; i++) {

			int negativeRandomIndex = (int) (Math.random() * negativeResponseArray.length);
			response = negativeResponseArray[negativeRandomIndex];
		}
		return response;
	}

	public String farewellResponse() {
		String response = " ";
		String[] farewellArray = { "BYE BYE", "TATA", "SAYONARA!", "NAMASTE", "SEE YOU AGAIN" };

		for (int i = 0; i < farewellArray.length; i++) {

			int farewellRandomIndex = (int) (Math.random() * farewellArray.length);
			response = farewellArray[farewellRandomIndex];
		}

		return response;
	}

}
