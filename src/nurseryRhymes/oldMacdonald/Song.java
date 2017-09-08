package nurseryRhymes.oldMacdonald;
//create new class and name it song
//Cut and paste everything in the class ‘Song’ from the Main class into this new class ‘Song’
//To make this class visible to other packages go ahead and make the class public
public class Song {
	private String animalSound;
	public static boolean hasAnimal = false;
	//Locate the songIntro() method and delete the intro() method call. 
	public static final void songIntro () {
		System.out.println("Old MacDonald had a farm");
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("And on that farm he had a ...");
		pause();
		System.out.println("Enter an animal to see if its on Mr. MacDonald's farm:");
	}
//extract try/catch block of code into a method called ‘pause’ and replaced the additional try/catch blocks with invocations of that method. 
	private static void pause() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Song (String animal) {
		//remove that while infinite loop and remove the Boolean newAnimal declaration as well. 

		//replace the ‘==’ with equals(). 
		if(animal.equals("chicken")) {
			hasAnimal = true;
			animalSound = Chicken.cluck();
			printSong(animal, animalSound);
		} else {
			System.out.println("Sorry, Mr. Macdonald is out of " + animal + "s \n"
					+ "Try another animal...");
		}
	}
	
	void printSong (String animal, String animalSound) {
		
		System.out.println("Nice!!! He does have " + animal + "s");
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("with a " + animalSound + " " + animalSound + " here...");
		pause();
		System.out.println(" and a " + animalSound + " " + animalSound + " there...");
		pause();
		System.out.println("  here a " + animalSound + " there a " + animalSound);
		pause();
		System.out.println("   everywhere a "  + animalSound + " " + animalSound + "!!!!!!");
		pause();
		System.out.println("    Old MacDonald had a farm");
		pause();
		System.out.println("     E - I - E - I - OoooOoOooo ");
	}
	
	private static void intro() {
		do{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
	}
}