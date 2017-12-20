package br.com.denise.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.denise.financas.modelo.Conta;
import br.com.denise.financas.modelo.Movimentacao;

public interface RegistroDeDados extends Remote {

	public boolean adicionarConta(Conta conta) throws RemoteException;
	
	public boolean removerConta(Conta conta) throws RemoteException;

	public boolean adicionarMovimentacao(Movimentacao movimentacao) throws RemoteException;

}
