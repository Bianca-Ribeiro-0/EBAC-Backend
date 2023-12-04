package test;

import dao.ContratoDao;
import dao.IContratoDao;
import mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService service = new ContratoService(contrato);
        String retorna = service.salvar();
        Assert.assertEquals("ok!", retorna);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void salvarTestErro() {
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        String retorna = service.salvar();
        Assert.assertEquals("ok!", retorna);
    }

    public void buscarTest(){
        IContratoDao buscar = new ContratoDaoMock();
        IContratoService service = new ContratoService(buscar);
        String retorna = service.buscar();
        Assert.assertEquals("buscar", retorna);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void buscarTestErro() {
        IContratoDao buscar = new ContratoDao();
        IContratoService service = new ContratoService(buscar);
        String retorna = service.buscar();
        Assert.assertEquals("ok", retorna);
    }

    public void excluirTest(){
        IContratoDao excluir = new ContratoDaoMock();
        IContratoService service = new ContratoService(excluir);
        String retorna = service.excluir();
        Assert.assertEquals("excluir", retorna);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void excluirTestErro() {
        IContratoDao excluir = new ContratoDao();
        IContratoService service = new ContratoService(excluir);
        String retorna = service.excluir();
        Assert.assertEquals("ok", retorna);
    }

    public void atualizarTest(){
        IContratoDao atualizar = new ContratoDaoMock();
        IContratoService service = new ContratoService(atualizar);
        String retorna = service.atualizar();
        Assert.assertEquals("atualizar", retorna);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void atualizarTestErro() {
        IContratoDao atualizar = new ContratoDao();
        IContratoService service = new ContratoService(atualizar);
        String retorna = service.atualizar();
        Assert.assertEquals("ok", retorna);
    }
}


