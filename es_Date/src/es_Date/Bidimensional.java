package es_Date;

import java.util.Arrays;

public class Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] arr1 = {
				{"ciao", "amico"},
				{"hi", "firends"},
				{"hola", "amigo"},
		};
		
		System.out.println(arr1[2] [1]);
		System.out.println(Arrays.toString(arr1[0]));
		
		arr1[0] = new String[3];
		arr1[0][1] = "buongiorno";
		arr1[0][2] = "buonasera";
	}
}
