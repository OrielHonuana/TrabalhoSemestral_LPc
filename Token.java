/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author oriel
 */
public class Token {
    private String classe;
    private String lexema;
    private int linha;
    private int posicao;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public Token(String classe, String lexema) {
        this.classe = classe;
        this.lexema = lexema;
    }

    public Token(String classe, String lexema, int linha, int posicao) {
        
        this.classe = classe;
        this.lexema = lexema;
        this.linha = linha;
        this.posicao=posicao;
       
        
    }
   

    public Token() {
    }

    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    /**
     * @return the posicao
     */
    public int getPosicao() {
        return posicao;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
   
}
