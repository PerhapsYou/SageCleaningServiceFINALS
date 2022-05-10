package View;

import Controler.JavaPB;
import javax.swing.*;
import java.awt.*;

public class ClientJobRequest {

    public static void jobRequest() {
        JTextField serviceTextField;
        JTextField locationTextField;
        JTextField schedDateTextField;
        JTextField timeTextField;
        ButtonGroup paymentRadioBtn = new ButtonGroup();

        JFrame makeJobRequest = new JFrame("Panel test");
        makeJobRequest.setIconImage(Toolkit.getDefaultToolkit().getImage("src/rfc/uiImg/sageCleanLogoSmal.png"));
        makeJobRequest.setTitle("Main UI (Worker)");
        makeJobRequest.getContentPane().setBackground(new Color(255, 255, 255));
        makeJobRequest.setSize(648,347);
        makeJobRequest.getContentPane().setLayout(null);

        JPanel bottomDivider = new JPanel();
        bottomDivider.setBackground(new Color(0, 206, 209));
        bottomDivider.setBounds(0, 295, 632, 14);
        makeJobRequest.getContentPane().add(bottomDivider);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, 0, 208, 297);
        makeJobRequest.getContentPane().add(buttonPanel);
        buttonPanel.setLayout(null);

        JButton viewServicesB = new JButton("View Services");
        viewServicesB.setBounds(21, 68, 150, 23);
        buttonPanel.add(viewServicesB);

        JButton requestHistoryB = new JButton("Request History");
        requestHistoryB.setBounds(21, 135, 151, 23);
        buttonPanel.add(requestHistoryB);

        JLabel sageLogoImg = new JLabel("");
        sageLogoImg.setBounds(-42, -91, 280, 280);
        sageLogoImg.setIcon(new ImageIcon("src/rfc/uiImg/sagesm.png"));
        buttonPanel.add(sageLogoImg);

        JButton payForServicesB = new JButton("Pay for Service");
        payForServicesB.setBounds(20, 168, 150, 23);
        buttonPanel.add(payForServicesB);

        JButton logOutB = new JButton("Log out");
        logOutB.setBounds(21, 252, 150, 23);
        buttonPanel.add(logOutB);

        JButton makeRequestB = new JButton("Make Request");
        makeRequestB.setBounds(21, 101, 150, 23);
        buttonPanel.add(makeRequestB);

        JLabel arrowImg = new JLabel("");
        arrowImg.setBounds(170, 88, 38, 48);
        buttonPanel.add(arrowImg);
        arrowImg.setIcon(new ImageIcon("src/rfc/uiImg/arrow.png"));

        JLabel serviceRequestHeaderLabel = new JLabel("Service Request");
        serviceRequestHeaderLabel.setForeground(new Color(169, 169, 169));
        serviceRequestHeaderLabel.setFont(new Font("Fugaz One", Font.PLAIN, 20));
        serviceRequestHeaderLabel.setBounds(215, 25, 278, 23);
        makeJobRequest.getContentPane().add(serviceRequestHeaderLabel);

        JLabel serviceLabel = new JLabel("Service");
        serviceLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        serviceLabel.setBounds(263, 55, 52, 14);
        makeJobRequest.getContentPane().add(serviceLabel);

        JLabel noteBottomLabel = new JLabel("For assistance, please call our landline or email sage.services!");
        noteBottomLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        noteBottomLabel.setBounds(223, 276, 381, 14);
        makeJobRequest.getContentPane().add(noteBottomLabel);

        serviceTextField = new JTextField();
        serviceTextField.setBounds(304, 50, 123, 20);
        makeJobRequest.getContentPane().add(serviceTextField);
        serviceTextField.setColumns(10);

        JLabel locationLabel = new JLabel("Location");
        locationLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        locationLabel.setBounds(253, 79, 52, 14);
        makeJobRequest.getContentPane().add(locationLabel);

        locationTextField = new JTextField();
        locationTextField.setColumns(10);
        locationTextField.setBounds(305, 72, 123, 20);
        makeJobRequest.getContentPane().add(locationTextField);

        JLabel schedDateLabel = new JLabel("Scheduled Date");
        schedDateLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        schedDateLabel.setBounds(217, 101, 88, 14);
        makeJobRequest.getContentPane().add(schedDateLabel);

