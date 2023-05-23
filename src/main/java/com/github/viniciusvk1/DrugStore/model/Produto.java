package com.github.viniciusvk1.DrugStore.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório!")
    private String nome;

    @NotBlank(message = "Descrição é obrigatório!")
    private String descricao;

    private int quantidade;

    private String laboratorio;

    @NotNull(message = "Preço é obrigatório!")
    @Positive(message = "Digite um valor maior do que zero")
    private BigDecimal preco;

    private String foto;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

}