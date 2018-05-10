/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objetos;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    PROVA("Avaliação individual"),
    TRABALHO("Trabalho"),
    SEMINARIO("Seminário");
    private String tipoAvaliacao;

    private TipoAvaliacao(String nomeAvaliacao) {
        this.tipoAvaliacao = nomeAvaliacao;
    }

    public String getNomeAvaliacao() {
        return tipoAvaliacao;
    }

    @Override
    public String toString() {
        return "TipoAvaliacao{" + "nomeAvaliacao=" + tipoAvaliacao + '}';
    }

    
    
    
}
