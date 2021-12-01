package br.com.napista.napista.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.napista.napista.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findAllById(Long id);
	
}
