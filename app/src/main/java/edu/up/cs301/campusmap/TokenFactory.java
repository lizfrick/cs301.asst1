package edu.up.cs301.campusmap;

/**
 * <!-- class TokenFactory -->
 *
 * This class is used to create map tokens.
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Liz Frick
 * @version August 2015
 */

public class TokenFactory {
    /**
     * createMapToken
     *
     * creates a new object whose type is SimpleMapToken or some subclass
     * thereof and returns it to the caller
     *
     * @arg x x-coordinate of the token
     * @arg y y-coordinate of the token
     * @arg type which type of token to draw (0, 1 or 2)
     */
    public static SimpleMapToken createMapToken(float x, float y, int type)
    {
        //For now, only one type of map token exists
        switch(type)
        {
            case 0://circle tokens
                return new SimpleMapToken(x,y);
            case 1://square tokens
                return new squareToken(x,y);
            case 2:
                return new CustomCircleToken(x,y);
            default:
                return new SimpleMapToken(x,y);
        }
    }//createMapToken

}//class TokenFactory
