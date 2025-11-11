package com.unit.Unilock.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unit.Unilock.DTO.ReservaDTO;
import com.unit.Unilock.Entity.Reserva;
import com.unit.Unilock.Repository.InstalacaoRepository;
import com.unit.Unilock.Repository.UsuarioRepository;
import com.unit.Unilock.Service.ReservaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reservas")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ReservaController {

    private final ReservaService service;
    private final UsuarioRepository usuarioRepository;
    private final InstalacaoRepository instalacaoRepository;

    @GetMapping
    public List<Reserva> listar() {
        return service.listar();
    }

    // 🔹 Aqui entra o método com o DTO
    @PostMapping
    public Reserva salvar(@RequestBody ReservaDTO dto) {
        Reserva reserva = new Reserva();
        reserva.setDataHoraInicio(dto.getDataHoraInicio());
        reserva.setDataHoraFim(dto.getDataHoraFim());
        reserva.setStatus(dto.getStatus());

        // Busca o usuário e a instalação pelos IDs do DTO
        reserva.setUsuario(usuarioRepository.findById(dto.getUsuarioId()).orElseThrow());
        reserva.setInstalacao(instalacaoRepository.findById(dto.getInstalacaoId()).orElseThrow());

        return service.salvar(reserva);
    }

    @GetMapping("/{id}")
    public Reserva buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
