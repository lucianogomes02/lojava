package br.com.loja.pedido;

import br.com.loja.libs.CommandHandler;

public class GeraPedidoHandler extends CommandHandler {
    protected GeraPedido geraPedido;

    public GeraPedidoHandler(GeraPedido geraPedido) {
        this.geraPedido = geraPedido;
    }

    @Override
    public void executar() {
        // EXECUTA COMANDO COM OS DADOS
    }
}
