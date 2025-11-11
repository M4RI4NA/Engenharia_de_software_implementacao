package com.unit.Unilock.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class EventoDTO {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Boolean autorizado;
    private Long criadorId;
}
