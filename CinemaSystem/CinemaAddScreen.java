package CinemaSystem;

import javax.swing.*;
import java.util.ArrayList;

/**
 * A class that holds the code for related to the CinemaAddScreen JFrame
 */

public class CinemaAddScreen extends JFrame {


    /**
     * This class creates an array for
     * holding and creating ArrayList items
     */
    public class MovieArray {
        private String name;
        private double price;

        public MovieArray(String name, double price) {
            setName(name);
            setPrice(price);
        }

        /**
         * Method to get the name of a movie object
         * @return a String value that specifies the name of a movie object
         */
        public String getName() {
            return name;
        }

        /**
         * Method to set the name of a movie object
         * @param name the name of a movie object
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Method to get the price of a movie object
         * @return a double value that specifies the price of a movie object
         */
        public double getPrice() {
            return price;
        }

        /**
         * Method to set the price of a movie object
         * @param price the price of a movie object
         */
        public void setPrice(double price) {
            this.price = price;

        }

    }

    /**
     * A class that houses a for loop that initiates 10 times.
     */
    public CinemaAddScreen() {

        /**
         * A for loop that creates 10 movie objects and
         * takes in a name and price value for each of them
         */
        for(int i=0; i<=9;i++)

        {


            String name = JOptionPane.showInputDialog("NAME");
            double price = Double.parseDouble(JOptionPane.showInputDialog("PRICE"));

            ArrayList<MovieArray> MovieList = new ArrayList<MovieArray>();
            MovieArray Movie = new MovieArray (name, price);

            /**
             * Sets Movie object to position i in the MovieList Array
             */
            MovieList.set(i,Movie);





           // for (int e = 0; e < MovieList.size(); i++) {
             //   MovieCounter[e] = MovieList.get(i).getName();

          //  System.out.println(MovieList.get(0).name);
          //  System.out.println(MovieList.get(0).price);
            }
        }
     //   Iterator iterator = MovieList.iterator();
     //   while(iterator.hasNext()){
       //     JOptionPane.showMessageDialog(null,iterator.next(),"Title",JOptionPane.INFORMATION_MESSAGE);

}




