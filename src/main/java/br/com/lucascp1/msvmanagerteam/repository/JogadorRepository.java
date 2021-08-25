package br.com.lucascp1.msvmanagerteam.repository;

import br.com.lucascp1.msvmanagerteam.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {

}
