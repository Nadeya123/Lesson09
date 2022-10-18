package by.epam.tr.main;

import java.util.Random;

public class Task0911 {

	public static void main(String[] args) {
		int[][] mas = new int[9][11];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j <mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
				if(rand.nextInt(1000) % 3 == 0) {
					mas[i][j] = -mas[i][j];
				}
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
					System.out.printf("[%4d]", mas[i][j]);
				}
				System.out.println();
				i++;
				if (i >= mas.length) {
					break;
				}
				for (int j = mas[i].length - 1; j >=0; j--) {
					System.out.printf("[%4d]", mas[i][j]);
				}
				System.out.println();
			}
			System.out.println();

	}
		
		
}

