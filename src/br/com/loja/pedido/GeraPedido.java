package br.com.loja.pedido;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GerarPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    public GerarPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    
}
