/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintapp;

/**
 *
 * @author Jchui
 */
import javax.swing.*;

public class App extends JFrame {

    public App() {
        super("Paint App");

        // Creating Canvas
        Canvas canvas = new Canvas();
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(canvas);
        setLocationRelativeTo(null); // Opens application in the middle of the screen
        setVisible(true);
    }
}
