package br.com.lucascp1.msvmanagerteam.controller;

import br.com.lucascp1.msvmanagerteam.model.Time;
import br.com.lucascp1.msvmanagerteam.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    public ResponseEntity<List<Time>> listarTimes(){
        return ResponseEntity.ok(this.timeService.listarTimes());
    }

    @GetMapping("/{idTime}")
    public Optional<Time> buscarTimePorId(@PathVariable Integer idTime){
        return timeService.buscarTimePorId(idTime);
    }

    @PostMapping
    public ResponseEntity<Time> salvarTime(@RequestBody Time time){
        return ResponseEntity.ok(this.timeService.salvarTime(time));
    }

    @PutMapping("/{idTime}")
    public Time atualizarTimePorId(@PathVariable Integer idTime, @RequestBody Time time){
        return timeService.atualizarTimePorId(idTime, time);
    }

    @DeleteMapping("/{idTime}")
    public ResponseEntity<String> excluirTimePorId(@PathVariable Integer idTime) {
        return ResponseEntity.ok(this.timeService.excluirTimePorId(idTime));
    }
}
