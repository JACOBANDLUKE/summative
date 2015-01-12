import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanText extends JPanel {

    public static JLabel lblChar = new JLabel();
    public static Random rand = new Random();
    public static String sch;

    public PanText() {
        chargen();
        setLayout(new FlowLayout());
        final TextInput textInput = new TextInput();
        textInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    String s = textInput.getText();
                    if (s.equals(sch)) {
                        PanResult.Correct();
                    } else {
                        PanResult.lblResult.setText("WRONG");
                    }
                    chargen();
                    textInput.setText("");
                }
            }
        });
        setBackground(Color.WHITE);
        add(textInput);
        add(lblChar);
    }

    public static void chargen() {
        Random rand = new Random();
        int nSelect = rand.nextInt(1);
        if (nSelect == 0) {
            char c = (char) (rand.nextInt(26) + 'a');
            sch = Character.toString(c);
            lblChar.setText(sch);
        } else {
            int nNum = rand.nextInt(9);
            lblChar.setText(Integer.toString(nNum));
        }
    }
}
