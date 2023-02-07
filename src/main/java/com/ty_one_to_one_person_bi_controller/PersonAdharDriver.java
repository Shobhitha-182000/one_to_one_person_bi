package com.ty_one_to_one_person_bi_controller;

import java.util.Scanner;

import com.ty_one_to_one_person_bi_dao.AdharcardDao;
import com.ty_one_to_one_person_bi_dao.PersonDao;
import com.ty_one_to_one_person_bi_dto.AdharCard;
import com.ty_one_to_one_person_bi_dto.Person;

public class PersonAdharDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Person person=new Person();
		AdharCard adharCard=new AdharCard();
		PersonDao personDao=new PersonDao();
		AdharcardDao adharcardDao=new AdharcardDao();
		
		boolean exit=true;
		
		do {
			System.out.println("do you want 1.save person \n 2.add language \n 3.update person \n 4.remove person \n 5.getone \n 6.get all \n 7.exit");
			System.out.println("choose any of one");
			int choose=scanner.nextInt();
		 
			switch (choose) {
			case 1:{
				System.out.println("enter the id");
				int id=scanner.nextInt();
				
				System.out.println("enter the  name");
				String name=scanner.next();
				
				System.out.println("enter the phone");
				long phone=scanner.nextLong();
				
				System.out.println("enter the address");
				String address=scanner.next();
				
				 
				person.setPerson_id(id);
				person.setName(name);
				person.setAddress(address);
				person.setPhone(phone);
			 
				
				System.out.println("enter the adhar id");
				int adhar_id=scanner.nextInt();
				
				System.out.println("enter the  name");
				String adhar_name=scanner.next();
				
				System.out.println("enter the address");
				String adhar_address=scanner.next();
				
				adharCard.setAdhar_id(adhar_id);
				adharCard.setName(adhar_name);
				adharCard.setAddress(adhar_address);
				
				adharCard.setPerson(person);
				person.setAdharCard(adharCard);
				
				personDao.savePerson(person);
				
				
			}break;

			default:
				break;
			}
			
		}while(exit);
	}
}
