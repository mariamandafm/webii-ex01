package com.amanda.webii_ex01.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Permissao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String descricao;

    @ManyToMany(mappedBy = "permissoes")
    private List<Papel> papeis =new ArrayList<>();
}
