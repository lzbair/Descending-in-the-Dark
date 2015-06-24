package io.code.jam;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Finder {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = Files.newBufferedReader(FileSystems
				.getDefault().getPath("resources/D-small-practice.in"), Charset
				.defaultCharset());
		int cases = parseInt(reader.readLine());

		for (int i = 1; i <= cases; i++) {
			System.out.println("Case #" + i + ":");
			String[] layout = reader.readLine().split("\\s");
			int rows = parseInt(layout[0]);
			int columns = parseInt(layout[1]);

			Square[][] squares = new Square[rows][columns];
			for (int j = 0; j < rows; j++) {
				char[] row = reader.readLine().toCharArray();
				for (int k = 0; k < columns; k++) {
					squares[j][k] = new Square(row[k]);
				}
			}
			
			for (int j = 0; j < rows; j++) {
				StringBuilder printer = new StringBuilder();
				for (int k = 0; k < columns; k++) {
					printer.append(squares[j][k]);
				}
				System.out.println(printer.toString());
			}
			//Mountain mountain = new Mountain(squares);
		}
	}

}
