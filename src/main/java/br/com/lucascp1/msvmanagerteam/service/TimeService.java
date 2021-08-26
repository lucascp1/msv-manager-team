package br.com.lucascp1.msvmanagerteam.service;

import br.com.lucascp1.msvmanagerteam.DTO.TimeDTO;
import br.com.lucascp1.msvmanagerteam.mapper.TimeMapper;
import br.com.lucascp1.msvmanagerteam.model.Time;
import br.com.lucascp1.msvmanagerteam.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private TimeMapper timeMapper;

    public List<TimeDTO> listarTimes(){
        return timeMapper.converterListaEntidadeParaDto(timeRepository.findAll());
    }

    public TimeDTO buscarTimePorId(Integer idTime) {
        return timeMapper.converterEntidadeParaDto(timeRepository.getById(idTime));
    }

    public TimeDTO salvarTime(Time time) {
        return timeMapper.converterEntidadeParaDto(timeRepository.save(time));
    }

    public TimeDTO atualizarTimePorId(Integer idTime, TimeDTO timeDTO) {
        Time time = timeRepository.findById(idTime).get();
        time = timeMapper.atualizaEntidadePorDTO(time, timeDTO);
        return timeMapper.converterEntidadeParaDto(timeRepository.save(time));
    }

    public String excluirTimePorId(Integer idTime) {
        timeRepository.deleteById(idTime);
        return "Time excluído com sucesso";
    }
}

