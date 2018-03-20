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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.broadways.swingdemo.models.Student;
import com.broadways.swingdemo.serviceImpl.StudentServiceImpl;
import com.broadways.swingdemo.services.StudentService;

import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class FrameBody extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblName;
	private JTextField nameField;
	private JLabel lblBirthdate;
	private JComboBox dd;
	private JComboBox mm;
	private JComboBox yyyy;
	private JLabel lblRollno;
	private JTextField rollnoField;
	private JLabel lblFaculty;
	private JTextField facultyField;
	private JLabel lblSemester;
	private JTextField semesterField;
	private JLabel lblCollegename;
	private JTextField collegenameField;
	private JLabel lblAddress;
	private JTextField addressField;
	private JLabel lblPhoneno;
	private JTextField phonenoField;
	private JLabel lblGender;
	private JRadioButton maleBtn;
	private JRadioButton femaleBtn;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnSave;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnBack;
	private JButton btnViewDetails;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBody frame = new FrameBody();
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
	public FrameBody() {
		setTitle("Student Management Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnBack());
		contentPane.add(getBtnViewDetails());
		contentPane.add(getBtnEdit());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnExit());

		populateData();
		setVisible(true);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Input Form", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 30, 649, 163);
			panel.setToolTipText("Student Form");
			panel.setLayout(null);
			panel.add(getLblName());
			panel.add(getNameField());
			panel.add(getLblBirthdate());
			panel.add(getDd());
			panel.add(getMm());
			panel.add(getYyyy());
			panel.add(getLblRollno());
			panel.add(getRollnoField());
			panel.add(getLblFaculty());
			panel.add(getFacultyField());
			panel.add(getLblSemester());
			panel.add(getSemesterField());
			panel.add(getLblCollegename());
			panel.add(getCollegenameField());
			panel.add(getLblAddress());
			panel.add(getAddressField());
			panel.add(getLblPhoneno());
			panel.add(getPhonenoField());
			panel.add(getLblGender());
			panel.add(getMaleBtn());
			panel.add(getFemaleBtn());
			panel.add(getBtnSave());
		}
		return panel;
	}

	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(10, 24, 49, 14);
		}
		return lblName;
	}

	private JTextField getNameField() {
		if (nameField == null) {
			nameField = new JTextField();
			nameField.setBounds(69, 21, 108, 20);
			nameField.setColumns(10);
		}
		return nameField;
	}

	private JLabel getLblBirthdate() {
		if (lblBirthdate == null) {
			lblBirthdate = new JLabel("BirthDate");
			lblBirthdate.setBounds(189, 24, 56, 14);
		}
		return lblBirthdate;
	}

	private JComboBox getDd() {
		if (dd == null) {
			dd = new JComboBox();
			dd.setToolTipText("DD");
			dd.setModel(new DefaultComboBoxModel(new String[] { "DD" }));
			for (int i = 1; i <= 32; i++) {
				dd.addItem(i);
			}
			dd.setBounds(255, 21, 42, 20);
		}
		return dd;
	}

	private JComboBox getMm() {
		if (mm == null) {
			mm = new JComboBox();
			mm.setModel(new DefaultComboBoxModel(new String[] { "MM" }));
			for (int i = 1; i <= 12; i++) {
				mm.addItem(i);
			}
			mm.setBounds(307, 21, 59, 20);
		}
		return mm;
	}

	private JComboBox getYyyy() {
		if (yyyy == null) {
			yyyy = new JComboBox();
			yyyy.setModel(new DefaultComboBoxModel(new String[] { "YYYY" }));
			for (int i = 1960; i <= 2017; i++) {
				yyyy.addItem(i);
			}
			yyyy.setBounds(376, 21, 57, 20);
		}
		return yyyy;
	}

	private JLabel getLblRollno() {
		if (lblRollno == null) {
			lblRollno = new JLabel("RollNo");
			lblRollno.setBounds(443, 24, 49, 14);
		}
		return lblRollno;
	}

	private JTextField getRollnoField() {
		if (rollnoField == null) {
			rollnoField = new JTextField();
			rollnoField.setBounds(502, 21, 108, 20);
			rollnoField.setColumns(10);
		}
		return rollnoField;
	}

	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(10, 59, 46, 14);
		}
		return lblFaculty;
	}

	private JTextField getFacultyField() {
		if (facultyField == null) {
			facultyField = new JTextField();
			facultyField.setBounds(67, 52, 108, 20);
			facultyField.setColumns(10);
		}
		return facultyField;
	}

	private JLabel getLblSemester() {
		if (lblSemester == null) {
			lblSemester = new JLabel("Semester");
			lblSemester.setBounds(185, 59, 70, 14);
		}
		return lblSemester;
	}

	private JTextField getSemesterField() {
		if (semesterField == null) {
			semesterField = new JTextField();
			semesterField.setBounds(276, 56, 108, 20);
			semesterField.setColumns(10);
		}
		return semesterField;
	}

	private JLabel getLblCollegename() {
		if (lblCollegename == null) {
			lblCollegename = new JLabel("CollegeName");
			lblCollegename.setBounds(406, 59, 86, 14);
		}
		return lblCollegename;
	}

	private JTextField getCollegenameField() {
		if (collegenameField == null) {
			collegenameField = new JTextField();
			collegenameField.setBounds(502, 52, 108, 20);
			collegenameField.setColumns(10);
		}
		return collegenameField;
	}

	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(10, 95, 56, 14);
		}
		return lblAddress;
	}

	private JTextField getAddressField() {
		if (addressField == null) {
			addressField = new JTextField();
			addressField.setBounds(67, 92, 108, 20);
			addressField.setColumns(10);
		}
		return addressField;
	}

	private JLabel getLblPhoneno() {
		if (lblPhoneno == null) {
			lblPhoneno = new JLabel("PhoneNo");
			lblPhoneno.setBounds(185, 95, 56, 14);
		}
		return lblPhoneno;
	}

	private JTextField getPhonenoField() {
		if (phonenoField == null) {
			phonenoField = new JTextField();
			phonenoField.setBounds(274, 92, 110, 20);
			phonenoField.setColumns(10);
		}
		return phonenoField;
	}

	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(421, 95, 55, 14);
		}
		return lblGender;
	}

	private JRadioButton getMaleBtn() {
		if (maleBtn == null) {
			maleBtn = new JRadioButton("Male");
			buttonGroup.add(maleBtn);
			maleBtn.setBounds(482, 91, 56, 23);
		}
		return maleBtn;
	}

	private JRadioButton getFemaleBtn() {
		if (femaleBtn == null) {
			femaleBtn = new JRadioButton("Female");
			buttonGroup.add(femaleBtn);
			femaleBtn.setBounds(540, 91, 70, 23);
		}
		return femaleBtn;
	}

	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student s = new Student();
					s.setName(nameField.getText());
					s.setAddress(addressField.getText());
					s.setCollege(collegenameField.getText());
					s.setFaculty(facultyField.getText());
					s.setPhone(phonenoField.getText());
					s.setSemester(semesterField.getText());
					if (maleBtn.isSelected()) {
						s.setGender("Male");
					} else {
						s.setGender("Female");
					}
					s.setRollno(Integer.parseInt(rollnoField.getText())); // changing
																			// String
																			// to
																			// int
					String day = dd.getSelectedItem().toString();
					String month = mm.getSelectedItem().toString();
					String year = yyyy.getSelectedItem().toString();
					String dob = day.concat("-").concat(month).concat("-").concat(year);
					s.setDob(dob);
					StudentServiceImpl ss = new StudentServiceImpl();
					if (ss.addStudent(s)) {
						JOptionPane.showMessageDialog(null, "added sucessfully");
						populateData();
					}
				}
			});
			btnSave.setBounds(241, 129, 89, 23);
		}
		return btnSave;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 216, 649, 153);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(
					new DefaultTableModel(new Object[][] {}, new String[] { "Id", "Name", "Faculty", "College Name" }));
		}
		return table;
	}

	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setBounds(56, 386, 89, 23);
		}
		return btnBack;
	}

	private JButton getBtnViewDetails() {
		if (btnViewDetails == null) {
			btnViewDetails = new JButton("View Details");
			btnViewDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please select any row");
						return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);//**********
					new ViewForm().displayData(id);
					dispose();
					
				}
			});
			btnViewDetails.setBounds(155, 386, 119, 23);
		}
		return btnViewDetails;
	}

	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("Edit");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please select any row");
						return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);//**********
					new EditOnFrame().displayData(id);
					dispose();
					
				}
			});
			btnEdit.setBounds(299, 386, 89, 23);
		}
		return btnEdit;
	}

	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please select any row");
						return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					StudentService ss = new StudentServiceImpl();
					if (ss.deleteStudent(id)) {
						JOptionPane.showMessageDialog(null, "deleted sucessfully");
						populateData();
					}

				}
			});
			btnDelete.setBounds(423, 386, 89, 23);
		}
		return btnDelete;
	}

	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnExit.setBounds(541, 386, 89, 23);
		}
		return btnExit;
	}

	private void populateData() {
		StudentService ss = new StudentServiceImpl();
		List<Student> slist = ss.getAddStudent();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for (Student s : slist) {
			model.addRow(new Object[] { s.getId(), s.getName(), s.getFaculty(), s.getCollege() });

		}

	}
}
