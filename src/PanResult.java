import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanResult extends JPanel {

    public static JLabel lblResult = new JLabel();
    public static JLabel lblCount = new JLabel();
    public static int nCorrect = 0;

    public PanResult() {
        setBackground(Color.WHITE);
        setLayout(new FlowLayout());
        add(lblResult);
        add(lblCount);
    }

    public static void Correct() {
        lblResult.setText("Correct!");
        nCorrect++;
        lblCount.setText(Integer.toString(PanResult.nCorrect));
    }
}
