package controller;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.CalculatorSimulator;
import view.MenuScreen;

import java.awt.event.ActionEvent;

public class ButtonClickListener implements ActionListener{

    private CalculatorSimulator calculatorSimulatorPanel;

    public ButtonClickListener(CalculatorSimulator calculatorSimulatorPanel) {
        this.calculatorSimulatorPanel = calculatorSimulatorPanel;

    }

    @Override
    public void actionPerformed(ActionEvent e){
        var button =e.getSource();
        String m = calculatorSimulatorPanel.getDisplay().getText() +"\n";
        if (button == calculatorSimulatorPanel.getExitButton()){
            JFrame window = calculatorSimulatorPanel.getWindow();
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        } else if (button == calculatorSimulatorPanel.getAddButton()){
            calculatorSimulatorPanel.getCalculator().add();
            calculatorSimulatorPanel.getDisplay().setText(m + "ADD (+) operation performed");

        } else if (button == calculatorSimulatorPanel.getSubButton()){
            calculatorSimulatorPanel.getCalculator().subtract();
            calculatorSimulatorPanel.getDisplay().setText(m + "SUBTRACT (-) operation performed");

        } else if (button == calculatorSimulatorPanel.getDivButton()){
            calculatorSimulatorPanel.getCalculator().divide();
            calculatorSimulatorPanel.getDisplay().setText(m + "DIVISION (/) operation performed");

        } else if (button == calculatorSimulatorPanel.getMulButton()){
            calculatorSimulatorPanel.getCalculator().multiply();
            calculatorSimulatorPanel.getDisplay().setText(m + "MULTIPLICATION (*) operation performed");

        } else if (button == calculatorSimulatorPanel.getEnterButton()){
            try{
                double value = Double.parseDouble(calculatorSimulatorPanel.getNumField().getText());
                calculatorSimulatorPanel.getCalculator().enter(value);
                calculatorSimulatorPanel.getDisplay().setText(m+value+" Entered value");
                calculatorSimulatorPanel.getNumField().setText("");
        } catch (NumberFormatException exception){
            calculatorSimulatorPanel.getDisplay().setText(m+calculatorSimulatorPanel.getNumField().getText() +": Invalid Number Format");
            calculatorSimulatorPanel.getNumField().setText("");
        }
        } else if (button == calculatorSimulatorPanel.getResultButton()){
            calculatorSimulatorPanel.getDisplay().setText(m + "RESULT = "+ calculatorSimulatorPanel.getCalculator().getResult());

        }

    }
    
}
