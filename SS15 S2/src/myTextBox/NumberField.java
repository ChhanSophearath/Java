/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTextBox;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author macbookpro
 */
public class NumberField extends JTextField {

    public NumberField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                thisKeyTyped(e);
            }
        });
    }

    private int digit = 7;

    private void thisKeyTyped(KeyEvent e) {
        if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
        } else {
            if (digit >= 0) {
                if (this.getText().length() >= digit) {
                    e.consume();
                }
            }
        }
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = digit;
    }
}
