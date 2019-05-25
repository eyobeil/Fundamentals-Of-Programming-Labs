package Prob1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddressForm extends JFrame {
	JPanel panel;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel textlabel1;
	JPanel textlabel2;
	JPanel textlabel3;
	JPanel textlabel4;
	JPanel textlabel5;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JButton button;
	public AddressForm(){
		setTitle("Address Form");
		setSize(550,200);
		centerFrameOnDesktop(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		definePanel1();
		definePanel2();
		definePanel3();
		panel= new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(panel1,BorderLayout.NORTH);
		panel.add(panel2,BorderLayout.CENTER);
		panel.add(panel3,BorderLayout.SOUTH);
		getContentPane().add(panel);
		setVisible(true);

	}
	public static void centerFrameOnDesktop(Component f){
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);

	}

	private void definePanel1() {
		panel1= new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		defineTextLabel1();
		defineTextLabel2();
		defineTextLabel3();
		panel1.add(textlabel1);
		panel1.add(textlabel2);
		panel1.add(textlabel3);

	}
	private void definePanel2() {
		panel2= new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		defineTextLabel4();
		defineTextLabel5();
		panel2.add(textlabel4);
		panel2.add(textlabel5);
	}
	private void definePanel3() {
		panel3= new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		button= new JButton("Submit");
		button.addActionListener(new MyButtonListener());
		panel3.add(button);


	}
	private void defineTextLabel1() {
		textlabel1= new JPanel();
		textlabel1.setLayout(new BorderLayout());
		label1= new JLabel("Name");
		text1= new JTextField(10);
		textlabel1.add(label1,BorderLayout.NORTH);
		textlabel1.add(text1,BorderLayout.SOUTH);
	}
	private void defineTextLabel2() {
		textlabel2= new JPanel();
		textlabel2.setLayout(new BorderLayout());
		label2= new JLabel("Street");
		text2= new JTextField(10);
		textlabel2.add(label2,BorderLayout.NORTH);
		textlabel2.add(text2,BorderLayout.SOUTH);
	}
	private void defineTextLabel3() {
		textlabel3= new JPanel();
		textlabel3.setLayout(new BorderLayout());
		label3= new JLabel("City");
		text3= new JTextField(10);
		textlabel3.add(label3,BorderLayout.NORTH);
		textlabel3.add(text3,BorderLayout.SOUTH);
	}
	private void defineTextLabel4() {
		textlabel4= new JPanel();
		textlabel4.setLayout(new BorderLayout());
		label4= new JLabel("State");
		text4= new JTextField(10);
		textlabel4.add(label4,BorderLayout.NORTH);
		textlabel4.add(text4,BorderLayout.SOUTH);
	}
	private void defineTextLabel5() {
		textlabel5= new JPanel();
		textlabel5.setLayout(new BorderLayout());
		label5= new JLabel("Zip");
		text5= new JTextField(10);
		textlabel5.add(label5,BorderLayout.NORTH);
		textlabel5.add(text5,BorderLayout.SOUTH);
	}
	class MyButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String fname=text1.getText();
			String st=text2.getText();
			String ct=text3.getText();
			String stt=text4.getText();
			String zipc=text5.getText();
			System.out.printf(" %s \n %s \n %s, %s %s",fname,st,ct,stt,zipc);

		}


	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AddressForm();
			}
		});
	}

}
