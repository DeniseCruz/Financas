package br.com.denise.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financasDen");

	public EntityManager getEM() {
		return emf.createEntityManager();
	}
}
