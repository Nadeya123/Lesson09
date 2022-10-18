package by.epam.tr.main;

import java.util.Random;

public class Task0905 {

	public static void main(String[] args) {
		int[][] mas = new int [7][3];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
			System.out.println();
			System.out.println("an even line > ");
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("[%4d]", mas[i][j]);
				}
				System.out.println();
			}
			System.out.println("not an even line");
		}
	}

}
