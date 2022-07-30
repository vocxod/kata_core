/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.odybo.universal;


/**
 *
 * @author vragos
 */
public class CarDriver {

    public static final class Car implements AutoCloseable{

        @Override
        public void close() {
            try {
                System.out.println("Машина закрывается...");
            } catch (RuntimeException re) {
                // need press this exception    
                // System.out.println("runtime exception");
            }
        }

        public void drive() {
            System.out.println("Машина поехала.");
        }
        
        public void makeNullPointer() {
            Object o = null;
            o.equals(0);//NullPointerException
        }
    }

    public static void main(String[] args) {
        try ( Car car = new Car()) {
        } catch (Exception e) {
            // System.out.println("runtime exception");
        }
    }
}

