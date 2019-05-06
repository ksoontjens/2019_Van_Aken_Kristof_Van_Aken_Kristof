/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Image;
import org.havi.ui.HComponent;
import org.havi.ui.HIcon;

/**
 *
 * @author Kristof
 */
public class Sprite extends HIcon implements Leefbaar {
int x;
int y;

public  Sprite(Image i, int x1, int y1, int w, int h)
{
    super(i,x1,y1,w,h);
}

    public void leef() {
     this.setBounds(x, y, 50, 50);
    }

}
