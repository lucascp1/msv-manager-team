package br.com.lucascp1.msvmanagerteam.service;

import br.com.lucascp1.msvmanagerteam.DTO.ContratoDTO;
import br.com.lucascp1.msvmanagerteam.mapper.ContratoMapper;
import br.com.lucascp1.msvmanagerteam.model.Contrato;
import br.com.lucascp1.msvmanagerteam.model.Jogador;
import br.com.lucascp1.msvmanagerteam.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Autowired
    private ContratoMapper contratoMapper;

    public List<ContratoDTO> listarContratos(){
        return contratoMapper.converterListaEntidadeParaDto(contratoRepository.findAll());
    }

    public ContratoDTO buscarContratoPorId(Integer idContrato){
        return contratoMapper.converterEntidadeParaDto(contratoRepository.getById(idContrato));
    }

    public ContratoDTO salvarContrato(Contrato contrato){
        return contratoMapper.converterEntidadeParaDto(contratoRepository.save(contrato));
    }

    public ContratoDTO atualizarContratoPorId(Integer idContrato, ContratoDTO contratoDTO) {
        Contrato contrato = contratoRepository.findById(idContrato).get();
        contrato = contratoMapper.atualizaEntidadePorDTO(contrato, contratoDTO);
        return contratoMapper.converterEntidadeParaDto(contratoRepository.save(contrato));
    }

    public String excluirContratoPorId(Integer idContrato){
        contratoRepository.deleteById(idContrato);
        return "Contrato excluído com sucesso";
    }
}