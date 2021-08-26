package br.com.lucascp1.msvmanagerteam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "time")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_time")
    private Integer idTime;

    @Column(name = "nome_time")
    private String nomeTime;

    @Column(name = "dono")
    private String dono;

    @Column(name = "tecnico")
    private String tecnico;
}
