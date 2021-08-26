package br.com.lucascp1.msvmanagerteam.DTO;

import br.com.lucascp1.msvmanagerteam.model.Jogador;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratoDTO {
    private Integer idContrato;
    private Double valor;
    private Double recisao;
    private String duracao;
    private LocalDate dataContratacao;
    private Jogador jogador;
}
