package dao;

import java.util.List;

public interface CrudDao<E, ID> {

	 List<E> getAll();

	 void save(E entity);

	 E findOne(ID id);

	 void delete(ID id);

}
