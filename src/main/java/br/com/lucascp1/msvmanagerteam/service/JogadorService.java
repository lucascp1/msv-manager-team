package br.com.lucascp1.msvmanagerteam.service;

import br.com.lucascp1.msvmanagerteam.DTO.JogadorDTO;
import br.com.lucascp1.msvmanagerteam.mapper.JogadorMapper;
import br.com.lucascp1.msvmanagerteam.model.Jogador;
import br.com.lucascp1.msvmanagerteam.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;

    public List<JogadorDTO> listarJogadores() {
        return jogadorMapper.converterListaEntidadeParaDto(jogadorRepository.findAll());
    }

    public JogadorDTO buscarJogadorPorId(Integer idJogador) {
        return jogadorMapper.converterEntidadeParaDto(jogadorRepository.getById(idJogador));
    }

    public JogadorDTO salvarJogador(Jogador jogador) {
        return jogadorMapper.converterEntidadeParaDto(jogadorRepository.save(jogador));
    }

    public JogadorDTO atualizarJogadorPorId(Integer idJogador, JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorRepository.findById(idJogador).get();
        jogador = jogadorMapper.atualizaEntidadePorDTO(jogador, jogadorDTO);
        return jogadorMapper.converterEntidadeParaDto(jogadorRepository.save(jogador));
    }

    public String excluirJogadorPorId(Integer idJogador) {
        jogadorRepository.deleteById(idJogador);
        return "Jogador excluído com sucesso";
    }
}
