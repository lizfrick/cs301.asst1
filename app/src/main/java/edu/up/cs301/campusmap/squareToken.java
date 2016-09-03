package edu.up.cs301.campusmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;


/**
 * Created by frick19 on 9/2/2016.
 */
public class squareToken extends SimpleMapToken  {

    public squareToken(float xCoord, float yCoord) {
        super(xCoord, yCoord); //using super classes constructor

    }//ctor

    /**
     * this token can paint itself on a given canvas
     */
    public void drawOn(Canvas canvas) {
        canvas.drawRect(x - radius, y-radius, x+radius, y+radius, paint);
        //draw square instead of circle

    }//drawOn

}
