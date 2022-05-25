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

public class SizeButton extends JButton implements MouseListener {

    String buttonType; // Increase or Decrease
    Canvas canvas;

    public SizeButton(Canvas canvas, String type) {
        super(type + " Brush Size");
        this.buttonType = type;
        this.canvas = canvas;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        if (this.buttonType.equals("Increase")) {
            this.canvas.circleWidth += 5;
            this.canvas.circleHeight += 5;
        } else if (this.buttonType.equals("Decrease") && this.canvas.circleWidth > 5 && this.canvas.circleHeight > 5) {
            this.canvas.circleWidth -= 5;
            this.canvas.circleHeight -= 5;
        }
        
        this.canvas.setFocusable(true);
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

}
