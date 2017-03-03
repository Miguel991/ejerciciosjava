package ArrayBidimencional;

import java.util.Random;

public class Bidimencional {

	public static void main(String[] args) {
		
		Random rnd = new Random();

		int[][] bi = new int[4][5];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				bi[i][j] = (int)(rnd.nextDouble() * 100 + 0);

			}

		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.println("array " + i + " " + bi[i][j]+" "); 

			}

		}

	}

}
