package teatro.teatros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import teatro.teatros.entities.TOTeatro;
import teatro.teatros.service.TeatroFacade;

import java.util.List;

@RestController
@RequestMapping(value = "/teatro", produces = MediaType.APPLICATION_JSON_VALUE)
public class TeatroAPI {

    @Autowired
    private TeatroFacade teatroFacade;

    @PostMapping("/cadastrar")
    @ResponseBody
    public TOTeatro cadastrarTeatro(@RequestBody TOTeatro to){
        return teatroFacade.cadastrarTeatro(to);
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<TOTeatro> listarTeatros(){
        return teatroFacade.listarTeatros();
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseBody
    public String removerTeatro(@PathVariable("id") Long id){
        return teatroFacade.removerTeatro(id);
    }

}
