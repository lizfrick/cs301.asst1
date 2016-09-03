package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random; //for random colors

/**
 * <!-- class SimpleMapToken -->
 *
 * This class represents a single map token that can be drawn on a canvas
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Liz Frick
 * @version August 2015
 */
public class SimpleMapToken {

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //my color

    /**
     * Constructor
     */
    public SimpleMapToken(float xCoord, float yCoord) {
        // initialize the instance variables
        x = xCoord;
        y = yCoord;
        radius = 15;
        paint = new Paint();
        //randomize colors
        Random rand = new Random();//gives random values
        paint.setARGB(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

    }//ctor

    /**
     * this token can paint itself on a given canvas
     */
    public void drawOn(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
        //draw square instead of circle

    }//drawOn

}//class SimpleMapToken
