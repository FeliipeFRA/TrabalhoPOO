// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

package com.aventuraepica.model;

public class Tesouro extends Item {
    private int valor;

    public Tesouro(String nome, String raridade, int valor) {
        super(nome, raridade);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Valor: " + valor + " moedas de ouro";
}

}
