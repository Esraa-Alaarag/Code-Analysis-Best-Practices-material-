package nurseryRhymes;

import java.io.*;
//In order to have access to these classes in the ‘Main’ class we have to import them. 
import nurseryRhymes.oldMacdonald.*;
/*
 * So create a new package and name it “nurseryRhymes”. 
 * Within that package, create a new class and name it “Main”.
 *  Copy and paste the above program into the Main class. 
 */
public class Main {
	
	public static void main(String[] args) {
		//rename variable ‘x’ to ‘input’
		InputStreamReader input = new InputStreamReader(System.in);
		// rename variable ‘y’ to ‘newInput’
		BufferedReader newInput = new BufferedReader(input); 
		//rename class ‘A’ to class ‘Song’using the refactor tool select/highlight the variable/class/method
		//you want to rename Then click the ‘Refactor’ tab and select ‘Rename’ from the drop down options
		Song.songIntro();
		
		do {
			try {
				//rename variable ‘z’ to ‘animal’
				String animal = newInput.readLine().toLowerCase();
				new Song(animal);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
		
	}
		
}