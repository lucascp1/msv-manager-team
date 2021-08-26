package br.com.lucascp1.msvmanagerteam.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimeDTO {
    private Integer idTime;
    private String nomeTime;
    private String dono;
    private String tecnico;
}
