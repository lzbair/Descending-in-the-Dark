package io.code.jam;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Finder {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = Files.newBufferedReader(
				FileSystems.getDefault().getPath("resources/D-small-practice.in"), 
				Charset.defaultCharset());
		int cases = parseInt(reader.readLine());

		for (int i = 0; i < cases; i++) {
			String[] layout = reader.readLine().split("\\s");
			int rows = parseInt(layout[0]);
			int columns = parseInt(layout[1]);
			
			Mountain mountain = new Mountain(new Square[rows][columns]);
			while (rows > 0) {
				String[] row  = reader.readLine().split("\\s");
				System.out.println(row);
				rows--;
			}
		}
	}

}
