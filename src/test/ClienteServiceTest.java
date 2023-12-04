package test;

import mock.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

public class ClienteServiceTest {
    @Test
    public void salvarTeste() {
        ClienteDaoMock mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Ok!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void salvarTesteErro(){
        ClienteDaoMock mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Ok!", retorno);
    }
}
