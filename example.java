import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example{
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Increment and Decrement");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Initial number value
        final int[] number = {0};

        // Create label to display the number
        JLabel numberLabel = new JLabel("Number: " + number[0]);
        numberLabel.setBounds(120, 50, 100, 25);
        frame.add(numberLabel);

        // Create Increment and Decrement buttons
        JButton incrementButton = new JButton("Increment");
        incrementButton.setBounds(50, 100, 100, 25);
        frame.add(incrementButton);

        JButton decrementButton = new JButton("Decrement");
        decrementButton.setBounds(150, 100, 100, 25);
        frame.add(decrementButton);

        // Action listener for Increment button
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number[0]++;  // Increment the number
                numberLabel.setText("Number: " + number[0]);  // Update label with new number
            }
        });

        // Action listener for Decrement button
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number[0]--;  // Decrement the number
                numberLabel.setText("Number: " + number[0]);  // Update label with new number
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
