package prob_13_2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressForm extends JFrame {
	private JPanel mainPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JPanel middlePanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JTextField idField = new JTextField(5);
	private JTextField firstNameField = new JTextField(10);
	private JTextField lastNameField = new JTextField(10);
	private JTextField ssnField = new JTextField(10);
	private JTextField streetField = new JTextField(10);
	private JTextField cityField = new JTextField(10);
	private JTextField stateField = new JTextField(10);
	private JTextField zipField = new JTextField(10);
	private JLabel statusLabel = new JLabel();
	private String searchQuery = "Select p.firstname,p.lastname,p.ssn,r.street,r.state,r.city,r.zip from Person p, Address r where p.id=r.id and p.id= ";
	private String insertPersonQuery = "Insert Into Person (FIRSTNAME,LASTNAME,SSN) values('";
	private String insertAddressQuery = "Insert Into Address (ID,STREET,CITY,STATE,ZIP) values (";
	private String selectLastRecord = "SELECT * FROM Person ORDER BY id ASC";

	private ConnectManager cm = new ConnectManager();

	private Statement stmt = null;

	public AddressForm() {
		initialize();
		defineMainPanel();
		getContentPane().add(mainPanel);
		// setSize(320, 240);
		pack();
		centerFrameOnDesktop(this);
		setResizable(false);

	}

	void defineMainPanel() {
		defineTopPanel();
		defineMiddlePanel();
		defineBottomPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		JPanel interPanel = new JPanel();
		interPanel.setLayout(new BorderLayout());
		interPanel.add(statusPanel, BorderLayout.NORTH);
		interPanel.add(bottomPanel, BorderLayout.CENTER);
		mainPanel.add(interPanel, BorderLayout.SOUTH);

	}

	void defineTopPanel() {
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(createNameTextfieldPanel("id", idField));
		topPanel.add(createNameTextfieldPanel("First Name", firstNameField));
		topPanel.add(createNameTextfieldPanel("Last Name", lastNameField));
		topPanel.add(createNameTextfieldPanel("ssn", ssnField));
	}

	void defineMiddlePanel() {
		middlePanel.add(createNameTextfieldPanel("Street", streetField));
		middlePanel.add(createNameTextfieldPanel("City", cityField));
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		middlePanel.add(createNameTextfieldPanel("State", stateField));
		middlePanel.add(createNameTextfieldPanel("Zip", zipField));
		statusPanel.add(statusLabel);
	}

	void defineBottomPanel() {
		JButton searchButton = new JButton("Search");
		JButton saveButton = new JButton("Save");
		JButton clearButton = new JButton("Clear");
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		bottomPanel.add(searchButton);
		bottomPanel.add(saveButton);
		bottomPanel.add(clearButton);
		searchButton.addActionListener(evt -> {
			SearchForPerson();

		});

		saveButton.addActionListener(evt -> {
              boolean isPersonInserted = insertPerson();
              if(isPersonInserted){
            	  int id = getLastRecordID();
            	  if(0 <= id){
            		  insertAddress(id);
            	  }
              }
		});

		clearButton.addActionListener(evt ->

		{
			idField.setText("");
			firstNameField.setText("");
			lastNameField.setText("");
			ssnField.setText("");
			streetField.setText("");
			cityField.setText("");
			stateField.setText("");
			zipField.setText("");
			statusLabel.setText("");
		});

	}

	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	public static JPanel createNameTextfieldPanel(String name, JTextField textfield) {
		JPanel textPanel = new JPanel();

		JPanel topText = new JPanel();
		JPanel bottomText = new JPanel();
		topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		bottomText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		bottomText.add(textfield);

		JLabel label = new JLabel(name);
		label.setFont(makeSmallFont(label.getFont()));
		topText.add(label);

		textPanel.setLayout(new BorderLayout());
		textPanel.add(topText, BorderLayout.NORTH);
		textPanel.add(bottomText, BorderLayout.CENTER);

		return textPanel;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				AddressForm mf = new AddressForm();
				mf.setVisible(true);
			}
		});
	}

	void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}

	private static final long serialVersionUID = 3618976789175941431L;

	private boolean isNullOrEmpty(String s) {
		if (null == s || s.isEmpty()) {
			return true;
		}
		return false;
	}

	private void SearchForPerson() {
		Connection con;
		try {
			con = cm.getConnection();
			stmt = con.createStatement();
			String id = idField.getText();
			String query = searchQuery + id;
			ResultSet rs = (ResultSet) stmt.executeQuery(query);
			if (null == rs) {
				statusLabel.setText("No records found");
			} else {
				while (rs.next()) {
					firstNameField.setText(rs.getString("FIRSTNAME"));
					lastNameField.setText(rs.getString("LASTNAME"));
					ssnField.setText(rs.getString("SSN"));
					streetField.setText(rs.getString("STREET"));
					cityField.setText(rs.getString("CITY"));
					stateField.setText(rs.getString("STATE"));
					zipField.setText(rs.getString("ZIP"));
					statusLabel.setText("record found");
				}
			}
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	private boolean insertPerson() {
		String firstName = firstNameField.getText();
		String lastName = lastNameField.getText();
		String ssn = ssnField.getText();
		String street = streetField.getText();
		String city = cityField.getText();
		String state = stateField.getText();
		String zip = zipField.getText();
		if (isNullOrEmpty(firstName) || isNullOrEmpty(lastName) || isNullOrEmpty(ssn) || isNullOrEmpty(street)
				|| isNullOrEmpty(city) || isNullOrEmpty(state) || isNullOrEmpty(state)) {
			return false;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(insertPersonQuery).append(firstName).append("','").append(lastName).append("','").append(ssn)
				.append("')");
		Connection con;
		try {
			con = cm.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sb.toString());
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	private int getLastRecordID() {
		int id = -1;
		Connection con;
		try {
			con = cm.getConnection();
			stmt = con.createStatement();
			ResultSet rs = (ResultSet) stmt.executeQuery(selectLastRecord);
			while (rs.next()) {
				id = rs.getInt("ID");
			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return id;
	}

	private boolean insertAddress(int id) {
		if (0 <= id) {
			String street = streetField.getText();
			String city = cityField.getText();
			String state = stateField.getText();
			String zip = zipField.getText();
			StringBuilder addSb = new StringBuilder();
			addSb.append(insertAddressQuery).append(id).append(",'").append(street).append("','").append(city)
					.append("','").append(state).append("','").append(zip).append("')");
			Connection con;
			try {
				con = cm.getConnection();
				stmt = con.createStatement();
				stmt.executeUpdate(addSb.toString());
				stmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
		} else {
			statusLabel.setText("Tp perform a save, all fields except id must be non empty.");
		}
		return true;
	}
}
