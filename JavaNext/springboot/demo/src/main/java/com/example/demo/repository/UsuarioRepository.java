package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    // Long é o mesmo que BigInt
}
