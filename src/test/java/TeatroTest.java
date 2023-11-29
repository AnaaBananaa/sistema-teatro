import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import teatro.MainApplication;
import teatro.teatros.entities.TOTeatro;
import teatro.teatros.service.TeatroFacade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = MainApplication.class)
public class TeatroTest {

    @Autowired
    private TeatroFacade teatroFacade;
    private static Long id;

    @Test
    public void testCad1() {
        TOTeatro to = new TOTeatro();
        to.setTitulo("Exemplo Teste");
        to.setSinopse("Teste automatizado para spring");
        TOTeatro retorno = teatroFacade.cadastrarTeatro(to);
        assertNotNull(retorno);
        id = retorno.getId();
        assertEquals(to, retorno);
    }

    @Test
    public void testCad2() {
        String retorno = teatroFacade.removerTeatro(id);
        assertNotNull(retorno);
        assertEquals("Peça de teatro removida", retorno);
    }

}
