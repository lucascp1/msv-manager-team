package br.com.lucascp1.msvmanagerteam.mapper;

import br.com.lucascp1.msvmanagerteam.DTO.JogadorDTO;
import br.com.lucascp1.msvmanagerteam.model.Jogador;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JogadorMapper {

    public Jogador converterDtoParaEntidade(JogadorDTO dto){
        return new Jogador(dto.getIdJogador(), dto.getNomeJogador(), dto.getAltura(), dto.getPosicao());
    }

    public JogadorDTO converterEntidadeParaDto(Jogador jogador){
        return new JogadorDTO(jogador.getIdJogador(), jogador.getNomeJogador(), jogador.getAltura(), jogador.getPosicao());
    }

    public List<Jogador> converterListaDtoParaEntidade(List<JogadorDTO> listDto){

        List<Jogador> listJogador = new ArrayList<>();

        for (JogadorDTO dto:listDto) {
            Jogador jogador = new Jogador();

            jogador.setIdJogador(dto.getIdJogador());
            jogador.setNomeJogador(dto.getNomeJogador());
            jogador.setAltura(dto.getAltura());
            jogador.setPosicao(dto.getPosicao());
            listJogador.add(jogador);
        }

        return listJogador;
    }

    public List<JogadorDTO> converterListaEntidadeParaDto(List<Jogador> listJogador){

        List<JogadorDTO>  listDto = new ArrayList<>();

        for (Jogador jogador:listJogador) {
            JogadorDTO jogadorDTO = new JogadorDTO();

            jogadorDTO.setIdJogador(jogador.getIdJogador());
            jogadorDTO.setNomeJogador(jogador.getNomeJogador());
            jogadorDTO.setAltura(jogador.getAltura());
            jogadorDTO.setPosicao(jogador.getPosicao());
            listDto.add(jogadorDTO);
        }
        return listDto;
    }

    public Jogador atualizaEntidadePorDTO(Jogador jogador, JogadorDTO jogadorDTO){
        jogador.setNomeJogador(jogadorDTO.getNomeJogador());
        jogador.setPosicao(jogadorDTO.getPosicao());
        jogador.setAltura(jogadorDTO.getAltura());

        return jogador;
    }
}
