package br.com.napista.napista.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length=50)
	private String nome;
	
	@Column(nullable = false, length=9)
	private Double valor_unitario;
	
	@Column(nullable = false, length=9)
	private Integer qtde_estoque;
	
	@Column
	private LocalDateTime ultima_venda;
	
	@Column(nullable = false)
	private Double valorUltimaVenda;
	
	
	public Produto(String nome, Double valor_unitario, Integer qtde_estoque) {
		this.nome = nome;
		this.valor_unitario = valor_unitario;
		this.qtde_estoque = qtde_estoque; 
		this.valorUltimaVenda = 0d;
	}

	
	public Produto() {

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public void setQtde_estoque(Integer qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}


	public LocalDateTime getUltima_venda() {
		return ultima_venda;
	}


	public void setUltima_venda(LocalDateTime ultima_venda) {
		this.ultima_venda = ultima_venda;
	}


	public Double getValorUltimaVenda() {
		return valorUltimaVenda;
	}


	public void setValorUltimaVenda(Double valorUltimaVenda) {
		this.valorUltimaVenda = valorUltimaVenda;
	}
	
	
	
	
}
