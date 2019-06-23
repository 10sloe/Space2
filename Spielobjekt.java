public class Spielobjekt
{
    //Attribute
    double x;
    double y;
    double vx;
    double vy;

    double breite;
    double hoehe;

    //Methoden
    void setPosition(double x_, double y_)
    {
        x = x_;
        y = y_;
    }

    void setVy(double vy_)
    {
        vy = vy_;
    }
    
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getBreite()
    {
        return breite;
    }


}