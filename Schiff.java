import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.shape.*;

public class Schiff extends Spielobjekt
{
    //Attribute
      Image img; 

    //Konstruktor
    public Schiff(double x_,double y_)
    {
        x = x_;
        y = y_;
        vx = 0;
        vy = 0;
        breite = 48;
        hoehe = 48;
        
        img = new Image("schiff.png", true);

    }

    //Methoden
    
    public void nachRechts()
    {
        vx = 3;
    }

    public void nachLinks()
    {
        vx = -3;
    }

    public void update()
    {
        x = x + vx;
    }

    public void stoppen()
    {
        vx = 0;
    }

    void zeichnen(GraphicsContext gc)
    {
        gc.drawImage(img,x, y,breite,hoehe);
    }

}
