package br.com.lucascp1.msvmanagerteam.controllers;

import br.com.lucascp1.msvmanagerteam.models.Jogador;
import br.com.lucascp1.msvmanagerteam.services.JogadorService;
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
    public ResponseEntity<List<Jogador>> listarJogadores(){
        return ResponseEntity.ok(this.jogadorService.listarJogadores());
    }

    @GetMapping("/{jogador}")
    public Optional<Jogador> buscarJogadoresPorId(@PathVariable Integer jogador){
        return jogadorService.buscarJogadoresPorId(jogador);
    }

    @PostMapping
    public ResponseEntity<Jogador> salvarJogador(@RequestBody Jogador jogador){
        return ResponseEntity.ok(this.jogadorService.salvarJogador(jogador));
    }
}

