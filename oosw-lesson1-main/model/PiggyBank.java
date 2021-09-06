package model;

import java.util.ArrayList;

public class PiggyBank {
    private int coinBalance;
    private ArrayList<Coin> coinHistory = new ArrayList<>();

    public PiggyBank(){
        coinBalance =0;
    }

    public void enter(Coin c){
        coinBalance += c.getValue();
        coinHistory.add(c);

    }

    public int getCoinBalance(){
        return coinBalance;
    
    }

    public int getCoinCount(){
        return coinHistory.size();
    }

    public ArrayList<Coin> getCoinHistory() {
        return coinHistory;
    }

    @Override
    public String toString() {
        return "Balance =" + coinBalance + ", Coin Count =" + coinHistory.size();
    }
    
}
