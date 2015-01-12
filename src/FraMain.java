import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() throws IOException {

        PanResult panResult = new PanResult();
        PanText panText = new PanText();
        setLayout(new BorderLayout());
        setTitle("Type Check");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panResult, BorderLayout.SOUTH);
        add(panText, BorderLayout.NORTH);
    }
}
