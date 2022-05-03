package com.jdbc_spring;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class StudentDAO {

	private String drvr;
	private String url;
	private String userName;
	private String pwd;
	private Connection connection;
	private String sqlQ;
	private StudentDAO studentDAO;
	private String name;
	private int num;

	
	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	@Value("${StudentDAO.name}")
	public void setName(String name) {
		this.name = name;
	}

	@Value("${StudentDAO.num}")
	public void setNum(int num) {
		this.num = num;
	}

	@Value("${StudentDAO.drvr}")
	public void setDrvr(String drvr) {
		this.drvr = drvr;
	}

	@Value("${StudentDAO.url}")
	public void setUrl(String url) {
		this.url = url;
	}

	@Value("${StudentDAO.userName}")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Value("${StudentDAO.pwd}")
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Value("${StudentDAO.sql}")
	public void setSqlQ(String sqlQ) {
		this.sqlQ = sqlQ;
	}
	public String getSqlQ() {
		return sqlQ;
	}
	
	@Autowired
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	


	

	/**
	 * now im doing the properties file literal injection bean life cycle management
	 * by using annotations
	 * @throws SQLException 
	 * 
	 */

	// init method


	
	public void init() throws SQLException {
		try {
			Class.forName(drvr);
			this.connection = DriverManager.getConnection(url,userName,pwd);
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("Driver and connection sucessfully...... activated");
		}
	}
	
	
	// this is the implementaton of the jdbc conncetion and excuted quary
	public void updateSql() {
		try {
			PreparedStatement prpsmt = connection.prepareStatement(sqlQ);
			prpsmt.setString(1, getName());
			prpsmt.setInt(2, getNum());
			int i = prpsmt.executeUpdate();
			while(i>0) {
				System.out.println("Update the table is succesfully happy coding mr.yogesh joga");
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

	public void destroy() throws SQLException {
		this.connection.close();
	}

	





	
	
	

}
