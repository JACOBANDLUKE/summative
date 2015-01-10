import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kestreL
 */
public class PanText extends JPanel {

    public static JLabel lblChar = new JLabel();

    public static Random rand = new Random();
    public static String sch;

    public PanText() {
        lettergen();
        setLayout(new FlowLayout());
        TextInput textInput = new TextInput();
        textInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    String s = textInput.getText();
                    if (s.equals(sch)) {
                        PanResult.Correct();
                    } else {
                        PanResult.lblResult.setText("Incorrect!");
                    }
                    lettergen();
                    textInput.setText("");
                }
            }
        });
        add(textInput);
        add(lblChar);
    }

    public static void lettergen() {
        char c = (char) (rand.nextInt(26) + 'a');
        sch = Character.toString(c);
        lblChar.setText(sch);
    }
}
