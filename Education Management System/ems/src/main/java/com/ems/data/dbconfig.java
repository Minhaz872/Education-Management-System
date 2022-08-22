package com.ems.data;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.ems.data.dao.DataDao;
import com.ems.data.dao.DataDaoImpl;

@Configuration
public class dbconfig {
	
	@Bean("ds")
	public DataSource  getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate(){
		
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(getDataSource());
		
		return jt;
		
	}
	
	@Bean("datadao")
	public DataDao getData() {
		DataDaoImpl dd=new DataDaoImpl();
		dd.setJt(getTemplate());
		
		return dd;
		
	}
	

}
