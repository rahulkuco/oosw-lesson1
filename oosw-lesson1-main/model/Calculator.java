package model;

public class Calculator {
    private double lastNumber;
    private double lastNumber2;
    private double result;

    public void enter(double n){
        lastNumber2 =lastNumber;
        lastNumber =n;
    }

    public void add(){
        result =lastNumber + lastNumber2;
    }

    public void multiply() {
        result =lastNumber * lastNumber2;
    }

    public void divide() {
        result =lastNumber / lastNumber2;
    }

    public void subtract() {
        result =lastNumber - lastNumber2;
    }

    public double getResult(){
        return result;
    }

    
}
