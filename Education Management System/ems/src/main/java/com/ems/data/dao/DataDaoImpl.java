package com.ems.data.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ems.data.studentdata;

public class DataDaoImpl  implements DataDao{

	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(studentdata sd) {
		String query="insert into student(id,name,birthdate,shreni,email,password,instituion,address) values(?,?,?,?,?,?,?,?)";
		int r=this.jt.update(query,sd.getId(),sd.getAddress(),sd.getEmail(),sd.getInstituion(),sd.getName(),sd.getShreni(),sd.getBirthdate(),sd.getPassword());
		return r;
	}
	

}
