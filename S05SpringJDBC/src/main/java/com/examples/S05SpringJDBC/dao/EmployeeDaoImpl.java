package com.examples.S05SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S05SpringJDBC.entity.Employee;
import com.examples.S05SpringJDBC.rowmapper.EmployeeRowMapper;

@Component("employeedao")
public class EmployeeDaoImpl implements EmployeeDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;//connection
	
	@Override
	public int create(Employee employee) {
		
		//insert statement
		String sql = "insert into employee values (?,?,?)";
		//execute the statement
		int result =jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(),employee.getLastName());
		
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "Select * from employee where id=?";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, employeeRowMapper,id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "Select * from employee";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query(sql, employeeRowMapper);
		return employees;
		
	}

}
