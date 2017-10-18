package fr.istic.vv.operations;

import fr.istic.vv.Operation;
import fr.istic.vv.OperationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PlusTest {
    Operation plus;

    private static Logger logger = Logger.getGlobal();

    @Before
    public void setUp(){
        plus = new Plus();
    }

    @After
    public void tearDown(){
        plus = null;
    }

    @Test
    public void addTwoPositiveInteger(){
        int op1 = 52;
        int op2 = 30;

        try {
            double res = plus.execute(op1,op2);

            if(res<=0){
                fail("Le resultat de l'addition de deux entiers positifs doit etre positif");
            }
            else{
                assertTrue(true);
            }

        } catch (OperationException e) {
            fail("L'addition ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }

    @Test
    public void addTwoNegativeInteger(){
        int op1 = -52;
        int op2 = -30;

        try {
            double res = plus.execute(op1,op2);

            if(res>=0){
                fail("Le resultat de l'addition de deux entiers negatifs doit etre negatif");
            }
            else{
                assertTrue(true);
            }

        } catch (OperationException e) {
            fail("L'addition ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }

    @Test
    public void addWithZero(){
        addition(51,0,51);
        addition(0,3,3);
    }

    @Test
    public void addWithZeroWithNegative(){
        addition(-1,0,-1);
        addition(0,-51,-51);
    }

    @Test
    public void addWithOpposite(){
        addition(5,-5,0);
        addition(-15,15,0);
    }

    @Test
    public void addZeroWithZero(){
        addition(0,0,0);
    }

    private void addition(int op1,int op2, int expectedRes){
        try {
            double res = plus.execute(op1,op2);

            if(res!=expectedRes){
                fail("Le resultat n'est pas celui attendu : "+op1+"+"+op2+"="+res);
            }
            else{
                assertTrue(true);
            }

        } catch (OperationException e) {
            fail("L'addition ne doit pas lever d'exception");
            e.printStackTrace();
        }
    }



}