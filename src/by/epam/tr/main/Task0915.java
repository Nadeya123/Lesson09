package by.epam.tr.main;

public class Task0915 {

	public static void main(String[] args) {
		int n = 12;
		
		int[][] mas = new int[n][n];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = n--;
					System.out.printf("[%4d]", mas[i][j]);
				}else {
					mas[i][j] = 0;
					System.out.printf("[   0]");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
