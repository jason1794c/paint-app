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

public class ClearButton extends JButton implements MouseListener {
    Canvas canvas;
    
    public ClearButton(Canvas canvas) {
        super("Clear");
        this.canvas = canvas;
        this.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        this.canvas.clear = true;
        this.canvas.x = null;
        this.canvas.y = null;
        this.canvas.repaint();
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
