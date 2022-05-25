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
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Canvas extends JPanel implements MouseMotionListener, KeyListener {

    int circleWidth, circleHeight, currentColor;
    Integer x, y;
    Color[] colors;
    String[] colorNames;
    SizeButton increaseBtnSize;
    SizeButton decreaseBtnSize;
    ClearButton clearBtn;
    boolean clear;
    
    public Canvas() {
        this.circleWidth = 5;
        this.circleHeight = 5;
        this.x = null;
        this.y = null;
        this.clear = false;
        this.colors = new Color[]{
            Color.black,
            Color.blue,
            Color.cyan,
            Color.darkGray,
            Color.gray,
            Color.green,
            Color.lightGray,
            Color.magenta,
            Color.orange,
            Color.pink,
            Color.red,
            Color.white,
            Color.yellow
        };
        this.colorNames = new String[]{
            "Black",
            "Blue",
            "Cyan",
            "Dark Gray",
            "Gray",
            "Green",
            "Light Gray",
            "Magenta",
            "Orange",
            "Pink",
            "Red",
            "White",
            "Yellow"
        };
        this.currentColor = 0; // Setting default color to black
        this.increaseBtnSize = new SizeButton(this, "Increase");
        this.decreaseBtnSize = new SizeButton(this, "Decrease");
        this.clearBtn = new ClearButton(this);
        
        // Adding color buttons
        for (int i = 0; i < this.colors.length; i++) {
            ColorButton colorBtn = new ColorButton(this, colors[i], colorNames[i]);
            this.add(colorBtn);
        }
        this.add(increaseBtnSize);
        this.add(decreaseBtnSize);
        this.add(clearBtn);
        
        this.addMouseMotionListener(this); // Adding mouse motion listener
        this.addKeyListener(this); // Adding key listener
        this.setFocusable(true);
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        
        // Clearing graphics
        if (this.clear) {
            super.paintComponent(g);
            this.clear = false;
        }
        
        Graphics2D g2D = (Graphics2D) g;

        this.requestFocus(); // This method requests for focus once the user clicks on any of the buttons

        // Setting the colors
        g2D.setColor(colors[currentColor]);

        // Circle isn't drawn on the screen until the user starts drawing
        if (this.x != null && this.y != null) {
            g2D.fillOval(this.x - (this.circleWidth / 2), this.y - (this.circleHeight / 2), this.circleWidth, this.circleHeight);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
        this.setFocusable(true);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.circleWidth += 5;
            this.circleHeight += 5;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && this.circleWidth > 5 && this.circleHeight > 5) {
            this.circleWidth -= 5;
            this.circleHeight -= 5;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (this.currentColor == 0) {
                this.currentColor = this.colors.length - 1;
            } else {
                this.currentColor -= 1;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (this.currentColor == this.colors.length - 1) {
                this.currentColor = 0;
            } else {
                this.currentColor += 1;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.x = null;
            this.y = null;
            this.clear = true;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
