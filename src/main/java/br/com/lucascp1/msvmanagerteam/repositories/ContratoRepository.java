package br.com.lucascp1.msvmanagerteam.repositories;

import br.com.lucascp1.msvmanagerteam.models.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer> {

}
