import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Syringe {
    private JFrame frame;
    private JPanel contentPane;
    private JLabel titleLabel;
    private JLabel instructionLabel;
    private JButton superButton;

    public Syringe() {
        try {
            Map<String, String> map = Map.of(
                "title",  "Mark's Antivirus Virus Syringe",
                "buttonMessage", "Virus Installed",
                "imgURL", "https://media.istockphoto.com/id/185675612/photo/gray-and-white-tabby-kitten-playing-while-standing-up.jpg?s=612x612&w=0&k=20&c=yAK0keL_ERAedFKjF1nvHH8j0VsCXtSu12EJRU-5X3s="
            );

            // Create the frame
            frame = new JFrame(map.get("title"));
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

            URL imgSrc = new URI(map.get("imgURL")).toURL();
            BufferedImage myPicture = ImageIO.read(imgSrc);

            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            contentPane.add(picLabel);

            superButton = new JButton("Let me get that credit card information bby");
            superButton.addActionListener(e -> {
                while (true) {
                    String creditCard = JOptionPane.showInputDialog(frame, "enter credit card here");
                    int option = JOptionPane.showConfirmDialog(frame, "Are you sure your credit card number is " + creditCard);
                    if (option == 0) {
                        JOptionPane.showMessageDialog(frame, "Thank you, computer now fix");
                        break;
                    }
                    JOptionPane.showMessageDialog(frame, "I also accept apple giftcards & bitcoin");
                }
            });
            contentPane.add(superButton, BorderLayout.SOUTH);

            // Pack and display the frame
            frame.pack();
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
        } catch (Exception e) {
            System.out.println("Uh-oh, something went wrong");
        }
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(() -> new Syringe());
    }
}
