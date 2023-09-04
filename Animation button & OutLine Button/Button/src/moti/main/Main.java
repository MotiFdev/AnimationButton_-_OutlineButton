package moti.main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import moti.swing.MyButton;
import moti.swing.OutlineButton;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;

public class Main extends JFrame {

	private JPanel bg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 280);
		bg = new JPanel();
		bg.setBackground(SystemColor.windowBorder);
		bg.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(bg);
		
		MyButton btnAnimation = new MyButton();
		btnAnimation.setBackground(new Color(53,47,68));
		btnAnimation.setForeground(new Color(250,250,250));
		btnAnimation.setText("CLICK ME");
		
		JLabel lblNewLabel = new JLabel("ANIMATION BUTTON");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		OutlineButton btnOutline = new OutlineButton();
		btnOutline.setBackground(new Color(255,255,255));
		btnOutline.setForeground(new Color(0, 255, 0));
		btnOutline.setText("CLICK ME");
		
		JLabel lblOutlineButton = new JLabel("OUTLINE BUTTON");
		lblOutlineButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutlineButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutlineButton.setForeground(new Color(255, 255, 0));
		
		GroupLayout gl_bg = new GroupLayout(bg);
		gl_bg.setHorizontalGroup(
			gl_bg.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_bg.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblOutlineButton, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, gl_bg.createSequentialGroup()
					.addGap(74)
					.addComponent(btnAnimation, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
					.addComponent(btnOutline, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(49))
		);
		gl_bg.setVerticalGroup(
			gl_bg.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bg.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_bg.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOutlineButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_bg.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOutline, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnimation, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(169, Short.MAX_VALUE))
		);
		bg.setLayout(gl_bg);
	}
}
