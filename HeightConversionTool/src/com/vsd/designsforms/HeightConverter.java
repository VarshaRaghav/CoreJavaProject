package com.vsd.designsforms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeightConverter extends JFrame {
	private JTextField fttxt;
	private JTextField inchtxt;
	private JTextField cmtxt;
	public HeightConverter() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 10, 703, 415);
		getContentPane().add(panel);
		panel.setLayout(null);
		//panel.setVisible(true);
	
		JLabel ftlabel = new JLabel("Feet");
		ftlabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		ftlabel.setBounds(57, 58, 50, 32);
		panel.add(ftlabel);
		
		JLabel inchlbl = new JLabel("Inches");
		inchlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		inchlbl.setBounds(57, 128, 74, 32);
		panel.add(inchlbl);
		
		fttxt = new JTextField();
		fttxt.setBounds(189, 67, 114, 23);
		panel.add(fttxt);
		fttxt.setColumns(10);
		
		inchtxt = new JTextField();
		inchtxt.setBounds(189, 137, 114, 23);
		panel.add(inchtxt);
		inchtxt.setColumns(10);
		
		JButton convert_to_btn = new JButton("Convert To");
		convert_to_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double feet,inches,centimeters;
				
				feet = Double.parseDouble(fttxt.getText());
				inches = Double.parseDouble(inchtxt.getText());
				centimeters = (feet *12 +inches)* 2.54;
				
				cmtxt.setText(String.valueOf(centimeters));
				
			}
		});
		convert_to_btn.setForeground(Color.BLACK);
		convert_to_btn.setBackground(new Color(184, 134, 11));
		convert_to_btn.setFont(new Font("Verdana", Font.BOLD, 16));
		convert_to_btn.setBounds(125, 198, 168, 46);
		panel.add(convert_to_btn);
		
		cmtxt = new JTextField();
		cmtxt.setBounds(198, 275, 126, 22);
		panel.add(cmtxt);
		cmtxt.setColumns(10);
		
		JButton ext_btn = new JButton("Exit");
		ext_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		ext_btn.setBackground(Color.CYAN);
		ext_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		ext_btn.setBounds(239, 343, 85, 32);
		panel.add(ext_btn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(67, 343, 85, 32);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton clear_btn = new JButton("Clear");
		clear_btn.setBounds(0, 0, 85, 32);
		panel_1.add(clear_btn);
		clear_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			   fttxt.setText("");
			   inchtxt.setText("");
			   cmtxt.setText("");
			   
				
			}
		});
		clear_btn.setBackground(Color.CYAN);
		clear_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel cmlbl = new JLabel("CentiMeters");
		cmlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmlbl.setBounds(57, 278, 91, 19);
		panel.add(cmlbl);
	}
	public static void main(String[] args)
	{
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	HeightConverter hc = new HeightConverter();
                hc.setVisible(true);
                hc.setSize(500,475);
                 
            }
        });
		
	}
}
