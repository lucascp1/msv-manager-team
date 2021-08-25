package br.com.lucascp1.msvmanagerteam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Integer idContrato;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "recisao")
    private Double recisao;

    @Column(name = "duracao")
    private String duracao;

    @Column(name = "data_contratacao")
    private LocalDate dataContratacao;

//    @OneToOne
//    @JoinColumn(name = "id_jogador")
//    private Jogador jogador;

}
