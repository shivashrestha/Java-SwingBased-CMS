package com.broadways.swingdemo.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.broadways.swingdemo.db.DBConnection;
import com.broadways.swingdemo.models.Student;
import com.broadways.swingdemo.services.StudentService;

public class StudentServiceImpl implements StudentService {
	Connection con=null;
	public StudentServiceImpl(){
		con=DBConnection.getDbcon();
	}

	@Override
	public boolean addStudent(Student s) {
		String sql="insert into student(name,address,phone,college,semester,faculty,roolno,dob,gender) values(?,?,?,"
				+ "?,?,?,?,?,?) ";
		try {
			PreparedStatement pstn=con.prepareStatement(sql);
			pstn.setString(1, s.getName());
			pstn.setString(2, s.getAddress());
			pstn.setString(3, s.getPhone());
			pstn.setString(4, s.getCollege());
			pstn.setString(5, s.getSemester());
			pstn.setString(6, s.getFaculty());
			pstn.setInt(7, s.getRollno());
			pstn.setString(8, s.getDob());
			pstn.setString(9, s.getGender());
			
			pstn.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> getAddStudent() {
		List<Student> slist=new ArrayList<Student>();
		String sql="select * from student ";
		try {
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()){
				Student s=new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setFaculty(rs.getString("faculty"));
				s.setCollege(rs.getString("college"));
				slist.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return slist;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql="delete from student where id='"+id+"'";
		Statement stm;
		try {
			stm = con.createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		
		String sql="update student set name=?,address=?,phone=?,college=?,semester=?,faculty=?,roolno=?,dob=?,gender=? where id=? ";
		try {
			PreparedStatement pstn=con.prepareStatement(sql);
			pstn.setString(1, s.getName());
			pstn.setString(2, s.getAddress());
			pstn.setString(3, s.getPhone());
			pstn.setString(4, s.getCollege());
			pstn.setString(5, s.getSemester());
			pstn.setString(6, s.getFaculty());
			pstn.setInt(7, s.getRollno());
			pstn.setString(8, s.getDob());
			pstn.setString(9, s.getGender());
			pstn.setInt(10, s.getId());
			
			pstn.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return false;
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student s=new Student();
		String sql="select * from student where id='"+id+"'";
		try {
			
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()){
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				s.setCollege(rs.getString("college"));
				s.setPhone(rs.getString("phone"));
				s.setFaculty(rs.getString("faculty"));
				s.setDob(rs.getString("dob"));
				s.setSemester(rs.getString("semester"));
				s.setGender(rs.getString("gender"));
				s.setRollno(rs.getInt("roolno"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}
	

}
