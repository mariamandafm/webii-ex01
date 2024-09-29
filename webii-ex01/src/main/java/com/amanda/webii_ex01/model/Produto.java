package com.amanda.webii_ex01.model;

import com.amanda.webii_ex01.model.Loja;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String descricao;
    private Double precoDeCusto;
    private Double precoDeVenda;
    private Integer quantidadeEmEstoque;

    @ManyToOne
    private Loja loja;

}
