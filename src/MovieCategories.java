import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ny Derry on 7/9/2017.
 * Bonus8
 */
public class MovieCategories {
    public static void main(String[] args) {
        // constructor to craate an object which contain elements (title and category)
            Movie movie1 = new Movie("Cloud 9", "scifi");
            Movie movie2 = new Movie("Inception", "scifi");
            Movie movie3 = new Movie("Beauty and the Beast", "animated");
            Movie movie4 = new Movie("Mulan", "animated");
            Movie movie5 = new Movie("The Notebook", "drama");
            Movie movie6 = new Movie("Titanic", "drama");
            Movie movie7 = new Movie("Nightmare on Elmstreet", "horror");
            Movie movie8 = new Movie("Carrie", "horror");
            Movie movie9 = new Movie("Dumbo", "animated");
            Movie movie10 = new Movie("The Color Purple", "drama");

            Movie[] list = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
            ArrayList<Movie> listMovies = new ArrayList<>();
            listMovies.addAll(Arrays.asList(list));// using addAll method to populate title and category



            Scanner scnr = new Scanner(System.in);
            String userInput = " ";
            System.out.println("Welcome to the Movie List Application!\n");
            System.out.println("There are 10 movies in this list.");
            
            String contin1 = "y";

            while (contin1.equalsIgnoreCase("y")) {
                System.out.print("What category are you interested in? (Pick from: 'animated', 'drama', 'horror', 'scifi')");
                
                //data validation
                userInput = scnr.nextLine();
                while (userInput.matches("\\d+")) {//when user input any digit this will print out
                    System.out.println("Choose from the available categories");
                    userInput = scnr.nextLine();
                }
                while (!(userInput.equalsIgnoreCase("animated") || userInput.equalsIgnoreCase("drama") || userInput.equalsIgnoreCase("horror") || userInput.equalsIgnoreCase("scifi"))) {
                    System.out.println("Choose from the available categories"); // user input in letters
                    userInput = scnr.nextLine();
                }
                for (Movie movie : listMovies) {//a way(format) to evaluate every element in the array
                    if (movie.getCategory().equals(userInput)) {
                        System.out.println(movie.getTitle());
                    }
                }
                System.out.print("\nContinue? (y/n)");
                contin1 = scnr.nextLine();
            }
            if (contin1.equalsIgnoreCase("n")) {//can be capital Y / N
                System.out.println("Thank for choosing the Movie List Application!");
            }

        }
    }


