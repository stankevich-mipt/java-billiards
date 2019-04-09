/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import View.TableGraphicProperties;
import java.util.ArrayList;

/**
 *
 * @author andrey
 */
public class Table extends GameObject {
    
    ArrayList<Pocket> pocket_list;
    LeftBoard lb; //Left border
    RightBoard rb; //Right border
    TopBoard tb; // Top border
    BottomBoard bb; // Bottom border
    TableGraphicProperties drawer;
    
    Table() {
        super(0, 0);
        pocket_list = new ArrayList<Pocket>();
        pocket_list.add(new Pocket(0, 0));
        pocket_list.add(new Pocket(max_width/2, 0));
        pocket_list.add(new Pocket(max_width, 0));
        pocket_list.add(new Pocket(0, max_height));
        pocket_list.add(new Pocket(max_width/2, max_height));
        pocket_list.add(new Pocket(max_width, max_height));
        lb = new LeftBoard();
        rb = new RightBoard();
        tb = new TopBoard();
        bb = new BottomBoard();
    }
   
    public void addGraphicProperties(TableGraphicProperties d) {
        drawer = d;
    }

    @Override
    boolean interactionCheck(CueBall b) {
        return false;
    }
    
}
