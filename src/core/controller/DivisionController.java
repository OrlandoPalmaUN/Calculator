package core.controller;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.model.IOperation;
import core.model.storage.History;

public class DivisionController extends CalculatorController {

    public DivisionController(IOperation operation, History history) {
        super(operation, history);
    }

    public Response calculate(double a, double b) {
        if (hasMoreThanThreeDecimalPlaces(a) || hasMoreThanThreeDecimalPlaces(b)) {
        return new Response("Operands must have at most 3 decimal places.", Status.BAD_REQUEST);
        }
        try {
            if (b == 0) {
                return new Response("MATH ERROR", Status.BAD_REQUEST);
            } else {
                double result = operation.operate(a, b);
                history.addOperation(String.format("%f %s %f = %f", a, getOperationSymbol(), b, String.format("%.3f", result)));
            }
            return new Response("Division calculated succesfully", Status.CREATED);

        } catch (Exception e) {
            return new Response("SYNTAX ERROR", Status.BAD_REQUEST);
        }
    }

    @Override
    protected String getOperationSymbol() {
        return "/";
    }
}
