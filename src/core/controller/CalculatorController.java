/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controller;

import core.model.IOperation;
import core.model.storage.History;

/**
 *
 * @author orlandopalma
 */
public abstract class CalculatorController implements IOperationController {

    protected IOperation operation;
    protected History history;

    public CalculatorController(IOperation operation, History history) {
        this.operation = operation;
        this.history = history.getInstance();
    }

    public boolean hasMoreThanThreeDecimalPlaces(double number) {
        String[] splitter = Double.toString(number).split("\\.");
        return splitter.length > 1 && splitter[1].length() > 3;
    }


    protected abstract String getOperationSymbol();
}
