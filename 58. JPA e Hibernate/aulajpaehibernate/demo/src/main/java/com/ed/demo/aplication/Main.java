package com.ed.demo.aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ed.demo.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = factory.createEntityManager();

		Pessoa p = em.find(Pessoa.class, 2);

		System.out.println(p);

		em.close();
		factory.close();

	}

}
