package labb4_ETSN20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchInFile {

	public static void main(String args[]) throws FileNotFoundException{
		
		SearchInFile search = new SearchInFile();
		search.searchLines(args[0], args[1]);

	}

	public void searchLines(String pattern, String fileName) throws FileNotFoundException{


		//läs filen
		File file = new File ("fileName");
		Scanner scan = new Scanner(file); //läs från filen(om filen inte finns, throw exception)

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if(line.contains(pattern)) {
				System.out.println("Pattern found at line: " + line);
			}
		}
		//adding comment

		scan.close();
	}

}
