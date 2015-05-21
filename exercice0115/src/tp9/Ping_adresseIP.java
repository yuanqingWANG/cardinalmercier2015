package tp9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.Insets;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping_adresseIP extends JFrame {
	private JTextField JtextFieldAdresseIP;
	private JTextField JtextFieldResulat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ping_adresseIP frame = new Ping_adresseIP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ping_adresseIP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel JLabelAdresseIp = new JLabel("Adresse IP:");
		JLabelAdresseIp.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_JLabelAdresseIp = new GridBagConstraints();
		gbc_JLabelAdresseIp.insets = new Insets(0, 0, 5, 5);
		gbc_JLabelAdresseIp.gridx = 3;
		gbc_JLabelAdresseIp.gridy = 2;
		getContentPane().add(JLabelAdresseIp, gbc_JLabelAdresseIp);
		
		JtextFieldAdresseIP = new JTextField();
		GridBagConstraints gbc_JtextFieldAdresseIP = new GridBagConstraints();
		gbc_JtextFieldAdresseIP.insets = new Insets(0, 0, 5, 5);
		gbc_JtextFieldAdresseIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtextFieldAdresseIP.gridx = 5;
		gbc_JtextFieldAdresseIP.gridy = 2;
		getContentPane().add(JtextFieldAdresseIP, gbc_JtextFieldAdresseIP);
		JtextFieldAdresseIP.setColumns(10);
		
		JLabel JLabelResulat = new JLabel("Resulat:");
		JLabelResulat.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_JLabelResulat = new GridBagConstraints();
		gbc_JLabelResulat.anchor = GridBagConstraints.EAST;
		gbc_JLabelResulat.insets = new Insets(0, 0, 5, 5);
		gbc_JLabelResulat.gridx = 3;
		gbc_JLabelResulat.gridy = 5;
		getContentPane().add(JLabelResulat, gbc_JLabelResulat);
		
		JtextFieldResulat = new JTextField();
		GridBagConstraints gbc_JtextFieldResulat = new GridBagConstraints();
		gbc_JtextFieldResulat.insets = new Insets(0, 0, 5, 5);
		gbc_JtextFieldResulat.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtextFieldResulat.gridx = 4;
		gbc_JtextFieldResulat.gridy = 5;
		getContentPane().add(JtextFieldResulat, gbc_JtextFieldResulat);
		JtextFieldResulat.setColumns(10);
		
		JButton JNewButtonPing = new JButton("Ping");
		JNewButtonPing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					try {
						InetAddress ia = InetAddress.getByName(JtextFieldAdresseIP.getText());
						
						boolean ping_ok = ia.isReachable(1000);
						
						if (ping_ok){
							
							JtextFieldResulat.setText("Succes!");
							
						}else {
						
							JtextFieldResulat.setText("echec!");
							
						}
						
					} catch (UnknownHostException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
			}
		});
		GridBagConstraints gbc_JNewButtonPing = new GridBagConstraints();
		gbc_JNewButtonPing.insets = new Insets(0, 0, 0, 5);
		gbc_JNewButtonPing.gridx = 5;
		gbc_JNewButtonPing.gridy = 7;
		getContentPane().add(JNewButtonPing, gbc_JNewButtonPing);
	}
}
