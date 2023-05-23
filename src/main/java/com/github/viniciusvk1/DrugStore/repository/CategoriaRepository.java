package com.github.viniciusvk1.DrugStore.repository;

import com.github.viniciusvk1.DrugStore.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByNomeContainingIgnoreCase(@Param("tipo") String nome);

}
