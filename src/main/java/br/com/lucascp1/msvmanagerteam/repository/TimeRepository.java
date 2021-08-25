package br.com.lucascp1.msvmanagerteam.repository;

import br.com.lucascp1.msvmanagerteam.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {

}
