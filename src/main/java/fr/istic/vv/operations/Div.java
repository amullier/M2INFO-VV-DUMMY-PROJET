package fr.istic.vv.operations;


import fr.istic.vv.Operation;
import fr.istic.vv.OperationException;

public class Div implements Operation {
    /**
     * Makes the division between operands op1 and op2
     *
     * @param op1
     * @param op2
     * @return the division result
     * @throws OperationException if op2 is equals to zero
     */
    @Override
    public double execute(double op1, double op2) throws OperationException {
        if(op2==0){
            throw new OperationException("The operand 2 can't be equals to zero for the division");
        }
        return op1/op2;
    }
}
