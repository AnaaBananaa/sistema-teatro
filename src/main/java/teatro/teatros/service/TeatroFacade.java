package teatro.teatros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teatro.teatros.entities.TOTeatro;
import teatro.teatros.entities.Teatro;
import teatro.teatros.repository.TeatroRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeatroFacade {

    @Autowired
    private TeatroRepository repository;

    public TOTeatro cadastrarTeatro(TOTeatro to){
        Teatro teatro = new Teatro();
        teatro.setTitulo(to.getTitulo());
        teatro.setSinopse(to.getSinopse());
        repository.save(teatro);
        to.setId(teatro.getId());
        return to;
    }

    private TOTeatro converter (Teatro teatro){
        TOTeatro to = new TOTeatro();
        to.setId(teatro.getId());
        to.setTitulo(teatro.getTitulo());
        to.setSinopse(teatro.getSinopse());
        return to;
    }

    public List<TOTeatro> listarTeatros(){
        return repository.findAll().stream().map(this::converter).collect(Collectors.toList());
    }

    public String removerTeatro(Long id){
        repository.deleteById(id);
        return "Peça de teatro removida";
    }

}
