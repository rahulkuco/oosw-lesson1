package test;

import model.Coin;
import model.PiggyBank;

public class PiggyBankTest {

    public static void main(String[] args){

        Coin c1 = new Coin(5);
        assert c1.getValue() == 5;
        Coin c2 = new Coin(10);
        assert c2.getValue() == 10;
        Coin c3 = new Coin(25);
        assert c3.getValue() == 25;

        PiggyBank p1 =new PiggyBank();
        assert p1.getCoinBalance() == 0;
        assert p1.getCoinCount() == 0;
        
        p1.enter(new Coin(5));
        assert p1.getCoinBalance() == 5;
        assert p1.getCoinCount() == 1;




    }
    
}
