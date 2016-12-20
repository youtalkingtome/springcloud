
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikastaank
 */
public class ListIteration {
    
    public static void main(String args[])
    {
        
    List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
// Even better use Method reference feature of Java 8 // method reference is denoted by :: (double colon) operator // looks similar to score resolution operator of C++ features.forEach(System.out::println);

    }
    
}
