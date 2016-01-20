import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame {

    public static void createGUI() {
        JFrame frame = new JFrame("Collection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "1",
                "2",
                "3",

        };

        String[][] data = {
                {"A", "B", "C", ""},
                {"A1", "B1", "C1", ""},
                {"A2", "B2", "C2", ""},

        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}