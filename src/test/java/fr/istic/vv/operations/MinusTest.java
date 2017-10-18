package fr.istic.vv.operations;

import fr.istic.vv.Operation;
import fr.istic.vv.OperationException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class MinusTest {

    Operation minus;

    private static Logger logger = Logger.getGlobal();

    @Before
    public void setUp(){
        minus = new Minus();
    }

    @After
    public void tearDown(){
        minus = null;
    }

    @Test
    public void samePositiveOperandEqualsZero(){
        int op = 52;
        try {
            double res = minus.execute(op,op);
            if(res != 0){
                logger.warning("Operation "+op+"-"+op);
                fail("X-X doit etre egal a 0");
            }
            else{
                assertTrue(true);
            }
        } catch (OperationException e) {
            fail("La soustraction ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }

    @Test
    public void sameNegativeOperandEqualsZero(){
        int op = -152;
        try {
            double res = minus.execute(op,op);
            if(res != 0){
                logger.warning("Operation "+op+"-"+op);
                fail("(-X) - (-X) doit etre egal a 0");
            }
            else{
                assertTrue(true);
            }
        } catch (OperationException e) {
            fail("La soustraction ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }

    @Test
    public void minusWithZeroOperand2(){
        int op = 152;
        try {
            double res = (int) minus.execute(op,0);
            if(res != op){
                logger.warning("Operation "+op+"- 0 = "+res);
                fail("X - 0 doit etre egal a X");
            }
            else{
                assertTrue(true);
            }
        } catch (OperationException e) {
            fail("La soustraction ne doit pas lever d'exception");
            e.printStackTrace();
        }

        try {
            double res = minus.execute(-op,0);
            if(res != -op){
                logger.warning("Operation -"+op+"- 0");
                fail("X - 0 doit etre egal a X");
            }
            else{
                assertTrue(true);
            }
        } catch (OperationException e) {
            fail("La soustraction ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }

    @Test
    public void minusWithZeroOperand1(){
        int op = 98;
        try {
            double res = minus.execute(0,op);
            if(res != -op){
                logger.warning("Operation 0-"+op);
                fail("0-"+op + " doit etre egal a la valeur negative " + (-op));
            }
            else{
                assertTrue(true);
            }
        } catch (OperationException e) {
            fail("La soustraction ne doit pas lever d'exception");
            e.printStackTrace();
        }

        int op2 = -op;
        try {
            double res = minus.execute(0,op2);
            if(res != -op2){
                logger.warning("Operation 0-"+op2);
                fail("0-"+op2 + " doit etre egal a la valeur positive :" + (-op2));
            }
            else{
                assertTrue(true);
            }
        } catch (OperationException e) {
            fail("La soustraction ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }




}