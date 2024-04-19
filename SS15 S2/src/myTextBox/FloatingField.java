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
public class FloatingField extends JTextField {

    public FloatingField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                thisKeyTyped(e);
            }
        });
    }

    private void thisKeyTyped(KeyEvent e) {
        String text = this.getText();
        if (e.getKeyChar() == '.') {
            if (text.length() == 0) {
                this.setText("0.");
                e.consume();
            }else{
                if (text.contains(".")) {
                    e.consume();
                }
            }
        }
        else{
            if (!Character.isDigit(e.getKeyChar())) {
                e.consume();
            }
        }
    }
}
