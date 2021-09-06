package view;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.PBHistoryListener;
import controller.PBInsertListener;
import controller.PBStatsListener;
import model.Coin;
import model.PiggyBank;

public class PiggyBankSimulator {
    private PiggyBank piggyBank = new PiggyBank();

    private JFrame window;
    private JTextArea display = new JTextArea();
    private JRadioButton[] radioButtons;

    public PiggyBankSimulator(JFrame window){
        this.window = window;
        window.setTitle("PiggyBank Simulator");
    }

    public void init(){

        Container cp = window.getContentPane();
        var scrollPane =new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(500,500));
        cp.add(scrollPane, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);
        southPanel.setLayout(new GridLayout(2,1));

        JPanel radioPanel = new JPanel();
        radioButtons = new JRadioButton[3];
        radioButtons[0] = new JRadioButton(Coin.NICKEL);
        radioButtons[0].setSelected(true);
        radioButtons[1] = new JRadioButton(Coin.DIME);
        radioButtons[2] = new JRadioButton(Coin.QUARTER);
        
        ButtonGroup radioGroup = new ButtonGroup();
        for (var b: radioButtons){
            radioPanel.add(b);
            radioGroup.add(b);
        }


        var statsButton = new JButton("Statistics");
        var insertButton = new JButton("Insert");
        var historyButton = new JButton("History");
        var exitButton = new JButton("Back to Home");
        insertButton.addActionListener(new PBInsertListener(this));
        historyButton.addActionListener(new PBHistoryListener(this));
        statsButton.addActionListener(new PBStatsListener(this));
        exitButton.addActionListener(e -> {
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(insertButton);
        buttonPanel.add(historyButton);
        buttonPanel.add(statsButton);
        buttonPanel.add(exitButton);

        southPanel.add(radioPanel);
        southPanel.add(buttonPanel);

    }

    public PiggyBank getPiggyBank() {
        return piggyBank;
    }

    public JTextArea getDisplay(){
        return display;
    }

    public JRadioButton[] getRadioButtons(){
        return radioButtons;
    }


}
