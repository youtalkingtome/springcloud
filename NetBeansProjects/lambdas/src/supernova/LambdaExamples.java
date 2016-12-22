/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supernova;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author vikastaank
 */
public class LambdaExamples {
    
    public static List<Apple> filterGreenApples(List<Apple> inventory)
    {
        List<Apple> result=new ArrayList<>();
        for(Apple apple: inventory)
        {
            if("green".equals(apple.getColor()))
            {
                result.add(apple);
            }
        
            
    }
    return result;
  }
    public static List<Apple> fiterHeavyApples(List<Apple> inventory)
            {
        List<Apple> result=new ArrayList<>();
        for(Apple apple: inventory)
        {
            if(apple.getWeight()>150)
            {
                result.add(apple);
            }
        
            
    }
    return result;
  }
    public static boolean isGreenApple(Apple apple)
    {
        return "green".equals(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple)
    {
        return apple.getWeight()>150;
    }
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p)
    {
        List<Apple> result=new ArrayList<>();
        for(Apple apple: inventory)
        {
            if(p.test(apple))
            {
                result.add(apple);
            }
        }
        return result;
    }
    
    public static void main(String args[])
    {
        List<Apple> inventory=new ArrayList<Apple>();
        filterApples(inventory, Apple::isGreenApple);
        filterApples(inventory, Apple::isHeavyApple);

    }
}
