package com.ty_one_to_one_person_bi_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty_one_to_one_person_bi_dto.AdharCard;
import com.ty_one_to_one_person_bi_dto.Person;

public class PersonDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	
	//save 
	public void savePerson(Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	//update
	public void updateAdhar(Person person, int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person rcvPerson=entityManager.find(Person.class, id);
		rcvPerson.setPerson_id(id);
		entityTransaction.begin();
		entityManager.merge(rcvPerson);
		entityTransaction.commit();
		
	}
	
	//remove
	public void removePerson(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class, id);
		person.setPerson_id(id);
		if(person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		}
		else
			System.out.println("invalid");
		
	}
	
	//getone
	public void getOnePerson(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class, id);
		System.out.println(person);
	}
	
	//getAll
	public List<Person> getAllPerson(){
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query=entityManager.createQuery("select e from Person e");
		List<Person>list=query.getResultList();
		return list;
	}
	
}
