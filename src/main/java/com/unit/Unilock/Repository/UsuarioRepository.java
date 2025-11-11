package com.unit.Unilock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unit.Unilock.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}