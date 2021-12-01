package br.com.napista.napista.controller.form;
import java.time.LocalDateTime;

import br.com.napista.napista.modelo.Produto;



public class ProdutoForm {
	
	
	private String nome;
	private Double valor_unitario;
	private Integer qtde_estoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getValor_unitario() {
		return valor_unitario;
	}
	
	public void setValor_unitario(Double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	
	public Integer getQtde_estoque() {
		return qtde_estoque;
	}
	
	public void setQtde_estoque(Integer qtd_estoque) {
		this.qtde_estoque = qtd_estoque;
	}
	
	
	public Produto adicionar() {
		return new Produto(nome, valor_unitario, qtde_estoque);
	}
	
}
