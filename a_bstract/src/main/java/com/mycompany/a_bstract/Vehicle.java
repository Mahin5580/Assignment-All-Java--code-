/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a_bstract;

/**
 *
 * @author Asus
 */
public abstract class Vehicle {
   
public abstract void move ();
public void carry(){
    System.out.println("Load");
}
 public  Vehicle(){
        System.out.println("Bus and Boat");
    }
    
}