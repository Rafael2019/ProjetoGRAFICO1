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
public class Nota {
    private String nomeDisciplina;
    private float nota;
    private TipoAvaliacao tipoAvaliacao;

    public Nota(String nomeDisciplina, float nota, TipoAvaliacao tipoAvaliacao) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
        this.tipoAvaliacao = tipoAvaliacao;
    }

    @Override
    public String toString() {
        return "Nota{" + "nomeDisciplina=" + nomeDisciplina + ", nota=" + nota + ", tipoAvaliacao=" + tipoAvaliacao + '}';
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public TipoAvaliacao getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(TipoAvaliacao tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }
    
    
    
    
    
}
