/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supernova;

/**
 *
 * @author vikastaank
 */
public class Apple {

    public Apple(int i) {
    }

    Object getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static boolean isGreenApple(Apple apple)
    {
        return "green".equals(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple)
    {
        return apple.getWeight()>150;
    }
}
