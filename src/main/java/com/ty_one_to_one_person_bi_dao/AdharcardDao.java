package com.ty_one_to_one_person_bi_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty_one_to_one_person_bi_dto.AdharCard;

public class AdharcardDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	
	//save 
	public void saveAdhar(AdharCard adharCard) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(adharCard);
		entityTransaction.commit();
	}
	
	//update
	public void updateAdhar(AdharCard adharCard, int adhar_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		AdharCard rcvAdhar=entityManager.find(AdharCard.class, adhar_id);
		rcvAdhar.setAdhar_id(adhar_id);
		entityTransaction.begin();
		entityManager.merge(rcvAdhar);
		entityTransaction.commit();
		
	}
	
	//remove
	public void removeAdhar(int adhar_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		AdharCard adhar=entityManager.find(AdharCard.class, adhar_id);
		adhar.setAdhar_id(adhar_id);
		if(adhar!=null) {
			entityTransaction.begin();
			entityManager.remove(adhar);
			entityTransaction.commit();
		}
		else
			System.out.println("invalid");
		
	}
	
	//getone
	public void getOneAdhar(int adhar_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		AdharCard adhar=entityManager.find(AdharCard.class, adhar_id);
		System.out.println(adhar);
	}
	
	//getAll
	public List<AdharCard> getAllAdhar(){
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query=entityManager.createQuery("select e from AdharCard e");
		List<AdharCard>list=query.getResultList();
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
