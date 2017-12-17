package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.LocationDao;
import entity.Location;

@Repository
public class LocationDaoImpl implements LocationDao {

	@Autowired
	SessionFactory sessionFactory;
	Session currentSession = sessionFactory.getCurrentSession();

	public List<Location> getAll() {
		Query<Location> theQuery = currentSession.createQuery("from location", Location.class);
		List<Location> locations = theQuery.getResultList();
		return locations;
	}

	public void save(Location entity) {
		currentSession.saveOrUpdate(entity);
	}

	public Location findOne(Integer id) {

		Location theLocation = currentSession.get(Location.class, id);
		return theLocation;
	}

	public void delete(Integer id) {
		Query theQuery = currentSession.createQuery("delete from location where id=:locationId");
		theQuery.setParameter("locationId", id);
		theQuery.executeUpdate();
	}
}
