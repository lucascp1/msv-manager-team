package br.com.lucascp1.msvmanagerteam.services;

import br.com.lucascp1.msvmanagerteam.models.Jogador;
import br.com.lucascp1.msvmanagerteam.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> listarJogadores() {
        return jogadorRepository.findAll();
    }

    public Jogador salvarJogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    public Optional<Jogador> buscarJogadorPorId(Integer jogador) {
        return jogadorRepository.findById(jogador);
    }

    public String excluirJogadorPorId(Integer jogador) {
        jogadorRepository.deleteById(jogador);
        return "Jogador excluído com sucesso";
    }

    public Jogador atualizarJogadorPorId(Integer idJogador, Jogador jogador) {
        final Jogador jogadorEntity = jogadorRepository.findById(idJogador).get();
        jogadorEntity.setIdJogador(idJogador);
        jogadorEntity.setNomeJogador(jogador.getNomeJogador());
        jogadorEntity.setPosicao(jogador.getPosicao());
        jogadorEntity.setAltura(jogador.getAltura());
        return jogadorRepository.save(jogadorEntity);
    }
}
