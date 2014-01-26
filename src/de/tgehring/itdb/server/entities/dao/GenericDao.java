package de.tgehring.itdb.server.entities.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;

public class GenericDao<T> {
	
	private EntityManager em;
	private Class<T> type;
	
	public GenericDao(EntityManager em) {
		this.em = em;
		Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
	}
	
	public void create(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}
	
	public T findOne(long id) {
		em.getTransaction().begin();
		T entity = em.find(type, id);
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		return entity;
	}
	
	public List<T> findAll() {
		em.getTransaction().begin();
		List<T> entities = em.createNamedQuery(type.getName() + ".findAll").getResultList();
		em.getTransaction().commit();
		em.close();
		return entities;
	}
	
	public void update(T entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(long id) {
		em.getTransaction().begin();
		T entity = em.find(type, id);
		em.remove(entity);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
		em.close();
	}
}
