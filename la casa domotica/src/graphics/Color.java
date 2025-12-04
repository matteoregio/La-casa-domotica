//HIDE
package graphics;
public class Color
{
    private int red;
    private int green;
    private int blue;

    // Color constants

    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(0, 0, 255);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color LIGHT_GRAY = new Color(192, 192, 192);
    public static final Color GRAY = new Color(128, 128, 128);
    public static final Color DARK_GRAY = new Color(64, 64, 64);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color CYAN = new Color(0, 255, 255);
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color PINK = new Color(255, 175, 175);
    public static final Color ORANGE = new Color(255, 200, 0);
    
    /**
     * Constructs a new Color object.
     * @param red the red value of the color (between 0 and 255)
     * @param green the green value of the color (between 0 and 255)
     * @param blue the blue value of the color (between 0 and 255)
     */
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Gets the red value of this color.
     * @return the red value (between 0 and 255)
     */
    public int getRed()
    {
       return red;
    }

    /**
     * Gets the green value of this color.
     * @return the green value (between 0 and 255)
     */
    public int getGreen()
    {
       return green;
    }

    /**
     * Gets the blue value of this color.
     * @return the blue value (between 0 and 255)
     */
    public int getBlue()
    {
       return blue;
    }

    public Color diminuisciLuminosita()
    {
       float r = getRed();
//        float g = getGreen();
//        float b = getBlue();
//
//        r *= 0.1f;
//        g *= 0.1f;
//        b *= 0.1f;
//
//        if(r >= 255) r = 255;
//        if(g >= 255) g = 255;
//        if(b >= 255) b = 255;
//
//        if(r <= 0) r = 0;
//        if(g <= 0) g = 0;
//        if(b <= 0) b = 0;
//
//
////        setColor(r, g, b);
////        Canvas.getInstance().repaint();

        r -= 25;



        return new Color((int)r, (int)0, (int)0);
    }

    public Color aumentaLuminosita()
    {
        float r = getRed();
        float g = getGreen();
        float b = getBlue();

        r *= 1.1f;
        g *= 1.1f;
        b *= 1.1f;

        if(r >= 255) r = 255;
        if(g >= 255) g = 255;
        if(b >= 255) b = 255;

        if(r <= 0) r = 0;
        if(g <= 0) g = 0;
        if(b <= 0) b = 0;

        return new Color((int)r, (int)g, (int)b);
    }
}
