package com.agencia.model;

public class Destino {

	private int idDestino;

	private String nomeDestino;

	private String precoDestino;
	
	public Destino() {
		super();
	}

	public Destino(int idDestino, String nomeDestino, String precoDestino) {
		super();
		this.idDestino = idDestino;
		this.nomeDestino = nomeDestino;
		this.precoDestino = precoDestino;
	}

	

	public int getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public String getNomeDestino() {
		return nomeDestino;
	}

	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}

	public String getPrecoDestino() {
		return precoDestino;
	}

	public void setPrecoDestino(String precoDestino) {
		this.precoDestino = precoDestino;
	}

	@Override
	public String toString() {
		return "Destino [idDestino=" + idDestino + ", nomeDestino=" + nomeDestino + ", precoDestino=" + precoDestino
				+ "]";
	}
}
