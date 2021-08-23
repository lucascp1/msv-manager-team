package br.com.lucascp1.msvmanagerteam.models;

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
@Table(name = "jogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jogador")
    private Integer idJogador;

    @Column(name = "nome_jogador")
    private String nomeJogador;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "posicao")
    private String posicao;
}
