import javax.swing.*;
import java.awt.*;

public class Syringe {
    private JFrame frame;
    private JPanel contentPane;
    private JLabel titleLabel;
    private JLabel instructionLabel;
    private JButton superButton;

    public Syringe() {
        // Create the frame
        frame = new JFrame("Mark's Antivirus Virus Syringe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Set frame size

        // Create content pane
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        frame.setContentPane(contentPane);

        // Create and add components
        titleLabel = new JLabel("Mark's Antivirus Virus Syringe");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(titleLabel, BorderLayout.NORTH);

        instructionLabel = new JLabel("Injecting vir.... installing malwa.... fixing things please click the button below.");
        instructionLabel.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(instructionLabel, BorderLayout.CENTER);

        superButton = new JButton("Click Here for Super Fun Time!");
        superButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Virus has been installed successfuly!");
        });
        contentPane.add(superButton, BorderLayout.SOUTH);

        // Pack and display the frame
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(() -> new Syringe());
    }
}