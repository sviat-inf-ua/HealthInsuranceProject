package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.DoctorDao;
import entity.Doctor;

@Repository
public class DoctorDaoImpl implements DoctorDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session currentSession = sessionFactory.getCurrentSession();

	public List<Doctor> getAll() {
		
		Query<Doctor> theQuery = 
		currentSession.createQuery("from Doctor order by lastName",
									Doctor.class);
		List<Doctor> doctors = theQuery.getResultList();
		return doctors;
	}

	public void save(Doctor entity) {
		
		currentSession.saveOrUpdate(entity);
		
	}

	public Doctor findOne(Integer id) {

		Doctor theDoctor = currentSession.get(Doctor.class, id);
		return theDoctor;
	}

	public void delete(Integer id) {

		Query theQuery = currentSession.createQuery("delete from doctor where id=:doctorId");
		theQuery.setParameter("doctorId", id);
		theQuery.executeUpdate();
	}
}
