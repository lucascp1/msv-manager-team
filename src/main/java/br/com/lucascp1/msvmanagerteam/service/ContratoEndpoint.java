package br.com.lucascp1.msvmanagerteam.service;

import br.com.lucascp1.msvmanagerteam.DTO.FreeAgentDTO;
import br.com.lucascp1.msvmanagerteam.model.Contrato;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "FreeAgent", url = "http://localhost:9000/freeAgent")
public interface ContratoEndpoint {

    @RequestMapping(method = RequestMethod.GET, value = "")
    List<FreeAgentDTO> getContrato();
}
