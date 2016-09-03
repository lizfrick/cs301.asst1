package edu.up.cs301.campusmap;

import android.graphics.Canvas;

/**
 * Created by frick19 on 9/2/2016.
 */
public class CustomCircleToken extends SimpleMapToken {

    public CustomCircleToken(float xCoord, float yCoord) {
        super(xCoord, yCoord); //using super classes constructor

    }//ctor

    public void drawOn(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
        canvas.drawCircle(x - 20, y - 20, radius / 2, paint);//top left small circle
        canvas.drawCircle(x + 20, y - 20, radius / 2, paint);//bottom left small circle
        canvas.drawCircle(x + 20, y + 20, radius / 2, paint);//bottom right small circle
        canvas.drawCircle(x - 20, y + 20, radius / 2, paint);//top right small circle
    }
}
