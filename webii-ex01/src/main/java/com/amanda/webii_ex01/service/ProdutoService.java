package com.amanda.webii_ex01.service;

import com.amanda.webii_ex01.model.Produto;
import com.amanda.webii_ex01.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }
}
