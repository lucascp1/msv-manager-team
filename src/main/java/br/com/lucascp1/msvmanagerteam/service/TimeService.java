package br.com.lucascp1.msvmanagerteam.service;

import br.com.lucascp1.msvmanagerteam.model.Time;
import br.com.lucascp1.msvmanagerteam.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    public List<Time> listarTimes(){
        return timeRepository.findAll();
    }

    public Optional<Time> buscarTimePorId(Integer idTime) {
        return timeRepository.findById(idTime);
    }

    public Time salvarTime(Time time) {
        return timeRepository.save(time);
    }

    public String excluirTimePorId(Integer idTime) {
        timeRepository.deleteById(idTime);
        return "Time excluído com sucesso";
    }

    public Time atualizarTimePorId(Integer idTime, Time time) {
        final Time timeEntity = timeRepository.findById(idTime).get();
        timeEntity.setNomeTime(time.getNomeTime());
        timeEntity.setDono(time.getDono());
        timeEntity.setTecnico(time.getTecnico());
        return timeRepository.save(timeEntity);
    }
}
