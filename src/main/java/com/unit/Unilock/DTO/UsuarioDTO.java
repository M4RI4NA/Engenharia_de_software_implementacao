package com.unit.Unilock.DTO;

import com.unit.Unilock.Entity.TipoUsuario;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private TipoUsuario tipo;
}