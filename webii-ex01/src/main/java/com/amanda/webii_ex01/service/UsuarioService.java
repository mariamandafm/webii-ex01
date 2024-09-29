package com.amanda.webii_ex01.service;

import com.amanda.webii_ex01.model.Usuario;
import com.amanda.webii_ex01.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save (Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
