package by.epam.tr.main;

import java.util.Random;

public class Task0903 {

	public static void main(String[] args) {
		int[][] mas = new int[5][7];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("First column > ");
		for (int i = 0; i <mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][0]);
		}
		
		System.out.println();
		System.out.println("Last column > ");
		for(int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][6]);
		}
		System.out.println();
	}

}
