package fr.istic.vv.operations;

import fr.istic.vv.Operation;
import fr.istic.vv.OperationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class TimesTest {
    Operation mult;

    private static Logger logger = Logger.getGlobal();

    @Before
    public void setUp(){
        mult = new Times();
    }

    @After
    public void tearDown(){
        mult = null;
    }

    @Test
    public void timesWithZero(){
        times(0,5,0);
        times(10,0,0);
        times(0,-5,0);
        times(-9,0,0);
    }

    @Test
    public void timesWithOne(){
        times(1,5,5);
        times(10,1,10);
        times(1,-5,-5);
        times(-9,1,-9);
    }

    @Test
    public void timesWithInverse(){
        times(2,0.5,1);
        times(0.2,5,1);
    }

    @Test
    public void timesWithPositive(){
        times(2,0.5,1);
        times(0.2,5,1);
    }

    @Test
    public void timesWithTwoPositive(){
        timesPositive(5,2);
        timesPositive(5,12);
    }



    @Test
    public void timesWithTwoNegative(){
        timesPositive(-5,-2);
        timesPositive(-5,-12);
    }

    @Test
    public void timesWithNegativeAndPositive(){
        timesNegative(5,-2);
        timesNegative(-5,12);
    }

    private void times(double op1, double op2, double expectedRes){
        try {
            double res = mult.execute(op1,op2);

            if(res!=expectedRes){
                fail("Le resultat n'est pas celui attendu : "+op1+"*"+op2+"="+res + "(expected : "+expectedRes+")");
            }
            else{
                assertTrue(true);
            }

        } catch (OperationException e) {
            fail("La multiplication ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }

    private void timesPositive(double op1, double op2){
        try {
            double res = mult.execute(op1,op2);

            if(res<0){
                fail("Le resultat n'est pas celui attendu : "+op1+"*"+op2+"="+res + "(expected : positive");
            }
            else{
                assertTrue(true);
            }

        } catch (OperationException e) {
            fail("La multiplication ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }

    private void timesNegative(double op1, double op2){
        try {
            double res = mult.execute(op1,op2);

            if(res>0){
                fail("Le resultat n'est pas celui attendu : "+op1+"*"+op2+"="+res + "(expected : negative");
            }
            else{
                assertTrue(true);
            }

        } catch (OperationException e) {
            fail("La multiplication ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }
}