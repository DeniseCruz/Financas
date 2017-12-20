package br.com.denise.servidor.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;
 
import br.com.denise.financas.modelo.Conta;
import br.com.denise.financas.modelo.Movimentacao;
import br.com.denise.financas.util.JPAUtil;
import br.com.denise.servidor.RegistroDeDados;

public class RegistroDeDadosImpl extends UnicastRemoteObject implements RegistroDeDados {

	public RegistroDeDadosImpl() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean adicionarConta(Conta conta) throws RemoteException {
		EntityManager manager = new JPAUtil().getEM();
		manager.getTransaction().begin();
		
		manager.persist(conta);
		
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	public boolean removerConta(Conta conta) throws RemoteException {
		EntityManager manager = new JPAUtil().getEM();
		manager.getTransaction().begin();
		
		manager.remove(conta);
		
	//	manager.getTransaction().commit();
	//	manager.close();
		return true;
	}
	public boolean adicionarMovimentacao(Movimentacao movimentacao) {
		EntityManager manager = new JPAUtil().getEM();
		manager.getTransaction().begin();
		
		manager.persist(movimentacao);
		
		manager.getTransaction().commit();
		manager.close();
		return true;
	}
	
}
