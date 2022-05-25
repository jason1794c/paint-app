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
import javax.swing.*;

public class ColorButton extends JButton implements MouseListener {

    Canvas canvas;
    Color color;
    String colorName;

    public ColorButton(Canvas canvas, Color color, String colorName) {
        super(colorName);
        this.canvas = canvas;
        this.color = color;
        this.colorName = colorName;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.colorName.equals("Black")) {
            this.canvas.currentColor = 0;
        } else if (this.colorName.equals("Blue")) {
            this.canvas.currentColor = 1;
        } else if (this.colorName.equals("Cyan")) {
            this.canvas.currentColor = 2;
        } else if (this.colorName.equals("Dark Gray")) {
            this.canvas.currentColor = 3;
        } else if (this.colorName.equals("Gray")) {
            this.canvas.currentColor = 4;
        } else if (this.colorName.equals("Green")) {
            this.canvas.currentColor = 5;
        } else if (this.colorName.equals("Light Gray")) {
            this.canvas.currentColor = 6;
        } else if (this.colorName.equals("Magenta")) {
            this.canvas.currentColor = 7;
        } else if (this.colorName.equals("Orange")) {
            this.canvas.currentColor = 8;
        } else if (this.colorName.equals("Pink")) {
            this.canvas.currentColor = 9;
        } else if (this.colorName.equals("Red")) {
            this.canvas.currentColor = 10;
        } else if (this.colorName.equals("White")) {
            this.canvas.currentColor = 11;
        } else if (this.colorName.equals("Yellow")) {
            this.canvas.currentColor = 12;
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
