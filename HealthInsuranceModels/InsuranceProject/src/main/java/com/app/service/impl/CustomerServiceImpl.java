package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDao;
import com.app.models.Customer;
<<<<<<< HEAD
=======
import com.app.models.InsurancePlan;
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
import com.app.service.ICustomerService;
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao customerDao;

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			customerDao.createCustomer(customer);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteCustomer(String email) {
		// TODO Auto-generated method stub
		try {
			customerDao.deleteCustomer(email);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void updateCusomer(String email) {
		// TODO Auto-generated method stub
		try {
		customerDao.updateCusomer(email);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		Customer customer =null;
		try {
		customer = customerDao.getCustomerByEmail(email);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return customer;
	}

	@Override
	public Customer getCustomerById(long id) {
		
		Customer customer = null;
		try {
			customer = customerDao.getCustomerById(id);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list = null;
		try {
			list = customerDao.getAllCustomers();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Customer> getActiveCustomers(boolean status) {
		List<Customer> list = null;
		try {
			list = customerDao.getActiveCustomers(status);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Customer> getInActiveCustomers(boolean status) {
		List<Customer> list = null;
		try {
			list = customerDao.getInActiveCustomers(status);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

<<<<<<< HEAD
=======
	@Override
	public void addPlan(InsurancePlan plan, Customer customer) {
		try {
			customerDao.addPlan(plan, customer);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
}
