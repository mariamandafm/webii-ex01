package com.amanda.webii_ex01.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String cidade;
    private String cep;
    private String bairro;
    private String rua;
    private Long numero;

    @OneToMany(mappedBy = "loja", cascade = CascadeType.ALL)
    private List<Produto> produtos = new ArrayList<>();
}
