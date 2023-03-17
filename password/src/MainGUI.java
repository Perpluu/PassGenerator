import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI implements ActionListener {

    private final JFrame frame;
    private final JTextField textField;
    private final JLabel outputLabel;

    public MainGUI() {
        frame = new JFrame("Generator ciągu alfanumerycznego");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLayout(new GridLayout(3, 1));

        // Panel z polem tekstowym i przyciskiem
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel inputLabel = new JLabel("Podaj długość ciągu:");
        textField = new JTextField(10);
        JButton generateButton = new JButton("Generuj");
        generateButton.addActionListener(this);
        inputPanel.add(inputLabel);
        inputPanel.add(textField);
        inputPanel.add(generateButton);

        // Panel z etykietą wyniku
        JPanel outputPanel = new JPanel(new FlowLayout());
        JLabel outputTextLabel = new JLabel("Wygenerowany ciąg:");
        outputLabel = new JLabel("");
        outputPanel.add(outputTextLabel);
        outputPanel.add(outputLabel);

        // Dodaj panele do ramki
        frame.add(inputPanel);
        frame.add(outputPanel);

        // Wyświetl ramkę
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(textField.getText());
        String result = Main.getAlphaNumericString(n);
        outputLabel.setText(result);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}