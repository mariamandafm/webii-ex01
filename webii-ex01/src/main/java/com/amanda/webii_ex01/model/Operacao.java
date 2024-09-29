package com.amanda.webii_ex01.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Operacao {

    public enum TipoOperacao{
        ENTRADA,
        SAIDA
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date data;

    @Enumerated(EnumType.STRING)
    private TipoOperacao tipo;
}
