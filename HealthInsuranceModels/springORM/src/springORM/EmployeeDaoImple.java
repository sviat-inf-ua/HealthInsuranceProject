package springORM;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDaoImple implements IEmployeeDao {
	
	
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public Integer createEmployee(Employee emp) {
		int rs = (int) template.save(emp);
		return rs;
	}

	@Override
	public Integer updateEmployee(Employee emp) {
		template.update(emp);
		return emp.getId();
	}

	@Override
	public Integer deleteEmployee(Integer empId) {
		Employee p = template.get(Employee.class, empId);
		if(p != null)
		template.delete(empId);
		
		return p.getId();
	}

	@Override
	public Employee loadEmployee(Integer empId) {
		Employee p = template.get(Employee.class, empId);
		return p;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return template.loadAll(Employee.class);
	}

}
