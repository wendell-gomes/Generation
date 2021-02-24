package com.lojagame.LojinhadeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojagame.LojinhadeGames.model.Categoria;


@Repository
public interface LojinhaRepository extends JpaRepository<Categoria,Long >{
	public List<Categoria> findAllByEstiloContainingIgnoreCase (String estilo);

}
