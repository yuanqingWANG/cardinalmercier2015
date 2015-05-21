package tp9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;

import tp5.Ip;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreAvecWB extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldIP;
	private JTextField jTextFieldClasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreAvecWB frame = new FenetreAvecWB();
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
	public FenetreAvecWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel jPanelHaut = new JPanel();
		contentPane.add(jPanelHaut, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Bonjour tout le monde");
		jPanelHaut.add(lblNewLabel);
		
		JPanel JPanelBas = new JPanel();
		contentPane.add(JPanelBas, BorderLayout.SOUTH);
		
		JButton jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ip ip = new Ip(jTextFieldIP.getText());
				jTextFieldClasse.setText(ip.getClasse() + "");
				
			}
		});
		JPanelBas.add(jButtonOK);
		
		JButton jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jTextFieldIP.setText("");
				jTextFieldIP.setText("");
			}
		});
		JPanelBas.add(jButtonCancel);
		
		JPanel JPanelCentre = new JPanel();
		contentPane.add(JPanelCentre, BorderLayout.CENTER);
		GridBagLayout gbl_JPanelCentre = new GridBagLayout();
		gbl_JPanelCentre.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_JPanelCentre.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_JPanelCentre.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_JPanelCentre.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		JPanelCentre.setLayout(gbl_JPanelCentre);
		
		JLabel jLabelIP = new JLabel("Adresse IP");
		GridBagConstraints gbc_jLabelIP = new GridBagConstraints();
		gbc_jLabelIP.anchor = GridBagConstraints.EAST;
		gbc_jLabelIP.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelIP.gridx = 2;
		gbc_jLabelIP.gridy = 1;
		JPanelCentre.add(jLabelIP, gbc_jLabelIP);
		
		jTextFieldIP = new JTextField();
		jTextFieldIP.setText("192.168.0.1");
		GridBagConstraints gbc_jTextFieldIP = new GridBagConstraints();
		gbc_jTextFieldIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldIP.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldIP.gridx = 3;
		gbc_jTextFieldIP.gridy = 1;
		JPanelCentre.add(jTextFieldIP, gbc_jTextFieldIP);
		jTextFieldIP.setColumns(10);
		
		JLabel jLabelClasse = new JLabel("Classe:");
		GridBagConstraints gbc_jLabelClasse = new GridBagConstraints();
		gbc_jLabelClasse.anchor = GridBagConstraints.EAST;
		gbc_jLabelClasse.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelClasse.gridx = 2;
		gbc_jLabelClasse.gridy = 3;
		JPanelCentre.add(jLabelClasse, gbc_jLabelClasse);
		
		jTextFieldClasse = new JTextField();
		jTextFieldClasse.setEditable(false);
		GridBagConstraints gbc_jTextFieldClasse = new GridBagConstraints();
		gbc_jTextFieldClasse.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldClasse.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldClasse.gridx = 3;
		gbc_jTextFieldClasse.gridy = 3;
		JPanelCentre.add(jTextFieldClasse, gbc_jTextFieldClasse);
		jTextFieldClasse.setColumns(10);
	}

}
