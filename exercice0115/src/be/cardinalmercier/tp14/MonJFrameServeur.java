package be.cardinalmercier.tp14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class MonJFrameServeur extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonJFrameServeur frame = new MonJFrameServeur();
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
	public MonJFrameServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel jpanelHaut = new JPanel();
		contentPane.add(jpanelHaut, BorderLayout.NORTH);
		
		JPanel jpanelcenter = new JPanel();
		contentPane.add(jpanelcenter, BorderLayout.CENTER);
		
		JLabel jLabelNumeroDePort = new JLabel("Numero de Port :");
		jpanelcenter.add(jLabelNumeroDePort);
		
		jtextFieldPort = new JTextField();
		jpanelcenter.add(jtextFieldPort);
		jtextFieldPort.setColumns(10);
		
		JPanel jpanelBas = new JPanel();
		contentPane.add(jpanelBas, BorderLayout.SOUTH);
		
		JButton btnDemarrerLeServeur = new JButton("Demarrer Le Serveur");
		btnDemarrerLeServeur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MonServeur ms = new MonServeur();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		jpanelBas.add(btnDemarrerLeServeur);
	}

}
