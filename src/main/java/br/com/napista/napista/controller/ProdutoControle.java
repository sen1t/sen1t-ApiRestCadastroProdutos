package br.com.napista.napista.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.napista.napista.controller.dto.DetalharProdutoDto;
import br.com.napista.napista.controller.dto.ProdutoDto;
import br.com.napista.napista.controller.form.ProdutoForm;
import br.com.napista.napista.modelo.Produto;
import br.com.napista.napista.repository.ProdutoRepository;

@RestController
@RequestMapping("api/produtos")
public class ProdutoControle {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public ResponseEntity<ProdutoDto> cadastrar(@RequestBody ProdutoForm form){
		Produto produto  = form.adicionar();
		produtoRepository.save(produto);	
		return ResponseEntity.ok().body(new ProdutoDto(produto));
	}
	
	@GetMapping
	public ResponseEntity<List<ProdutoDto>> listaProdutos(){
		
		List<Produto> produtos = produtoRepository.findAll();
		return ResponseEntity.ok(ProdutoDto.converter(produtos));	
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<DetalharProdutoDto> detalharProduto(@PathVariable Long id){
		Optional<Produto> produto = produtoRepository.findById(id);
		if(produto.isPresent()) {
			return ResponseEntity.ok(new DetalharProdutoDto(produto.get()));
		}
			return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ProdutoDto> deletarProduto(@PathVariable Long id){
		
		Produto produto = produtoRepository.getById(id);
		produtoRepository.deleteById(id);	
		return ResponseEntity.ok(new ProdutoDto(produto));
		
	}
}
