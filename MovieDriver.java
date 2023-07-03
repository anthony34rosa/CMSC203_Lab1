import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		// Scanner object to read user input
		Scanner keyboard = new Scanner(System.in);
		String choice;

		// new movie object
		do {
			Movie movie = new Movie();

			// user enter title of movie
			System.out.print("Enter the name of a movie\n");
			String title = keyboard.nextLine();

			// Set title in movie object
			movie.setTitle(title);

			// user enter movie's rating
			System.out.print("Enter the rating of the movie\n");
			String rating = keyboard.nextLine();

			// Set the rating in the movie object
			movie.setRating(rating);

			// user enters number of tickets sold
			System.out.print("Enter the number of tickets sold for this movie\n");
			int soldTickets = keyboard.nextInt();

			// Set number of tickets sold in the movie object
			movie.setSoldTickets(soldTickets);

			// Print to screen the information using toString method
			System.out.println(movie.toString() + "\nDo you want to enter another? (y or n)");
			choice = keyboard.next();
			keyboard.nextLine();
		} while (choice.equalsIgnoreCase("y"));
		
		//print to screen goodbye message 
		System.out.println("Goodbye");
		// close keyboard object 
		keyboard.close();
	}
}
