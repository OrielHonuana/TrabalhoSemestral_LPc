/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author oriel
 */
public class TabelaToken extends AbstractTableModel{
    private ArrayList<Token> linhas = null;
    private String[] colunas = null;

    public TabelaToken(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

     public void addlinha(Token token){
         linhas.add(token);
         fireTableRowsInserted(linhas.size()-1, linhas.size()-1);
     }
     
     
     public void removeall(){
         linhas.clear();
     }
     public Token gettoken(int linha){
        return linhas.get(linha);
    }
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override

    public String getColumnName(int numCol) {
        return colunas[numCol];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Token token = linhas.get(rowIndex);
        switch(columnIndex){
            case 0: return token.getLexema();
            case 1: return token.getClasse();
            case 2: return token.getLinha();
        }
        return null;
    }
    
     @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Token token = linhas.get(rowIndex);
        switch (rowIndex){
            case 1: token.setLexema((String)value); break;
            case 2: token.setClasse(value.toString());break;
            case 3:token.setLinha((int) value);break;
        }
             this.fireTableDataChanged();
    }

}
