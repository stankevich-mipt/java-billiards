/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Button;
import java.awt.event.MouseListener;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameButton extends Button {
        
    public GameButton(MouseListener l, String label) {
        super(label);
        this.setFont(new Font("Ubuntu",Font.PLAIN, 35));
        addMouseListener(l);
        setVisible(true);
    }

    public void update() {
        Graphics g = this.getGraphics();
        Rectangle bds = this.getBounds();
        System.out.println(bds);
        g.drawRect(bds.x, bds.y, bds.width, bds.height);
        
    }
    
}
