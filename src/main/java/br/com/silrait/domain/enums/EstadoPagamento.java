package br.com.silrait.domain.enums;

import java.util.stream.Stream;

public enum EstadoPagamento {
	PENDENTE(1, "Pendente"), QUITADO(2, "Quitado"), CANCELADO(3, "Cancelado");

	private Integer cod;
	private String descricao;

	private EstadoPagamento(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagamento toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		return Stream.of(EstadoPagamento.values()).filter(estadoPagamento -> estadoPagamento.getCod().equals(cod))
				.findFirst().orElseThrow(() -> new IllegalArgumentException("Id inválido: " + cod));
	}
}
