package br.com.lucascp1.msvmanagerteam.controller;

import br.com.lucascp1.msvmanagerteam.DTO.ContratoDTO;
import br.com.lucascp1.msvmanagerteam.model.Contrato;
import br.com.lucascp1.msvmanagerteam.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/contrato")
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    @GetMapping
    public ResponseEntity<List<ContratoDTO>> listarContratos(){
        return ResponseEntity.ok(this.contratoService.listarContratos());
    }

    @GetMapping("/{idContrato}")
    public ContratoDTO buscarContratoPorId(@PathVariable Integer idContrato){
        return contratoService.buscarContratoPorId(idContrato);
    }

    @PostMapping
    public ResponseEntity<ContratoDTO> salvarContrato(@RequestBody Contrato contrato){
        return ResponseEntity.ok(this.contratoService.salvarContrato(contrato));
    }

    @PutMapping("/{idContrato}")
    public ContratoDTO atualizarContratoPorId(@PathVariable Integer idContrato, @RequestBody ContratoDTO contratoDTO){
        return contratoService.atualizarContratoPorId(idContrato, contratoDTO);
    }

    @DeleteMapping("/{idContrato}")
    public ResponseEntity<String> excluirContratoPorId(@PathVariable Integer idContrato){
        return ResponseEntity.ok(this.contratoService.excluirContratoPorId(idContrato));
    }
}
