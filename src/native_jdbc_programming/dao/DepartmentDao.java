package native_jdbc_programming.dao;

import java.util.List;

import native_jdbc_programming.dto.Department;

public interface DepartmentDao { // ctrl 키 누르고 마우스 갖다대면 두가지 선택지 뜸
	List<Department> selectDepartmentByAll();
	Department selectDepartmentByNo(Department Department);
	
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	int deleteDepartment(int deptNo);
}
