package hellotvxlet;

import java.awt.Color;
import java.awt.Image;
import java.util.Timer;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HVisible;


public class HelloTVXlet implements Xlet {

    Image img;
    
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
      HScene scene=HSceneFactory.getInstance().getDefaultHScene();
      
      HStaticText hst=new HStaticText("He llo World",100,100,200,200);
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      img= scene.getToolkit().getImage("image.png");
      Timer t=new Timer();
      MijnTimerTask mtt=new MijnTimerTask();
      t.scheduleAtFixedRate(mtt, 0, 100);
      
      Sprite s=new Sprite(img,0,0,50,50);
      scene.add(s);
      scene.add(hst);
      scene.setVisible(true);
         
      scene.validate();
 
      
     
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}
