package com.unit.Unilock.Service;


    
import java.util.List;

import org.springframework.stereotype.Service;

import com.unit.Unilock.Entity.Reserva;
import com.unit.Unilock.Repository.ReservaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservaService {

    private final ReservaRepository repository;

    public List<Reserva> listar() {
        return repository.findAll();
    }

    public Reserva salvar(Reserva reserva) {
        return repository.save(reserva);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Reserva buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
