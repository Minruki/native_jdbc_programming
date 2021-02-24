package native_jdbc_programming.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import native_jdbc_programming.dao.impl.EmployeeDaoImpl;
import native_jdbc_programming.dao.impl.TitleDaoImpl;
import native_jdbc_programming.dto.Department;
import native_jdbc_programming.dto.Employee;
import native_jdbc_programming.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployeeDaoTest {
	private static EmployeeDao dao = EmployeeDaoImpl.getInstance();

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01SelectEmployeeByAll() {
		System.out.printf("%s()%n", "testSelectEmployeeByAll");
		List<Employee> employeeList = dao.selectEmployeeByAll();
		Assert.assertNotNull(employeeList);
		
		for(Employee t : employeeList) {
			System.out.println(t);
		}
		
	}

	@Test
	public void test02SelectEmployeeByNo() {
		Employee employee = new Employee(3427);
		Employee searchEmployee = dao.selectEmployeeByNo(employee);
		Assert.assertNotNull(searchEmployee);
		System.out.println(dao.selectEmployeeByNo(employee));
	}

	@Test
	public void test03InsertEmployee() {
		System.out.printf("%s()%n", "testInsertEmployee");
		Employee newEmployee = new Employee(1004, "천사", new Title(3), new Employee(4377), 3000000, new Department(3));
		int res = dao.insertEmployee(newEmployee);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectEmployeeByNo(newEmployee));
	}

	@Test
	public void test04UpdateEmployee() {
		System.out.printf("%s()%n", "testUpdateEmployee");
		Employee newEmployee = new Employee(1004, "천사2", new Title(3), new Employee(4377), 3000000, new Department(3));
		//update employee set empname = 1004, title_no = '천사', salary =3, dept =1003 where empno = 3000000
		
		int res = dao.updateEmployee(newEmployee);
		Assert.assertEquals(1, res);
		
	}

	@Test
	public void test05DeleteEmployee() {
		System.out.printf("%s()%n", "testDeletEmployee");
		Employee newEmployee = new Employee(1004);
		int res = dao.deleteEmployee(newEmployee);
		Assert.assertEquals(1, res);
		dao.selectEmployeeByAll().stream().forEach(System.out::println);
	}

}
