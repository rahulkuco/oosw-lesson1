package view;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {

    private JFrame window;

    public MenuScreen(JFrame window){
        this.window = window;
        window.setTitle("Menu - Home");

    }

    public void init(){
        Container cp = window.getContentPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,200));
        panel.setLayout(new GridLayout(2,1));
        JButton calculatorButton = new JButton("Calculator Simulator");
        JButton piggybankButton = new JButton("PiggyBank Simulator");
        panel.add(calculatorButton);
        panel.add(piggybankButton);
        cp.add(BorderLayout.CENTER, panel);

        calculatorButton.addActionListener((e) -> {
            window.getContentPane().removeAll();
            var calc = new CalculatorSimulator(window);
            calc.init();
            window.pack();
            window.revalidate();

        });

        piggybankButton.addActionListener((e) -> {
            window.getContentPane().removeAll();
            var piggyBank = new PiggyBankSimulator(window);
            piggyBank.init();
            window.pack();
            window.revalidate();
        });

    }
    
}
