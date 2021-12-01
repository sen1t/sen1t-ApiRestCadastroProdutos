package br.com.napista.napista.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import br.com.napista.napista.modelo.Produto;

public class ProdutoDto {
		
		private Long id;
		private String nome;
		private Double valor_unitario;
		private Integer qtde_estoque;

		
		
		public ProdutoDto(Produto produto) {
			this.id = produto.getId();
			this.nome = produto.getNome();
			this.valor_unitario = produto.getValor_unitario();
			this.qtde_estoque = produto.getQtde_estoque();

			
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

		public static List<ProdutoDto> converter(List<Produto> produtos) {
			return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
		}
		
		
		
}
