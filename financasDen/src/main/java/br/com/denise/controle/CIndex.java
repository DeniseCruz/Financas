package br.com.denise.controle;

import java.math.BigDecimal;

//import java.util.ArrayList;
//import java.util.LinkedHashMap;


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;

//import org.zkoss.zul.ListModelArray;

//import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Decimalbox;
import br.com.denise.financas.modelo.Conta;
import br.com.denise.financas.modelo.Movimentacao;
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
	
	
	
	@Wire
	private Textbox comboConta;
	@Wire
	private Textbox comboTipo;
	@Wire
	private Textbox txtDescricao;
	@Wire
	private Textbox dtData;
	@Wire
	private Decimalbox decimalValor;
	
	
		
		
	//private Listbox lstContasCadastradas;
	//private ArrayList<LinkedHashMap<String, String>> listaOperacoes = new ArrayList<LinkedHashMap<String, String>>();
			
		
	@Listen("onClick = #btnGravar")
	public void listarGravar(){
		
				
		this.txtTitular.setValue(this.txtTitular.getValue().toUpperCase());
		
		
		String titular = this.txtTitular.getText();
		String agencia = this.intAgencia.getText();
		String nconta = this.intConta.getText();
		String banco = this.intBanco.getText();
		
		
		Conta contai = new Conta();
		contai.setBanco(banco);
		contai.setNumero(nconta);
		contai.setAgencia(agencia);
		contai.setTitular(titular);
		
				
		AplicacaoCliente aplicacaoCliente = new AplicacaoCliente();
		aplicacaoCliente.acaoDoBotaoAdicionarConta(contai);
		
		/*
		LinkedHashMap<String, String> hash = new LinkedHashMap<String, String>();
		
		hash.put("agencia", agencia);
		hash.put("conta", "ddd");
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
	
	@Listen("onClick = #btnGravarMov")
	public void listarGravarMov(){
		
				
		this.txtDescricao.setValue(this.txtDescricao.getValue().toUpperCase());
		
		/*
		String nconta = this.comboConta.getText();
		//pegar id
		String tipo = this.comboTipo.getText();
		String dtdata = this.dtData.getText();
		String descricao = this.txtDescricao.getText();
		BigDecimal valor = this.decimalValor.getValue();
		
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setConta(id);
		movimentacao.setDataMovimentacao(dtdata);
		movimentacao.setDescricao(descricao);
		movimentacao.setTipo(tipo);
		movimentacao.setValor(valor);
		
						
		AplicacaoCliente aplicacaoMovimento = new AplicacaoCliente();
		aplicacaoMovimento.acaoDoBotaoAdicionarMovimentacao(conta, movimentacao);
		*/	
	}
	

}
