package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Coin;
import view.PiggyBankSimulator;

public class PBInsertListener implements ActionListener{

    private PiggyBankSimulator piggyBankSimulatorPanel;

    public PBInsertListener(PiggyBankSimulator piggyBankSimulatorPanel) {
        this.piggyBankSimulatorPanel = piggyBankSimulatorPanel;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonLabel = "";
        for (var b: piggyBankSimulatorPanel.getRadioButtons()) {
            if(b.isSelected()){
                buttonLabel = b.getText();
                break;
            }
        }
        int value = 0;
        switch(buttonLabel){
            case Coin.NICKEL: value =5;
            break;
            case Coin.DIME: value =10; 
            break;
            case Coin.QUARTER: value =25; 
            break;

        }
        var c = new Coin(value);
        piggyBankSimulatorPanel.getPiggyBank().enter(c);
        String m =piggyBankSimulatorPanel.getDisplay().getText();
        piggyBankSimulatorPanel.getDisplay().setText(m + "\nInserted coin :" + c + " | " + piggyBankSimulatorPanel.getPiggyBank());


    } 
}
