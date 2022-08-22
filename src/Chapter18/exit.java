package Chapter18;

import java.util.Scanner;

public class exit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			String line = sc.nextLine();

			if (line.equals("exit")) {
				System.out.print(sb);

				break;
			}

			sb.append(line);

		}
		sc.close();
	}

}
