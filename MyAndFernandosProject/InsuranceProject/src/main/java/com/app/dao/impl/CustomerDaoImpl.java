package com.app.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.models.Customer;
@Repository("customerDao")
public class CustomerDaoImpl implements ICustomerDao {
	
	@Autowired
	private SessionFactory factory;
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
//			tx.begin();
			session.saveOrUpdate(customer);
			tx.commit();
			System.out.println("customer created successfully");
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	@Override
	public void deleteCustomer(String email) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			tx.begin();
			Customer customer = (Customer)session.get(Customer.class, email);
			session.delete(customer);
			tx.commit();
			System.out.println("Customer deleted successfully");
		} catch(Exception ex) {
			System.out.println("operation was cancelled");
			ex.printStackTrace();
			
		} finally {
			session.flush();
			session.close();
		}
	}

	@Override
	public void updateCusomer(String email) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			tx.begin();
			Customer customer = (Customer) session.get(Customer.class, email);
			session.update(customer);
			tx.commit();
			System.out.println("Customer Updated successfully");
		} catch(Exception ex) {
			System.out.println("Customer could not be updated");
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Session session = null;
		Transaction tx = null;
		Customer customer = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			tx.begin();
			customer = (Customer)session.get(Customer.class, email);
			tx.commit();
			System.out.println("Custumer found");
		} catch(Exception ex) {
			System.out.println("Customer could not be found");
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return customer;
	}

	@Override
	public Customer getCustomerById(long id) {
		Session session = null;
		Transaction tx = null;
		Customer customer = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			tx.begin();
			customer = (Customer)session.get(Customer.class, id);
			tx.commit();
			System.out.println("Customer found");
		} catch(Exception ex) {
			System.out.println("customer could not be found");
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Session session = null;
		Transaction tx = null;
		List<Customer> list = null;
		Criteria criteria = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			tx.begin();
			criteria = session.createCriteria(Customer.class);
			list = criteria.list();
			tx.commit();
			System.out.println("All customers found");
		} catch(Exception ex) {
			System.out.println("no customer found");
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return list;
	}

	@Override
	public List<Customer> getActiveCustomers(boolean status) {
		Session session = null;
		Transaction tx = null;
		status = true;
		List<Customer> list = null;
		String sql = "from customer where status = " + status;
		Criteria criteria = null;
		
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			tx.begin();
			criteria = session.createCriteria(Customer.class);
			list =criteria.list();
			tx.commit();
			System.out.println("All active customers found");
		} catch(Exception ex) {
			System.out.println("no active customer found");
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return list;
	}

	@Override
	public List<Customer> getInActiveCustomers(boolean status) {
		Session session = null;
		Transaction tx = null;
		status = false;
		List<Customer> list = null;
		Criteria criteria = null;
		String sql = "from Customer where status= "+ status;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			tx.begin();
			criteria = session.createCriteria(Customer.class, sql);
			list = criteria.list();
			tx.commit();
			System.out.println("All inactive custcomers");
		} catch(Exception ex) {
			System.out.println("no inactive customer found");
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return null;
	}

}
