package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.PiggyBankSimulator;

public class PBStatsListener implements ActionListener {

    private PiggyBankSimulator piggyBankSimulatorPanel;

    public PBStatsListener(PiggyBankSimulator piggyBankSimulatorPanel) {
        this.piggyBankSimulatorPanel = piggyBankSimulatorPanel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int nickels = 0;
        int dimes = 0;
        int quarters = 0;
        for (var coin : piggyBankSimulatorPanel.getPiggyBank().getCoinHistory()){
            switch (coin.getValue()){
                case 5: ++nickels; break;
                case 10: ++dimes; break;
                case 25: ++quarters; break;
            }
        }
        String em = piggyBankSimulatorPanel.getDisplay().getText();
        em +="\nCoin Stats Updated!\n";
        piggyBankSimulatorPanel.getDisplay().setText(em +"Nickels: " +nickels + "\nDimes: " + dimes + "\nQuarters: " + quarters);

    }

}
