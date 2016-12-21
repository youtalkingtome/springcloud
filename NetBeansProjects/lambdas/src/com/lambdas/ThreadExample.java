/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambdas;



/**
 *
 * @author vikastaank
 */
public class ThreadExample {
    public static void main(String args[])
    {
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

        
    }
    
}
