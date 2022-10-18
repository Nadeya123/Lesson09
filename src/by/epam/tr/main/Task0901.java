package by.epam.tr.main;

public class Task0901 {

	public static void main(String[] args) {
		int[][] mas = new int[3][4];
		
		int[] line01 = {1, 0, 0, 0};
		int[] line02 = {0, 1, 0, 0};
		int[] line03 = {0, 0, 1, 0};
		
		mas[0] = line01;
		mas[1] = line02;
		mas[2]  =line03;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}

}
