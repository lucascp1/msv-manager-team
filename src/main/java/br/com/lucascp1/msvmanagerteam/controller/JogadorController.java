package br.com.lucascp1.msvmanagerteam.controller;

import br.com.lucascp1.msvmanagerteam.DTO.JogadorDTO;
import br.com.lucascp1.msvmanagerteam.model.Jogador;
import br.com.lucascp1.msvmanagerteam.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores(){
        return ResponseEntity.ok(this.jogadorService.listarJogadores());
    }

    @GetMapping("/{idJogador}")
    public JogadorDTO buscarJogadoresPorId(@PathVariable Integer idJogador){
        return jogadorService.buscarJogadorPorId(idJogador);
    }

    @PostMapping
    public ResponseEntity<JogadorDTO> salvarJogador(@RequestBody Jogador jogador){
        return ResponseEntity.ok(this.jogadorService.salvarJogador(jogador));
    }

    @PutMapping("/{idJogador}")
    public JogadorDTO atualizarJogadorPorId(@PathVariable Integer idJogador, @RequestBody JogadorDTO jogadorDTO){
        return jogadorService.atualizarJogadorPorId(idJogador, jogadorDTO);
    }

    @DeleteMapping("/{idJogador}")
    public ResponseEntity<String> excluirJogadorPorId(@PathVariable Integer idJogador) {
        return ResponseEntity.ok(this.jogadorService.excluirJogadorPorId(idJogador));
    }
}

