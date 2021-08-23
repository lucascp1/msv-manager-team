package br.com.lucascp1.msvmanagerteam.repositories;

import br.com.lucascp1.msvmanagerteam.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {

}
