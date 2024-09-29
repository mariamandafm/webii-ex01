package com.amanda.webii_ex01.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Papel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    @ManyToMany
    @JoinTable(
            name="papel_permissoes",
            joinColumns=@JoinColumn(name="papel_id"),
            inverseJoinColumns=@JoinColumn(name="permissao_id")
    )
    private List<Permissao> permissoes = new ArrayList<>();


    @OneToMany(mappedBy = "papel", cascade = CascadeType.ALL)
    private List<Usuario> usuarios = new ArrayList<>();
}
