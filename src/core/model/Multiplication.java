/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.model;

/**
 *
 * @author orlandopalma
 */
public class Multiplication implements IOperation {

    @Override
    public double operate(double a, double b) {
        return a * b;
    }
}
