import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import teatro.teatros.entities.TOTeatro;
import teatro.teatros.service.TeatroFacade;

@SpringBootTest
@AutoConfigureMockMvc
public class TeatroTest {

    private TeatroFacade servico;

    @Test
    void case1() throws Exception {
    }
}
