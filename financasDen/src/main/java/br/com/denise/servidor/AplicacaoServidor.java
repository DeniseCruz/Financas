package br.com.denise.servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.persistence.EntityManager;

import br.com.denise.financas.util.JPAUtil;
import br.com.denise.servidor.impl.RegistroDeDadosImpl;

public class AplicacaoServidor { 
	
	public static void main(String args[]) {
		try{
			EntityManager manager = new JPAUtil().getEM();
			manager.getTransaction().begin();
			manager.getTransaction().commit();
			manager.close();
			
			RegistroDeDados registro = new RegistroDeDadosImpl();
			
			Registry registry = LocateRegistry.createRegistry(2001);
			registry.rebind("RegistroDeDadosDoBanco", registro);
			System.out.println("Servidor iniciou");
		}
		catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

