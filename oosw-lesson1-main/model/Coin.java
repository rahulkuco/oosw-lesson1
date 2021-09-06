package model;

public class Coin {

    public static final String NICKEL = "Nickel";
    public static final String DIME = "Dime";
    public static final String QUARTER = "Quarter";
    private int coinValue;

    public Coin(int coinValue){
        this.coinValue = coinValue;

    }

    public int getValue(){
        return coinValue;
    }

    @Override
    public String toString() {
        String name = "N/A";
        switch (coinValue) {
            case 5: name = Coin.NICKEL; break;
            case 10: name = Coin.DIME; break;
            case 25: name = Coin.QUARTER; break;
        }
        return name;

    }
    
}