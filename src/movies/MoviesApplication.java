package movies;

import util.Input;
import java.util.Objects;

import static movies.MoviesArray.findAll;


public class MoviesApplication {


    public static void allMovies() {
        for (Movie movie : movieDb) {
            System.out.println(movie.getName());
        }
    }

    public static void dramaCat() {
        for (Movie movie : movieDb) {
            if (Objects.equals(movie.getCategory(), "drama")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void musicalCat() {
        for (Movie movie : movieDb) {
            if (Objects.equals(movie.getCategory(), "musical")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void sciFiCat() {
        for (Movie movie : movieDb) {
            if (Objects.equals(movie.getCategory(), "scifi")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void horrorCat() {
        for (Movie movie : movieDb) {
            if (Objects.equals(movie.getCategory(), "horror")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void comedyCat() {
        for (Movie movie : movieDb) {
            if (Objects.equals(movie.getCategory(), "comedy")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }


    private static Movie[] movieDb = findAll();

    public static void main(String[] args) {

        Input input = new Input();

        boolean confirm;

        do {

            for (Movie movies : movieDb) {

                String res = input.getString();
                if (res.equalsIgnoreCase("drama")) {
                    dramaCat();
                    break;
                } else if (res.equalsIgnoreCase("musical")) {
                    musicalCat();
                    break;
                } else if (res.equalsIgnoreCase("scifi")) {
                    sciFiCat();
                    break;
                } else if (res.equalsIgnoreCase("horror")) {
                    horrorCat();
                    break;
                } else if (res.equalsIgnoreCase("comedy")) {
                    comedyCat();
                    break;
                } else if(res.equalsIgnoreCase("all")) {
                    allMovies();
                    break;
                }
            }

            System.out.println("continue? y/n");
            String response = input.getString();
            confirm = response.equalsIgnoreCase("y");

        } while (confirm);

    }
}
