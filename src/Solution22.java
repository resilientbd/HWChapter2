import javax.swing.*;
import java.awt.*;

public class Solution22 {
    public static void main(String[] args) {
        final JTextField width = new JTextField(10);
        final JTextField height = new JTextField(10);
        final JTextField title = new JTextField(10);
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0);

        pane.add(new JLabel("Width:"), gbc);

        gbc.gridy = 1;
        pane.add(new JLabel("Height:"), gbc);

        gbc.gridy = 2;
        pane.add(new JLabel("Title:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        pane.add(width, gbc);

        gbc.gridy = 1;
        pane.add(height, gbc);

        gbc.gridy = 2;
        pane.add(title, gbc);

        int reply = JOptionPane.showConfirmDialog(null, pane, "Input data",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (reply == JOptionPane.OK_OPTION) {
            // get user input
            String widthText = width.getText();
            String heightText = new String(height.getText());
            String titleText = new String(title.getText());

            showFrame(Integer.parseInt(widthText),Integer.parseInt(heightText),titleText);
        }


    }

    private static void showFrame(int widthText, int heightText, String titleText) {
        JFrame jFrame = new JFrame(titleText);
        jFrame.setBounds(0,0,widthText,heightText);
        jFrame.setVisible(true);
    }


}
