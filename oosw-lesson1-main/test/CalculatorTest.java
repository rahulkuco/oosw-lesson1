package test;

import model.Calculator;

public class CalculatorTest {
    
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.enter(2);
        c.enter(3);
        c.add();

        assert c.getResult() == 5;
        c.multiply();
        assert c.getResult() == 2*3;

        c.enter(5);
        c.enter(4);
        c.multiply();
        assert c.getResult() == 5*4;

        c.subtract();
        assert c.getResult() == 5-4;

        c.divide();
        assert c.getResult() == 5.0/4;



    }
}
