package CinemaSystem;

import javax.swing.*;
import java.awt.*;

/**
 * A class that houses the code responsible for the CinemaScreenings JFrame
 */
public class CinemaScreenings extends JFrame {
        JButton SelectButton;
        JLabel InfoLabel, MovieList;
        JTextArea ScreenSelector;

    /**
     * This creates a Label displaying a short message as well as
     * Creating a select button and a JTextArea
     */
    public CinemaScreenings() {
            setLayout(new FlowLayout());
            InfoLabel = new JLabel("Please enter the movie you wish to view into the text box below.");
            add(InfoLabel);
            SelectButton = new JButton("Select");
            add (SelectButton);

            ScreenSelector = new JTextArea(1,10);
            add (ScreenSelector);

            MovieList = new JLabel("MOVIE LIST");
            add(MovieList);
        }
    }
