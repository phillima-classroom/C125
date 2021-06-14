package br.inatel.cdg.pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

	private List<T> elementos;
	private int qtdElementos;
	
	public Pilha() {
		elementos = new ArrayList<>();
	}
	
	public boolean pilhaVazia() {
		return qtdElementos==0;
	}
	
	public void push(T elemento) {
		elementos.add(elemento);
		qtdElementos++;
	}
	
	public T mostraTopo() {
		T elemento = elementos.get(qtdElementos-1);
		return elemento;
	}
	
	public int getQtdElementos() {
		return qtdElementos;
	}
}