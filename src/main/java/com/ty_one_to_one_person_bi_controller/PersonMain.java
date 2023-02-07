package com.ty_one_to_one_person_bi_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty_one_to_one_person_bi_dto.AdharCard;
import com.ty_one_to_one_person_bi_dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		
		Person person=new Person();
		AdharCard adharCard=new AdharCard();
		
		person.setPerson_id(3);
		person.setName("raju");
		person.setAddress("hsn");
		person.setPhone(9294797);
		
		adharCard.setAdhar_id(113);
		adharCard.setName("Raju.a");
		adharCard.setAddress("Hassan");
		
		person.setAdharCard(adharCard);
		adharCard.setPerson(person);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		entityTransaction.begin();
//		
//		entityManager.persist(person);
//		entityManager.persist(adharCard);
//		
//		entityTransaction.commit();
		
		//we get stackoverflow remove anyone side to string method adhar or persn 
//		Person person =entityManager.find(Person.class, 1);
//		System.out.println(person);
		
		 
	
				
	}
}
