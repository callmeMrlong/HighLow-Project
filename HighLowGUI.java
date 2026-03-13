import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighLowGUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel titleLabel, instructionLabel;
    JTextField input;
    JTextArea output;
    JScrollPane outputScroll;
    JButton submitButton, resetButton, playAgainButton, exitButton;
    GridBagLayout layout;

    public void createAndShowGUI() {
        frame = new JFrame();
        layout = new GridBagLayout();
        panel = new JPanel(layout);


        // CONSTRAINTS
        GridBagConstraints c = new GridBagConstraints();

        /* == ROW 0: TITLE LABEL == */
        titleLabel = new JLabel("High Low Guessing Game!");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        // SET FONT FOR TITLE
        Font titleFont = new Font("Serif", Font.ROMAN_BASELINE, 28);
        titleLabel.setFont(titleFont);

        //CONSTRAINTS FOR TITLE LABEL
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 0;
        c.gridwidth = 0;
        panel.add(titleLabel, c);

        /* == ROW 1: INSTRUCTION LABEL, INPUT, & SUBMIT == */
        instructionLabel = new JLabel("Enter a number 1-100 please:");
        instructionLabel.setHorizontalAlignment(JLabel.CENTER);

        // SET FONT FOR INSTRUCTION LABEL
        Font instructionFont = new Font("Serif", Font.ROMAN_BASELINE, 20);
        instructionLabel.setFont(instructionFont);

        // CONSTRAINTS FOR INSTRUCTION LABEL
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.weighty = 0;
        c.gridwidth = 1;
        c.insets = new Insets(10,5,10,5);
        panel.add(instructionLabel, c);

        // CONSTRAINTS FOR INPUT
        input = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1;
        c.weighty = 0;
        c.gridwidth = 1;
        panel.add(input, c);

        // CONSTRAINTS FOR SUBMIT BUTTON
        submitButton = new JButton("Submit");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 1;
        c.weightx = 1;
        c.weighty = 0;
        c.gridwidth = 1;
        panel.add(submitButton, c);

        /* == ROW 3-5: OUTPUT == */
        // CONSTRAINTS FOT OUTPUT
        output = new JTextArea();
        output.setEditable(false);
        output.setLineWrap(true);
        outputScroll = new JScrollPane(output);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.gridwidth = 0;
        c.gridheight = 4;
        panel.add(outputScroll, c);

        /* ROW 6: PLAY AGAIN, RESET, & EXIT BUTTONS  */
        // CONSTRAINTS FOR PLAY AGAIN
        playAgainButton = new JButton("Play Again");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        c.weightx = 1;
        c.weighty = 0;
        c.gridwidth = 1;
        panel.add(playAgainButton, c);

        // CONSTRAINTS FOR RESET
        resetButton = new JButton("Reset");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 6;
        c.weightx = 1;
        c.weighty = 0;
        c.gridwidth = 1;
        panel.add(resetButton, c);

        // CONSTRAINTS FOR EXIT
        exitButton = new JButton("Exit");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 6;
        c.weightx = 1;
        c.weighty = 0;
        c.gridwidth = 1;
        panel.add(exitButton, c);

        // ADD COMPONENTS
        frame.add(panel);
        frame.setTitle("High Low Guessing Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HighLowGUI view = new HighLowGUI();
        SwingUtilities.invokeLater(() -> {
            view.createAndShowGUI();
        });
    }

    //Invoked when an action occurs. * * @param e the event to be processed
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}