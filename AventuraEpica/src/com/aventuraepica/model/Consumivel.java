// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

package com.aventuraepica.model;

class Consumivel extends Item {
    private int cura;

    public Consumivel(String nome, String raridade, int cura) {
        super(nome, raridade);
        this.cura = cura;
    }

    public int getCura() {
        return cura;
    }
}
