package br.com.lucascp1.msvmanagerteam.DTO;

import br.com.lucascp1.msvmanagerteam.model.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JogadorDTO {
    private Integer idJogador;
    private String nomeJogador;
    private Double altura;
    private String posicao;
    private Time time;
}
