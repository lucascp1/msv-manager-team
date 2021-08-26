package br.com.lucascp1.msvmanagerteam.mapper;

import br.com.lucascp1.msvmanagerteam.DTO.TimeDTO;
import br.com.lucascp1.msvmanagerteam.model.Time;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TimeMapper {

    public Time converterDtoParaEntidade(TimeDTO dto){
        return new Time(
                dto.getIdTime(),
                dto.getNomeTime(),
                dto.getDono(),
                dto.getTecnico());
    }

    public TimeDTO converterEntidadeParaDto(Time time){
        return new TimeDTO(
                time.getIdTime(),
                time.getNomeTime(),
                time.getDono(),
                time.getTecnico());
    }

    public List<Time> converterListaDtoParaEntidade(List<TimeDTO> listDto){
        List<Time> listTime = new ArrayList<>();

        for (TimeDTO dto:listDto) {
            Time time = new Time();

            time.setIdTime(dto.getIdTime());
            time.setNomeTime(dto.getNomeTime());
            time.setDono(dto.getDono());
            time.setTecnico(dto.getTecnico());
            listTime.add(time);
        }
        return listTime;
    }

    public List<TimeDTO> converterListaEntidadeParaDto(List<Time> listTime){

        List<TimeDTO>  listDto = new ArrayList<>();

        for (Time time:listTime) {
            TimeDTO timeDTO = new TimeDTO();

            timeDTO.setIdTime(time.getIdTime());
            timeDTO.setNomeTime(time.getNomeTime());
            timeDTO.setDono(time.getDono());
            timeDTO.setTecnico(time.getTecnico());
            listDto.add(timeDTO);
        }
        return listDto;
    }

    public Time atualizaEntidadePorDTO(Time time, TimeDTO timeDTO){

        time.setNomeTime(timeDTO.getNomeTime());
        time.setDono(timeDTO.getDono());
        time.setTecnico(timeDTO.getTecnico());

        return time;
    }
}
