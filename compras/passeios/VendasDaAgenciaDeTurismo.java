package compras.passeios;

import java.util.ArrayList;
import java.util.List;
public class VendasDaAgenciaDeTurismo {
    private List<VendaDeTurismoIF> vendas = new ArrayList<>();

    int adicionaVenda;
    double PrecoDeVenda, PrecoTotal;
    String listagemDeVenda;


    public double getPrecoDeVenda() {
        return PrecoDeVenda;
    }

    public double getPrecoTotal() {
        return PrecoTotal;
    }


}
