package View;

import javax.swing.*;
import java.awt.*;

public class MainWorkerInterface {
    public static void pendingRequestWorker(){
        JTextField firstUpperBoxField;
        JTextField nameUpperBoxField;
        JTextField addressUpperBoxField;
        JTextField schedTimeUpperBoxField;
        JTextField jobIDUpperBoxField;
        JTextField jobIDTextField;

        JFrame PendingJobRequestUI = new JFrame("Panel test");
        PendingJobRequestUI.setIconImage(Toolkit.getDefaultToolkit().getImage("src/rfc/uiImg/sageorbLS.png"));
        PendingJobRequestUI.setTitle("Main UI (Worker)");
        PendingJobRequestUI.getContentPane().setBackground(new Color(255, 255, 255));
        PendingJobRequestUI.setSize(648,347);
        PendingJobRequestUI.getContentPane().setLayout(null);

        JLabel lowerLogo = new JLabel("");
        lowerLogo.setIcon(new ImageIcon("src/rfc/uiImg/LogoOnliS.png"));
        lowerLogo.setBounds(499, 194, 211, 199);
        PendingJobRequestUI.getContentPane().add(lowerLogo);

        JPanel bottomDesignPanel = new JPanel();
        bottomDesignPanel.setBackground(new Color(0, 206, 209));
        bottomDesignPanel.setBounds(0, 295, 632, 14);
        PendingJobRequestUI.getContentPane().add(bottomDesignPanel);

        JPanel leftButtonsPanel = new JPanel();
        leftButtonsPanel.setBounds(0, 0, 208, 297);
        PendingJobRequestUI.getContentPane().add(leftButtonsPanel);
        leftButtonsPanel.setLayout(null);

        JButton pendingJobReqB = new JButton("Pending Job Request");
        pendingJobReqB.setBounds(21, 68, 150, 23);
        leftButtonsPanel.add(pendingJobReqB);

        JButton reqInvB = new JButton("Request Inventory");
        reqInvB.setBounds(21, 135, 151, 23);
        leftButtonsPanel.add(reqInvB);

        JLabel sageLogo = new JLabel("");
        sageLogo.setBounds(-42, -91, 280, 280);
        sageLogo.setIcon(new ImageIcon("src/rfc/uiImg/sagesm.png"));
        leftButtonsPanel.add(sageLogo);

        JButton billingB = new JButton("Billing");
        billingB.setBounds(20, 168, 150, 23);
        leftButtonsPanel.add(billingB);

        JButton logoutB = new JButton("Log out");
        logoutB.setBounds(21, 252, 150, 23);
        leftButtonsPanel.add(logoutB);

        JButton currentJobB = new JButton("Current Job");
        currentJobB.setBounds(21, 101, 150, 23);
        leftButtonsPanel.add(currentJobB);

        JLabel arrowLogo = new JLabel("");
        arrowLogo.setBounds(171, 55, 38, 48);
        leftButtonsPanel.add(arrowLogo);
        arrowLogo.setIcon(new ImageIcon("src/rfc/uiImg/arrow.png"));

        JLabel currentJobRequestLabel = new JLabel("Current Job Request:");
        currentJobRequestLabel.setForeground(new Color(70, 130, 180));
        currentJobRequestLabel.setFont(new Font("Fugaz One", Font.PLAIN, 17));
        currentJobRequestLabel.setBounds(218, 22, 211, 48);
        PendingJobRequestUI.getContentPane().add(currentJobRequestLabel);

        JLabel bottomNoteLabel = new JLabel("Remember! The customer is always right.");
        bottomNoteLabel.setForeground(new Color(169, 169, 169));
        bottomNoteLabel.setFont(new Font("Fugaz One", Font.PLAIN, 13));
        bottomNoteLabel.setBounds(218, 270, 278, 14);
        PendingJobRequestUI.getContentPane().add(bottomNoteLabel);

        JPanel outputViewPanel = new JPanel();
        outputViewPanel.setBounds(218, 57, 404, 147);
        PendingJobRequestUI.getContentPane().add(outputViewPanel);
        outputViewPanel.setLayout(null);

        firstUpperBoxField = new JTextField();
        firstUpperBoxField.setEditable(false);
        firstUpperBoxField.setBounds(0, 0, 21, 20);
        outputViewPanel.add(firstUpperBoxField);
        firstUpperBoxField.setColumns(10);

        nameUpperBoxField = new JTextField();
        nameUpperBoxField.setEditable(false);
        nameUpperBoxField.setText("Name");
        nameUpperBoxField.setColumns(10);
        nameUpperBoxField.setBounds(20, 0, 103, 20);
        outputViewPanel.add(nameUpperBoxField);

        addressUpperBoxField = new JTextField();
        addressUpperBoxField.setEditable(false);
        addressUpperBoxField.setText("Address");
        addressUpperBoxField.setColumns(10);
        addressUpperBoxField.setBounds(121, 0, 88, 20);
        outputViewPanel.add(addressUpperBoxField);

        schedTimeUpperBoxField = new JTextField();
        schedTimeUpperBoxField.setEditable(false);
        schedTimeUpperBoxField.setText("Scheduled Time & Date");
        schedTimeUpperBoxField.setColumns(10);
        schedTimeUpperBoxField.setBounds(285, 0, 152, 20);
        outputViewPanel.add(schedTimeUpperBoxField);

        jobIDUpperBoxField = new JTextField();
        jobIDUpperBoxField.setEditable(false);
        jobIDUpperBoxField.setText("Job ID");
        jobIDUpperBoxField.setColumns(10);
        jobIDUpperBoxField.setBounds(206, 0, 80, 20);
        outputViewPanel.add(jobIDUpperBoxField);

        JTextPane outputTextPane = new JTextPane();
        outputTextPane.setBounds(0, 19, 404, 128);
        outputViewPanel.add(outputTextPane);

        JButton moreDetailsB = new JButton("More Details");
        moreDetailsB.setBounds(267, 237, 221, 23);
        PendingJobRequestUI.getContentPane().add(moreDetailsB);

        JButton cancelReqB = new JButton("Cancel Request");
        cancelReqB.setBounds(495, 237, 123, 23);
        PendingJobRequestUI.getContentPane().add(cancelReqB);

        JButton acceptReqB = new JButton("Accept Request");
        acceptReqB.setBounds(494, 206, 123, 23);
        PendingJobRequestUI.getContentPane().add(acceptReqB);

        jobIDTextField = new JTextField();
        jobIDTextField.setBounds(264, 208, 220, 20);
        PendingJobRequestUI.getContentPane().add(jobIDTextField);
        jobIDTextField.setColumns(10);

        JLabel jobIDLabel = new JLabel("Job ID:");
        jobIDLabel.setBounds(217, 211, 80, 14);
        PendingJobRequestUI.getContentPane().add(jobIDLabel);
        PendingJobRequestUI.setVisible(true);
    }
}
