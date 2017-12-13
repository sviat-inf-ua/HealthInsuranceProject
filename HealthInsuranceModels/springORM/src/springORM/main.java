package springORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		IEmployeeDao Ip = (IEmployeeDao)app.getBean("empDao");
		Employee p = new Employee(123, "fernando", 2123.231);
		int r = Ip.createEmployee(p);
		System.out.println(r);
		
		System.out.println(Ip.getAllEmployees());
	}

}
