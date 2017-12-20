package com.app.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
<<<<<<< HEAD
=======
import org.hibernate.Query;
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.models.Customer;
<<<<<<< HEAD
=======
import com.app.models.InsurancePlan;
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
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
//			session.flush();
			session.close();
		}
	}

	@Override
	public void deleteCustomer(String email) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
<<<<<<< HEAD
		String sql = "from customer where email = "+ email;
		Criteria criteria = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			criteria = session.createCriteria(Customer.class, sql);
//			tx.begin();
			Customer customer = (Customer) criteria.uniqueResult();
			session.delete(customer);
			tx.commit();
			System.out.println("Customer deleted successfully");
=======
		String sql = "from Customer where email = :email";
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			query.setParameter("email", email);
			Customer customer = (Customer) query.uniqueResult();
			session.delete(customer);
			tx.commit();
			System.out.println("Customer deleted successfully");
			session.flush();
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
		} catch(Exception ex) {
			System.out.println("operation was cancelled");
			ex.printStackTrace();
			
		} finally {
<<<<<<< HEAD
			session.flush();
=======
			
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
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
//			tx.begin();
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
<<<<<<< HEAD
		String sql = "from customer where status = " + email;
		Criteria criteria = null;
=======
		String sql = "from Customer where email = :email";
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
		Customer customer = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
//			tx.begin();
<<<<<<< HEAD
			criteria = session.createCriteria(Customer.class, sql);
			customer = (Customer) criteria.uniqueResult();
=======
			Query query = session.createQuery(sql);
			query.setParameter("email", email);
			customer = (Customer) query.uniqueResult();
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
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
//			tx.begin();
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
<<<<<<< HEAD
		Criteria criteria = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
//			tx.begin();
			criteria = session.createCriteria(Customer.class);
			list = criteria.list();
			tx.commit();
			System.out.println("All customers found");
=======
		String sql = "from Customer";
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			list = query.list();
			tx.commit();
			System.out.println("All customers found");
			session.flush();
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
		} catch(Exception ex) {
			System.out.println("no customer found");
			ex.printStackTrace();
		} finally {
<<<<<<< HEAD
			session.flush();
=======
			
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
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
<<<<<<< HEAD
		String sql = "from customer where status = " + status;
		Criteria criteria = null;
		
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
//			tx.begin();
			criteria = session.createCriteria(Customer.class);
			list =criteria.list();
			tx.commit();
			System.out.println("All active customers found");
=======
		String sql = "from Customer where status =  :status";
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			query.setParameter("status", status);
			list = query.list();
			tx.commit();
			System.out.println("All active customers found");
			session.flush();
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
		} catch(Exception ex) {
			System.out.println("no active customer found");
			ex.printStackTrace();
		} finally {
<<<<<<< HEAD
			session.flush();
=======
			
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
			session.close();
		}
		return list;
	}

	@Override
	public List<Customer> getInActiveCustomers(boolean status) {
		Session session = null;
		Transaction tx = null;
<<<<<<< HEAD
		status = false;
		List<Customer> list = null;
		Criteria criteria = null;
		String sql = "from Customer where status= "+ status;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
//			tx.begin();
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
=======
		status = true;
		List<Customer> list = null;
		String sql = "from Customer where status =  :status";
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			query.setParameter("status", status);
			list = query.list();
			tx.commit();
			System.out.println("All active customers found");
			session.flush();
		} catch(Exception ex) {
			System.out.println("no active customer found");
			ex.printStackTrace();
		} finally {
			
			session.close();
		}
		return list;
	}

	@Override
	public void addPlan(InsurancePlan plan, Customer customer) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			customer.setPlan(plan);
			session.update(customer);
			tx.commit();
			session.flush();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
	}

}
