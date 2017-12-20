package br.com.denise.financas.cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.denise.financas.modelo.Conta;
import br.com.denise.financas.modelo.Movimentacao;
import br.com.denise.servidor.RegistroDeDados;


public class AplicacaoCliente {
	
	private static RegistroDeDados registro = null;

	public static void main(String args[]) {
		
		try{
			System.out.println("Cliente iniciou11111");
			
			//System.setProperty( "java.rmi.server.hostname", "192.168.0.6" );
			Registry registry = LocateRegistry.getRegistry("localhost", 2001);
						
			registro = (RegistroDeDados) registry.lookup("RegistroDeDadosDoBanco");
			
			System.out.println("Cliente iniciou2222");
			
			//teste();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void teste() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Conta conta1 = new Conta();
		//conta1.setBanco(listarGravar.banco);
		
		/*	System.out.println("Cliente iniciou333");
		
		Conta conta1 = new Conta();

		conta1.setBanco("341 - BANCO DO ITAU");
		conta1.setNumero("168765-8");
		conta1.setAgencia("0341");
		conta1.setTitular("Denise O. Cruz");
		
		acaoDoBotaoAdicionarConta(conta1);
			
		System.out.println("Cliente Gravado");
		*/
			
	}
		
	
	public  void acaoDoBotaoAdicionarConta(Conta conta) {
		try{
			System.out.println("Iniciando RMI adicionarConta");
			registro.adicionarConta(conta);
			System.out.println("Finalizado RMI adicionarMovimentacao");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void acaoDoBotaoRemoverConta(Conta conta) {
		try{
			System.out.println("Iniciando RMI adicionarConta");
			registro.removerConta(conta);
			System.out.println("Finalizado RMI adicionarMovimentacao");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void acaoDoBotaoAdicionarMovimentacao(Conta conta, Movimentacao movimentacao) {
		try{
			movimentacao.setConta(conta);
			System.out.println("Iniciando RMI adicionarMovimentacao");
			registro.adicionarMovimentacao(movimentacao);
			System.out.println("Finalizado RMI adicionarMovimentacao");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

