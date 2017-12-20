package br.com.denise.controle;

import java.util.ArrayList;
import java.util.LinkedHashMap;


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.ListModelArray;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import br.com.denise.financas.modelo.Conta;
import br.com.denise.financas.cliente.AplicacaoCliente;

public class CIndex extends SelectorComposer<Component>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8130114158122154822L;

	/**
	 * 
	 */
	/*private static final long serialVersionUID = 1L;*/

	@Wire
	private Textbox txtTitular;
	@Wire
	private Textbox intAgencia;
	@Wire
	private Textbox intConta;
	@Wire
	private Textbox intBanco;
	
		
	//private Listbox lstContasCadastradas;
	
	//private ArrayList<LinkedHashMap<String, String>> listaOperacoes = new ArrayList<LinkedHashMap<String, String>>();

	//private Object txtAgencia;
		
		
	@Listen("onClick = #btnGravar")
	public void listarGravar(){
		
		//System.out.println("entrou");
		//this.txtbxMaiuscula.setValue(this.txtbxMaiuscula.getValue().toUpperCase());
		
		this.txtTitular.setValue(this.txtTitular.getValue().toUpperCase());
		
		
		String titular = this.txtTitular.getValue();
		String agencia = this.intAgencia.getValue();
		String nconta = this.intConta.getValue();
		String banco = this.intBanco.getValue();
		
		
		Conta contai = new Conta();
		contai.setBanco(banco);
		contai.setNumero(nconta);
		contai.setAgencia(agencia);
		contai.setTitular(titular);
		
		System.out.println(banco);
		
		AplicacaoCliente aplicacaoCliente = new AplicacaoCliente();
		aplicacaoCliente.acaoDoBotaoAdicionarConta(contai);
		
		/*
		LinkedHashMap<String, String> hash = new LinkedHashMap<String, String>();
	 	hash.put("agencia", agencia);
		hash.put("aonta", conta);
		hash.put("banco", banco);
		hash.put("titular", titular);
		
		try{
		   listaOperacoes.add(hash);
		   this.lstContasCadastradas.setModel(new ListModelArray<LinkedHashMap<String, String>>(this.listaOperacoes));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		*/
	}
	
	

}