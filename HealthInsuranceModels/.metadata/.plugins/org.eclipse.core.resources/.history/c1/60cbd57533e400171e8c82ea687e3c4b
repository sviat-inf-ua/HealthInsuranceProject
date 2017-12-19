package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LocationDao;
import com.entity.Location;
import com.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationDao locationDao;

	public List<Location> getAll() {
		return locationDao.getAll();
	}

	public void save(Location entity) {
		locationDao.save(entity);
	}

	public Location findOne(Integer id) {
		return locationDao.findOne(id);
	}

	public void delete(Integer id) {
		locationDao.delete(id);
	}
}
