/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author franc
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author franc
 */
public class Table extends AbstractTableModel{
    private List<Pessoa> lista = new ArrayList<>();
    private List<Veiculo> lista1 = new ArrayList<>();
    private String[] colunas = {"Nome","CPF","Telefone","Modelo","Placa"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return lista.get(linha).getNome();
            case 1: 
                return lista.get(linha).getCpf();
            case 2:
                return lista.get(linha).getTelefone();
            case 3:
                return lista.get(linha).getPlaca();
            case 4: 
                return lista.get(linha).getModelo();
        }
        return null;
    }
    
    public void addRow(Pessoa p){
        this.lista.add(p);
        this.fireTableDataChanged();
    }
    public void addRow1(Veiculo v){
        this.lista1.add(v);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.lista.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}


