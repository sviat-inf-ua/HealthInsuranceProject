package springORM;

import java.util.List;

public interface IEmployeeDao {
	public Integer createEmployee(Employee emp);
	public Integer updateEmployee(Employee emp);
	public Integer deleteEmployee(Integer empId);
	public Employee loadEmployee(Integer empId);
	public List<Employee> getAllEmployees();
}
