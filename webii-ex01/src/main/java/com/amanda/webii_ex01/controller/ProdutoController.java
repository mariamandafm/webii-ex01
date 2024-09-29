package com.amanda.webii_ex01.controller;

import com.amanda.webii_ex01.model.Produto;
import com.amanda.webii_ex01.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping()
    String test(Model model){
        Produto prod = new Produto();
        prod.setNome("Caixa");
        System.out.println(produtoService.save(prod));
        model.addAttribute("teste", "menssagem de teste");
        return "index";
    }
}
