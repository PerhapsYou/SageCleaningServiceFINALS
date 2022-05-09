package View;

import javax.swing.*;
import java.awt.*;

public class WorkerJobDetails {

    public static void jobDetails(){
        JTextField nameTextField;
        JTextField addressTextField;
        JTextField orderDateTextField;
        JTextField orderNoTextField;
        JTextField orderStatusTextField;
        JTextField schedDateTextField;
        JTextField schedTimeTextField;
        JTextField serviceTextField;
        JTextField paymentTextField;

        JFrame requestDetails = new JFrame("Panel test");
        requestDetails.setIconImage(Toolkit.getDefaultToolkit().getImage("src/rfc/uiImg/sageorbLS.png"));
        requestDetails.setTitle("Request Details");
        requestDetails.getContentPane().setBackground(Color.WHITE);
        requestDetails.setSize(529,415);
        requestDetails.getContentPane().setLayout(null);

        orderStatusTextField = new JTextField();
        orderStatusTextField.setEditable(false);
        orderStatusTextField.setBounds(379, 119, 86, 20);
        requestDetails.getContentPane().add(orderStatusTextField);
        orderStatusTextField.setColumns(10);

        JLabel orderStatusLabel = new JLabel("Order Status:");
        orderStatusLabel.setForeground(SystemColor.controlDkShadow);
        orderStatusLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
        orderStatusLabel.setBounds(294, 108, 86, 40);
        requestDetails.getContentPane().add(orderStatusLabel);

        orderNoTextField = new JTextField();
        orderNoTextField.setEditable(false);
        orderNoTextField.setBounds(178, 119, 72, 20);
        requestDetails.getContentPane().add(orderNoTextField);
        orderNoTextField.setColumns(10);

        JPanel bottomDesignPanel = new JPanel();
        bottomDesignPanel.setBackground(new Color(64, 224, 208));
        bottomDesignPanel.setBounds(-14, 365, 553, 10);
        requestDetails.getContentPane().add(bottomDesignPanel);

        JLabel orderNoLabel = new JLabel("Current Viewing Order No:");
        orderNoLabel.setForeground(new Color(105, 105, 105));
        orderNoLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
        orderNoLabel.setBounds(10, 108, 302, 40);
        requestDetails.getContentPane().add(orderNoLabel);

        JLabel sageLogo = new JLabel("");
        sageLogo.setIcon(new ImageIcon("src/rfc/uiImg/SageTextS.png"));
        sageLogo.setBounds(118, 0, 331, 182);
        requestDetails.getContentPane().add(sageLogo);

        JLabel descriptionLabel = new JLabel("Description:");
        descriptionLabel.setBounds(10, 267, 65, 14);
        requestDetails.getContentPane().add(descriptionLabel);

        JPanel descriptionTextPanel = new JPanel();
        descriptionTextPanel.setBounds(19, 292, 490, 62);
        requestDetails.getContentPane().add(descriptionTextPanel);
        descriptionTextPanel.setLayout(null);

        JTextPane descTextPane = new JTextPane();
        descTextPane.setEditable(false);
        descTextPane.setBounds(0, 0, 489, 60);
        descriptionTextPanel.add(descTextPane);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(108, 159, 46, 14);
        requestDetails.getContentPane().add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setEditable(false);
        nameTextField.setBounds(156, 156, 94, 20);
        requestDetails.getContentPane().add(nameTextField);
        nameTextField.setColumns(10);

        addressTextField = new JTextField();
        addressTextField.setEditable(false);
        addressTextField.setBounds(155, 184, 94, 20);
        requestDetails.getContentPane().add(addressTextField);
        addressTextField.setColumns(10);

        orderDateTextField = new JTextField();
        orderDateTextField.setEditable(false);
        orderDateTextField.setBounds(155, 211, 94, 20);
        requestDetails.getContentPane().add(orderDateTextField);
        orderDateTextField.setColumns(10);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(97, 186, 46, 14);
        requestDetails.getContentPane().add(addressLabel);

        JLabel orderDateLabel = new JLabel("Order Date:");
        orderDateLabel.setBounds(81, 214, 58, 14);
        requestDetails.getContentPane().add(orderDateLabel);

        JLabel schedDateLabel = new JLabel("Sched Date:");
        schedDateLabel.setBounds(295, 162, 68, 14);
        requestDetails.getContentPane().add(schedDateLabel);

        JLabel schedTimeLabel = new JLabel("Sched Time:");
        schedTimeLabel.setBounds(294, 189, 62, 14);
        requestDetails.getContentPane().add(schedTimeLabel);

        JLabel serviceLabel = new JLabel("Service:");
        serviceLabel.setBounds(313, 215, 58, 14);
        requestDetails.getContentPane().add(serviceLabel);

        schedDateTextField = new JTextField();
        schedDateTextField.setEditable(false);
        schedDateTextField.setColumns(10);
        schedDateTextField.setBounds(369, 159, 94, 20);
        requestDetails.getContentPane().add(schedDateTextField);

        schedTimeTextField = new JTextField();
        schedTimeTextField.setEditable(false);
        schedTimeTextField.setColumns(10);
        schedTimeTextField.setBounds(368, 187, 94, 20);
        requestDetails.getContentPane().add(schedTimeTextField);

        serviceTextField = new JTextField();
        serviceTextField.setEditable(false);
        serviceTextField.setColumns(10);
        serviceTextField.setBounds(368, 214, 94, 20);
        requestDetails.getContentPane().add(serviceTextField);

        JLabel paymentLabel = new JLabel("Payment:");
        paymentLabel.setBounds(307, 244, 58, 14);
        requestDetails.getContentPane().add(paymentLabel);

        paymentTextField = new JTextField();
        paymentTextField.setEditable(false);
        paymentTextField.setColumns(10);
        paymentTextField.setBounds(368, 241, 94, 20);
        requestDetails.getContentPane().add(paymentTextField);
        requestDetails.setResizable(false);
        requestDetails.setVisible(true);
    }
}
