package com.app.service;

import java.util.List;

import com.app.models.Customer;
<<<<<<< HEAD
=======
import com.app.models.InsurancePlan;
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2

public interface ICustomerService {
	public void createCustomer(Customer customer);
	public void deleteCustomer(String email);
	public void updateCusomer(String email);
	public Customer getCustomerByEmail(String email);
	public Customer getCustomerById(long id);
	public List<Customer> getAllCustomers();
	public List<Customer> getActiveCustomers(boolean status);
	public List<Customer> getInActiveCustomers(boolean status);
<<<<<<< HEAD
=======
	public void addPlan(InsurancePlan plan, Customer customer);
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
}
