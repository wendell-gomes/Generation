package com.lojagame.LojinhadeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojagame.LojinhadeGames.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByInfosContainingIgnoreCase(String infos);

}
