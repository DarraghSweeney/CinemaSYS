package CinemaSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * CinemaIntro is the first JFrame
 * Housing a few buttons that lead onto more JFrames
 */
public class CinemaIntro extends JFrame{
        JButton ExitButton, ScreensButton, EditScreensButton, EditSnacksButton;
        JLabel InfoLabel;

        /**
        Here the CinemaIntro window is created
        setLayout gives a layout to the JFrame
         */
        public CinemaIntro() {
            setLayout(new FlowLayout());
            /**
            The JLabel allows a message to be displayed in the JFrame
             */
            InfoLabel = new JLabel("Welcome to CinemaSYS," +
                                    " what action would you like to perform");
            add(InfoLabel);
            /**
            This adds a button that brings the user to
            the CinemaEdit JFrame
             */
            EditScreensButton = new JButton("Edit Screens");
            add(EditScreensButton);

            EditScreensButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CinemaEdit ScreenEdit = new CinemaEdit();
                    ScreenEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ScreenEdit.setSize(400,200);
                    ScreenEdit.setVisible(true);


                }
            });
             /**
            This adds a button that brings the user to
            the CinemaSnackEdit JFrame
             */
            EditSnacksButton = new JButton("Edit Snacks ");
            add(EditSnacksButton);

            EditSnacksButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CinemaSnackEdit SnackEditor = new CinemaSnackEdit();
                    SnackEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    SnackEditor.setSize(400,200);
                    SnackEditor.setVisible(true);


                }
            });
             /**
            This adds a button that brings the user to
            the CinemaScreenings JFrame
             */
            ScreensButton = new JButton("Screenings");
            add(ScreensButton);

            ScreensButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CinemaScreenings Screens = new CinemaScreenings();
                    Screens.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    Screens.setSize(400,200);
                    Screens.setVisible(true);

                }
            });
            /**
            This Button Shuts down the program upon the
            user exiting the software
             */
            ExitButton = new JButton("Exit");
            add(ExitButton);

            ExitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);

                }
            });
}
}