package br.com.lucascp1.msvmanagerteam.mapper;

import br.com.lucascp1.msvmanagerteam.DTO.ContratoDTO;
import br.com.lucascp1.msvmanagerteam.model.Contrato;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContratoMapper {

    public Contrato converterDtoParaEntidade(ContratoDTO dto){
        return new Contrato(
                dto.getIdContrato(),
                dto.getValor(),
                dto.getRecisao(),
                dto.getDuracao(),
                dto.getDataContratacao());
    }

    public ContratoDTO converterEntidadeParaDto(Contrato contrato){
        return new ContratoDTO(
                contrato.getIdContrato(),
                contrato.getValor(),
                contrato.getRecisao(),
                contrato.getDuracao(),
                contrato.getDataContratacao());
    }

    public List<Contrato> converterListaDtoParaEntidade(List<ContratoDTO> listDto){
        List<Contrato> listContrato = new ArrayList<>();

        for (ContratoDTO dto:listDto) {
            Contrato contrato = new Contrato();

            contrato.setIdContrato(dto.getIdContrato());
            contrato.setValor(dto.getValor());
            contrato.setRecisao(dto.getRecisao());
            contrato.setDuracao(dto.getDuracao());
            contrato.setDataContratacao(dto.getDataContratacao());
//            contrato.setNomeJogador(contrato.getJogador().getNomeJogador());
            listContrato.add(contrato);
        }
        return listContrato;
    }

    public List<ContratoDTO> converterListaEntidadeParaDto(List<Contrato> listContrato){

        List<ContratoDTO>  listDto = new ArrayList<>();

        for (Contrato contrato:listContrato) {
            ContratoDTO contratoDTO = new ContratoDTO();

            contratoDTO.setIdContrato(contrato.getIdContrato());
            contratoDTO.setValor(contrato.getValor());
            contratoDTO.setRecisao(contrato.getRecisao());
            contratoDTO.setDuracao(contrato.getDuracao());
            contratoDTO.setDataContratacao(contrato.getDataContratacao());
//            contratoDTO.setNomeJogador(contrato.getJogador().getNomeJogador());
            listDto.add(contratoDTO);
        }
        return listDto;
    }

    public Contrato atualizaEntidadePorDTO(Contrato contrato, ContratoDTO contratoDTO){
        contrato.setValor(contratoDTO.getValor());
        contrato.setRecisao(contratoDTO.getRecisao());
        contrato.setDuracao(contratoDTO.getDuracao());
        contrato.setDataContratacao(contratoDTO.getDataContratacao());
//        contrato.setNomeJogador(contratoDTO.getNomeJogador());

        return contrato;
    }
}
