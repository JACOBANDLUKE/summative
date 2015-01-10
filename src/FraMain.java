import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FraMain extends JFrame {

    public static JLabel lblBack = new JLabel();

    public FraMain() {
        ImageIcon imageIcon = new ImageIcon("yourFile.gif");
        PanResult panResult = new PanResult();
        PanText panText = new PanText();
        setLayout(new BorderLayout());
        setTitle("Test");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panResult, BorderLayout.CENTER);
        add(panText, BorderLayout.NORTH);
    }
}
