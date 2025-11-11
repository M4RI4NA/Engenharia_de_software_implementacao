package com.unit.Unilock.DTO;

import lombok.Data;

@Data
public class InstalacaoDTO {
    private Long id;
    private String nome;
    private String tipo; // Sala, auditório, laboratório...
    private Boolean disponivel;
}

