import java.util.Scanner;

public class Harvester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Geben sie bitte die Anzahl der Spalten und die Anzahl der Reihen an! (<Reihe> <Spalte>)");
		String a = s.nextLine();
		String words[] = a.split(" ");

		int reihen = Integer.parseInt(words[0]);
		int spalten = Integer.parseInt(words[1]);
		int reihestart = Integer.parseInt(words[2]);
		int spaltestart = Integer.parseInt(words[3]);
		int[][] feld = new int[reihen][spalten];

		System.out.println("=====================================");
		for (int rh = 0; rh < reihen; rh++) {
			for (int sp = 0; sp < spalten; sp++) {
				System.out.print((sp + 1 + spalten * rh) + " ");
				feld[rh][sp] = sp + 1 + spalten * rh;
			}
			System.out.println();
		}
		System.out.println("=====================================");
		System.out.println();

		// logik
		
		
	if (reihestart!=1) {
		for (int i = reihestart-1; i <= reihen; i--) {
			if ((i % 2) == 1) {
				for (int as = 0; as < spalten; as++) {
					System.out.print((feld[i][as]) + " ");
				}
			} else if ((i % 2) == 0) {
				for (int sa = spalten+1; sa >= 0; sa--) {
					System.out.print((feld[i][sa]) + " ");
				}
			}
		}
	}		
		if (spaltestart == 1) {
			for (int i = 0; i < reihen; i++) {
				if ((i % 2) == 0) {
					for (int as = 0; as < spalten; as++) {
						System.out.print((feld[i][as]) + " ");
					}
				} else if ((i % 2) == 1) {
					for (int sa = spalten - 1; sa >= 0; sa--) {
						System.out.print((feld[i][sa]) + " ");
					}
				}
			}
		}
		for (int i = reihestart-1; i < reihen; i++) {
			if ((i % 2) == 1) {
				for (int as = 0; as < spalten; as++) {
					System.out.print((feld[i][as]) + " ");
				}
			} else if ((i % 2) == 0) {
				for (int sa = spalten - 1; sa >= 0; sa--) {
					System.out.print((feld[i][sa]) + " ");
				}

			}

		}
	}
}
