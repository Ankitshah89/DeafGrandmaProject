package com.skilldistillery.deafgrandmaproject;

import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		Grandma gma = new Grandma();

		while (true) {

			System.out.print("Say something!");
			String answer = kb.next();

			String output = gma.speakTo(answer);
			if (output.equals("GOODBYE")) {
				System.exit(0);
			}
			System.out.println(output);

		}

	}

}