        schedDateTextField = new JTextField();
        schedDateTextField.setColumns(10);
        schedDateTextField.setBounds(304, 97, 123, 20);
        makeJobRequest.getContentPane().add(schedDateTextField);

        JLabel timeLabel = new JLabel("Time");
        timeLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        timeLabel.setBounds(271, 127, 52, 14);
        makeJobRequest.getContentPane().add(timeLabel);

        timeTextField = new JTextField();
        timeTextField.setColumns(10);
        timeTextField.setBounds(304, 122, 123, 20);
        makeJobRequest.getContentPane().add(timeTextField);

        JPanel textPanePanel = new JPanel();
        textPanePanel.setLayout(null);
        textPanePanel.setBounds(435, 64, 188, 143);
        makeJobRequest.getContentPane().add(textPanePanel);

        JTextPane descriptionTextPane = new JTextPane();
        descriptionTextPane.setBounds(0, 0, 188, 142);
        textPanePanel.add(descriptionTextPane);

        JLabel descriptionLabel = new JLabel("Description:");
        descriptionLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        descriptionLabel.setBounds(437, 53, 71, 14);
        makeJobRequest.getContentPane().add(descriptionLabel);

        JLabel paymentLabel = new JLabel("Payment");
        paymentLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        paymentLabel.setBounds(249, 149, 71, 14);
        makeJobRequest.getContentPane().add(paymentLabel);

        JRadioButton paymentRdBtnOnline = new JRadioButton("Online");
        paymentRadioBtn.add(paymentRdBtnOnline);
        paymentRdBtnOnline.setBackground(Color.WHITE);
        paymentRdBtnOnline.setSelected(true);
        paymentRdBtnOnline.setBounds(302, 143, 60, 23);
        makeJobRequest.getContentPane().add(paymentRdBtnOnline);

        JRadioButton paymentRdBtnCash = new JRadioButton("Cash");
        paymentRadioBtn.add(paymentRdBtnCash);
        paymentRdBtnCash.setBackground(Color.WHITE);
        paymentRdBtnCash.setBounds(364, 143, 60, 23);
        makeJobRequest.getContentPane().add(paymentRdBtnCash);

        JLabel availWorkerLabel = new JLabel("Current Available Worker/s");
        availWorkerLabel.setFont(new Font("Corbel Light", Font.PLAIN, 13));
        availWorkerLabel.setBounds(218, 174, 178, 14);
        makeJobRequest.getContentPane().add(availWorkerLabel);

        JComboBox availWorkerComboBox = new JComboBox();
        availWorkerComboBox.setModel(new DefaultComboBoxModel(new String[] {}));
        availWorkerComboBox.setBackground(Color.WHITE);
        availWorkerComboBox.setBounds(304, 185, 123, 22);
        makeJobRequest.getContentPane().add(availWorkerComboBox);
        
        JButton submitReqsB = new JButton("Make Request");
        submitReqsB.setBounds(243, 241, 160, 24);
        submitReqsB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String service = serviceTextField.getText();
                String location = locationTextField.getText();
                String sched = schedDateTextField.getText();
                String time = timeTextField.getText();
                String payment = paymentRadioBtn.getSelection().toString();

                if(emptyCheck(service)){
                    JavaPB.data.add(service);
                    if(emptyCheck(location)){
                        JavaPB.data.add(location);
                        if(emptyCheck(sched)){
                            JavaPB.data.add(sched);
                            if (emptyCheck(time)){
                                JavaPB.data.add(time);
                                if (emptyCheck(payment)){
                                    JavaPB.data.add(payment);
                                }
                            }
                        }
                    }
                }

                if(JavaPB.data.size() < 5){
                    System.out.println("There was an empty field.. please check any missing details");
                    JavaPB.data.clear();
                } else {
                    System.out.println("Data was added successfully");
                }
            }
        });
        makeJobRequest.getContentPane().add(submitReqsB);

        JButton cancelReqB = new JButton("Cancel Request");
        cancelReqB.setBounds(452, 241, 160, 24);
        makeJobRequest.getContentPane().add(cancelReqB);
        makeJobRequest.setResizable(false);
        makeJobRequest.setVisible(true);
    }
}
