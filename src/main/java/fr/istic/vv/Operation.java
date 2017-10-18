package fr.istic.vv;

public interface Operation {

    /**
     * Makes the operation between operands op1 and op2
     * @param op1
     * @param op2
     * @return the operation result
     * @throws OperationException
     */
    double execute(double op1,double op2) throws OperationException;
}
