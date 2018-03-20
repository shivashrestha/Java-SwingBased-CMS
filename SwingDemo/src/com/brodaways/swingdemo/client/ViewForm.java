package com.brodaways.swingdemo.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;

import com.broadways.swingdemo.models.Student;
import com.broadways.swingdemo.serviceImpl.StudentServiceImpl;
import com.broadways.swingdemo.services.StudentService;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class ViewForm extends JFrame {

	private JPanel contentPane;
	private JPanel phonenoField;
	private JLabel lblName;
	private JTextField nameField;
	private JLabel lblCollege;
	private JTextField collegeField;
	private JLabel lblAddress;
	private JTextField addressField;
	private JLabel lblPhoneno;
	private JTextField phoneField;
	private JLabel lblNewLabel;
	private JTextField facultyField;
	private JLabel lblSemester;
	private JTextField semesterField;
	private JLabel lblRollno;
	private JTextField rollnoField;
	private JLabel lblBirthdate;
	private JLabel lblGender;
	private JButton btnUpdate;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField dobField;
	private JTextField genderField;
	int uid=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewForm frame = new ViewForm();
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
	public ViewForm() {
		setTitle("View Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPhonenoField());
		setVisible(true);
	}
	private JPanel getPhonenoField() {
		if (phonenoField == null) {
			phonenoField = new JPanel();
			phonenoField.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			phonenoField.setBounds(22, 21, 485, 380);
			phonenoField.setLayout(null);
			phonenoField.add(getLblName());
			phonenoField.add(getNameField());
			phonenoField.add(getLblCollege());
			phonenoField.add(getCollegeField());
			phonenoField.add(getLblAddress());
			phonenoField.add(getAddressField());
			phonenoField.add(getLblPhoneno());
			phonenoField.add(getPhoneField());
			phonenoField.add(getLblNewLabel());
			phonenoField.add(getFacultyField());
			phonenoField.add(getLblSemester());
			phonenoField.add(getSemesterField());
			phonenoField.add(getLblRollno());
			phonenoField.add(getRollnoField());
			phonenoField.add(getLblBirthdate());
			phonenoField.add(getLblGender());
			phonenoField.add(getBtnUpdate());
			phonenoField.add(getDobField());
			phonenoField.add(getGenderField());
		}
		return phonenoField;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(21, 41, 46, 14);
		}
		return lblName;
	}
	private JTextField getNameField() {
		if (nameField == null) {
			nameField = new JTextField();
			nameField.setEnabled(false);
			nameField.setBounds(122, 38, 86, 20);
			nameField.setColumns(10);
		}
		return nameField;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setBounds(21, 78, 46, 14);
		}
		return lblCollege;
	}
	private JTextField getCollegeField() {
		if (collegeField == null) {
			collegeField = new JTextField();
			collegeField.setEnabled(false);
			collegeField.setBounds(122, 69, 86, 20);
			collegeField.setColumns(10);
		}
		return collegeField;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(21, 111, 63, 14);
		}
		return lblAddress;
	}
	private JTextField getAddressField() {
		if (addressField == null) {
			addressField = new JTextField();
			addressField.setEnabled(false);
			addressField.setBounds(122, 108, 86, 20);
			addressField.setColumns(10);
		}
		return addressField;
	}
	private JLabel getLblPhoneno() {
		if (lblPhoneno == null) {
			lblPhoneno = new JLabel("PhoneNo");
			lblPhoneno.setBounds(21, 147, 63, 14);
		}
		return lblPhoneno;
	}
	private JTextField getPhoneField() {
		if (phoneField == null) {
			phoneField = new JTextField();
			phoneField.setEnabled(false);
			phoneField.setBounds(122, 144, 86, 20);
			phoneField.setColumns(10);
		}
		return phoneField;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Faculty");
			lblNewLabel.setBounds(21, 184, 46, 14);
		}
		return lblNewLabel;
	}
	private JTextField getFacultyField() {
		if (facultyField == null) {
			facultyField = new JTextField();
			facultyField.setEnabled(false);
			facultyField.setBounds(122, 175, 86, 20);
			facultyField.setColumns(10);
		}
		return facultyField;
	}
	private JLabel getLblSemester() {
		if (lblSemester == null) {
			lblSemester = new JLabel("Semester");
			lblSemester.setBounds(21, 215, 63, 14);
		}
		return lblSemester;
	}
	private JTextField getSemesterField() {
		if (semesterField == null) {
			semesterField = new JTextField();
			semesterField.setEnabled(false);
			semesterField.setBounds(122, 212, 86, 20);
			semesterField.setColumns(10);
		}
		return semesterField;
	}
	private JLabel getLblRollno() {
		if (lblRollno == null) {
			lblRollno = new JLabel("RollNo");
			lblRollno.setBounds(21, 242, 46, 14);
		}
		return lblRollno;
	}
	private JTextField getRollnoField() {
		if (rollnoField == null) {
			rollnoField = new JTextField();
			rollnoField.setEnabled(false);
			rollnoField.setBounds(122, 239, 86, 20);
			rollnoField.setColumns(10);
		}
		return rollnoField;
	}
	private JLabel getLblBirthdate() {
		if (lblBirthdate == null) {
			lblBirthdate = new JLabel("BirthDate");
			lblBirthdate.setBounds(21, 275, 63, 14);
		}
		return lblBirthdate;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(21, 311, 46, 14);
		}
		return lblGender;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Back");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				 
						new FrameBody();
						dispose();
					 
				}
			});
			btnUpdate.setBounds(147, 346, 89, 23);
		}
		return btnUpdate;
	}
	private JTextField getDobField() {
		if (dobField == null) {
			dobField = new JTextField();
			dobField.setEnabled(false);
			dobField.setBounds(126, 269, 86, 20);
			dobField.setColumns(10);
		}
		return dobField;
	}
	
	private JTextField getGenderField() {
		if (genderField == null) {
			genderField = new JTextField();
			genderField.setEnabled(false);
			genderField.setBounds(122, 308, 86, 20);
			genderField.setColumns(10);
		}
		return genderField;
	}
public void displayData(int id){
	
	uid = id;
	
		StudentService ss=new StudentServiceImpl();
		Student s=ss.getById(id);
		
		nameField.setText(s.getName());
		addressField.setText(s.getAddress());
		facultyField.setText(s.getFaculty());
		semesterField.setText(s.getSemester());
		collegeField.setText(s.getCollege());
	    phoneField.setText(s.getPhone());
	    dobField.setText(s.getDob());
	    genderField.setText(s.getGender());
	    rollnoField.setText(new Integer(s.getRollno()).toString());
		
		
	}

}
