package Prob2;

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

public class StringPlay extends JFrame{
JPanel panel;
JPanel panel1;
JPanel panel2;
JPanel textpanel1;
JPanel textpanel2;
JTextField text1;
JTextField text2;
JLabel label1;
JLabel label2;
JButton button1;
JButton button2;
JButton button3;

public StringPlay() {
	setTitle("String Utility");
	setSize(550,200);
	centerFrameOnDesktop(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	definePanel1();
	definePanel2();
	panel= new JPanel();
	panel.setLayout(new FlowLayout());
	panel.add(panel1);
	panel.add(panel2);
	getContentPane().add(panel);
	setVisible(true);
}
public void defineTextPanel1() {
	textpanel1= new JPanel();
	textpanel1.setLayout(new BorderLayout());
	text1= new JTextField(10);
	label1= new JLabel("input");
	textpanel1.add(text1,BorderLayout.SOUTH);
	textpanel1.add(label1,BorderLayout.NORTH);
}
public void defineTextPanel2() {
	textpanel2= new JPanel();
	textpanel2.setLayout(new BorderLayout());
	label2= new JLabel("Output");
	text2=  new JTextField(10);
	textpanel2.add(label2, BorderLayout.NORTH);
	textpanel2.add(text2,BorderLayout.SOUTH);}
public void definePanel1() {
	panel1= new JPanel();
	panel1.setLayout(new BorderLayout());
	button1= new JButton("Count Letters");
	button1.addActionListener(new MyButtonListener());
	panel1.add(button1,BorderLayout.NORTH);
	button2= new JButton("Reverse Letters");
	button2.addActionListener(new MyButtonListener());
	panel1.add(button2, BorderLayout.CENTER);
	button3= new JButton("Remove Duplicates");
	button3.addActionListener(new MyButtonListener());
	panel1.add(button3, BorderLayout.SOUTH);
	}
public void definePanel2() {
	panel2= new JPanel();
	panel2.setLayout(new BorderLayout());
	defineTextPanel1();
	defineTextPanel2();
	panel2.add(textpanel1,BorderLayout.NORTH);
	panel2.add(textpanel2, BorderLayout.SOUTH);
}
	class MyButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==button1) {
				String input= text1.getText();
				Integer output=input.length();
				text2.setText(output.toString());
				System.out.println(text2);}
				else if(ae.getSource()==button2) {
					String input= text1.getText();
					StringBuilder output=new StringBuilder();
					for(int i=input.length()-1;i>=0;i--) {
						output.append(input.charAt(i));
					}
					text2.setText(output.toString());
				}
				else {
					String input=text1.getText();
					String output="";
				    for (int i = 0; i < input.length(); i++) {
				        if(!output.contains(String.valueOf((input.charAt(i))))) {
				            output += String.valueOf(input.charAt(i));
				        }
				    }
				text2.setText(output);
			}
			
		}
	}
private void centerFrameOnDesktop(Component f) {
	Toolkit toolkit=Toolkit.getDefaultToolkit();
	int height = toolkit.getScreenSize().height;
	int width = toolkit.getScreenSize().width;
	int frameHeight = f.getSize().height;
	int frameWidth = f.getSize().width;
	f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
		new StringPlay();	
		}
	});
	

}
}