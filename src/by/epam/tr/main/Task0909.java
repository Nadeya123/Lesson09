package by.epam.tr.main;

import java.util.Random;

public class Task0909 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
			System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(i == j) {
					System.out.printf("[%4d]", mas[i][j]);
				}else {
					System.out.printf("[    ]");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
