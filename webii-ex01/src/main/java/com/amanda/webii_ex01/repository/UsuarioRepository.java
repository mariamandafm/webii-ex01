package com.amanda.webii_ex01.repository;

import com.amanda.webii_ex01.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
