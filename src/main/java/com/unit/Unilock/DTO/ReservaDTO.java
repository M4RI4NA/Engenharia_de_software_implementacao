package com.unit.Unilock.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReservaDTO {
    private Long id;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private String status; // PENDENTE, AUTORIZADA, CANCELADA
    private Long usuarioId;
    private Long instalacaoId;
}