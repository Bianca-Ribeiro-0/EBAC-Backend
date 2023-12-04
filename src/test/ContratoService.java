package test;

import dao.IContratoDao;
import service.IContratoService;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao contrato) {
        this.contratoDao = contrato;
    }

    public String salvar() {
        contratoDao.salvar();
        return "ok!";
    }

    @Override
    public String buscar() {
        return "buscar";
    }

    @Override
    public String excluir() {
        return "excluir";
    }

    @Override
    public String atualizar() {
        return "atualizar";
    }
}
