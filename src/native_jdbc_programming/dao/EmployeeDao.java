package native_jdbc_programming.dao;

import java.util.List;

import native_jdbc_programming.dto.Employee;

public interface EmployeeDao {
	
	List<Employee> selectEmployeeByAll();
	Employee selectEmployeeByNo(Employee emp);
	
	int insertEmployee(Employee employee);	
	int updateEmployee(Employee employee);	
	int deleteEmployee(Employee employee);
	



}
