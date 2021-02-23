package com.br.farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.farmacia.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByInfosContainingIgnoreCase(String infos);

}
