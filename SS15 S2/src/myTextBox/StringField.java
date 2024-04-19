package myTextBox;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author macbookpro
 */
public class StringField extends JTextField {

    public StringField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                thisKeyTyped(e);
            }
        });
    }

    private int length = -1;

    private void thisKeyTyped(KeyEvent e) {
        if (length >= 0) {
            if (getText().length() >= length) {
                e.consume();
            }
        }
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
}
