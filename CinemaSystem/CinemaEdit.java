package CinemaSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the CinemaEditWindow.
 * Through this window you can select which action you would like to perform
 * to edit the system
 */
public class CinemaEdit extends JFrame {
    JButton AddButton, EditButton, RemoveButton;
    JLabel InfoLabel;

    /**
     *A class that holds a JLabel and some JButtons
     */
    public CinemaEdit() {
            setLayout(new FlowLayout());
            InfoLabel = new JLabel("Please select which action you would like to preform");
            add(InfoLabel);

        /**
         * A button that takes the user to the CinemaAddScreen JFrame
         */
        AddButton = new JButton("Add Screen");
            add(AddButton);

            AddButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CinemaAddScreen AddScreen = new CinemaAddScreen();
                    AddScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    AddScreen.setSize(400, 200);
                    AddScreen.setVisible(true);

                }
            });

            EditButton = new JButton("Edit Existing Screen");
            add(EditButton);


            RemoveButton = new JButton("Remove Screen");
            add(RemoveButton);


        }
}