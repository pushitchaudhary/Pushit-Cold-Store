import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColdStore{
    private JCheckBox a500mlCheckBox;
    private JCheckBox a1LtrCheckBox;
    private JCheckBox a25LtrCheckBox;
    private JRadioButton spriteRadioButton;
    private JRadioButton mountainDewRadioButton;
    private JRadioButton cocaColaRadioButton;
    private JTextArea textSubTotalDisplay;
    private JTextArea textTaxDisplay;
    private JTextArea textTotalPriceDisplay;
    private JButton purchaseButton;
    private JButton clearButton;
    private JButton exitButton;
    private JPanel main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ColdStore");
        frame.setContentPane(new ColdStore().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ColdStore() {
        spriteRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (spriteRadioButton.isSelected()) {
                    mountainDewRadioButton.setSelected(false);
                    cocaColaRadioButton.setSelected(false);
                }

                if (spriteRadioButton.isSelected()) {
                    a1LtrCheckBox.setSelected(false);
                    a500mlCheckBox.setSelected(false);
                    a25LtrCheckBox.setSelected(false);
                    textTaxDisplay.setText("");
                    textTotalPriceDisplay.setText("");
                    textSubTotalDisplay.setText("");
                }
            }
        });
        mountainDewRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mountainDewRadioButton.isSelected()) {
                    spriteRadioButton.setSelected(false);
                    cocaColaRadioButton.setSelected(false);
                }

                if (mountainDewRadioButton.isSelected()) {
                    a500mlCheckBox.setSelected(false);
                    a1LtrCheckBox.setSelected(false);
                    a25LtrCheckBox.setSelected(false);
                    textTaxDisplay.setText("");
                    textTotalPriceDisplay.setText("");
                    textSubTotalDisplay.setText("");
                }
            }
        });
        cocaColaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cocaColaRadioButton.isSelected()) {
                    mountainDewRadioButton.setSelected(false);
                    spriteRadioButton.setSelected(false);
                }

                if (cocaColaRadioButton.isSelected()) {
                    a500mlCheckBox.setSelected(false);
                    a1LtrCheckBox.setSelected(false);
                    a25LtrCheckBox.setSelected(false);
                    textTaxDisplay.setText("");
                    textTotalPriceDisplay.setText("");
                    textSubTotalDisplay.setText("");
                }
            }
        });
        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int price = 0;
                int taxRate = 0;
                int totalPrice = 0;
                int tax500ml = 10;
                int tax1Ltr = 15;
                int taxUp2Ltr = 20;
                int subPrice = 0;


                // for sprite
                if (spriteRadioButton.isSelected()) {
                    if (a500mlCheckBox.isSelected()) {
                        subPrice = subPrice + 50;
                        taxRate = taxRate + tax500ml;
                        price = subPrice;
                    }

                    if (a1LtrCheckBox.isSelected()) {
                        subPrice = subPrice + 100;
                        taxRate = taxRate + tax1Ltr;
                        price = subPrice;
                    }

                    if (a25LtrCheckBox.isSelected()) {
                        subPrice = subPrice + 200;
                        taxRate = taxRate + taxUp2Ltr;
                        price = subPrice;
                    }
                }

                // For mountain deu
                if (mountainDewRadioButton.isSelected()) {
                    if (a500mlCheckBox.isSelected()) {
                        subPrice = subPrice + 60;
                        taxRate = taxRate + tax500ml;
                        price = subPrice;
                    }
                    if (a1LtrCheckBox.isSelected()) {
                        subPrice = subPrice + 120;
                        taxRate = taxRate + tax500ml;
                        price = subPrice;
                    }
                    if (a25LtrCheckBox.isSelected()) {
                        subPrice = subPrice + 220;
                        taxRate = taxRate + taxUp2Ltr;
                        price = subPrice;
                    }
                }
                //for coco-cola
                if (cocaColaRadioButton.isSelected()) {
                    if (a500mlCheckBox.isSelected()) {
                        subPrice = subPrice + 70;
                        taxRate = taxRate + tax500ml;
                        price = subPrice;
                    }
                    if (a1LtrCheckBox.isSelected()) {
                        subPrice = subPrice + 130;
                        taxRate = taxRate + tax1Ltr;
                        price = subPrice;
                    }
                    if (a25LtrCheckBox.isSelected()) {
                        subPrice = subPrice + 230;
                        taxRate = taxRate + taxUp2Ltr;
                        price = subPrice;
                    }
                }

                totalPrice = price + taxRate;
                textSubTotalDisplay.setText(String.valueOf(subPrice));
                textTaxDisplay.setText(Integer.toString(taxRate));
                textTotalPriceDisplay.setText(Integer.toString(totalPrice));

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a500mlCheckBox.setSelected(false);
                a1LtrCheckBox.setSelected(false);
                a25LtrCheckBox.setSelected(false);
                mountainDewRadioButton.setSelected(false);
                cocaColaRadioButton.setSelected(false);
                spriteRadioButton.setSelected(false);
                textTaxDisplay.setText("");
                textTotalPriceDisplay.setText("");
                textSubTotalDisplay.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(10);
            }
        });
    }
}
