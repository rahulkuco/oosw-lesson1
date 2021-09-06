package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Coin;
import view.PiggyBankSimulator;

public class PBHistoryListener implements ActionListener {

    private PiggyBankSimulator piggyBankSimulatorPanel;

    public PBHistoryListener(PiggyBankSimulator piggyBankSimulatorPanel) {
        this.piggyBankSimulatorPanel = piggyBankSimulatorPanel;

    }

    @Override
    public void actionPerformed(ActionEvent exp) {
        ArrayList<Coin> coinHistory = piggyBankSimulatorPanel.getPiggyBank().getCoinHistory();
        int i = 0;
        String previousMessage =piggyBankSimulatorPanel.getDisplay().getText();
        String m = "";
        if (coinHistory.size() > 0){
            for (var coin: coinHistory){
                m += ++i +"." +coin +"\n";
            }
            piggyBankSimulatorPanel.getDisplay().setText(previousMessage + "\nCoin Insert History\n" + m);

        } else {
            piggyBankSimulatorPanel.getDisplay().setText(previousMessage + "\n No Coin Insert History!");

        }
    }
    
}
