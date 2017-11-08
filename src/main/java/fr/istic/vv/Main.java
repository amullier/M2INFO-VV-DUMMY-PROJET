package fr.istic.vv;

import fr.istic.vv.operations.Div;
import fr.istic.vv.operations.Minus;
import fr.istic.vv.operations.Plus;
import fr.istic.vv.operations.Times;

/**
 * Classes instantiation
 */
public class Main {

    public static void main( String[] args )
    {
        Operation division = new Div();
        Operation addition = new Plus();
        Operation multiplication = new Times();
        Operation subtraction = new Minus();
    }

}
