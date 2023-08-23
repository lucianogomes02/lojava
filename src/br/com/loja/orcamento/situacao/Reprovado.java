package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento reprovado nao pode ter desconto extra!");
	}

	@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

}
