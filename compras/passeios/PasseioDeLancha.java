package compras.passeios;

import java.util.Objects;

public class PasseioDeLancha {

    // nomeDosSetsGets
    int numeroDePessoas, qtdeDeHoras;
    double PRECO_POR_PESSOA, Preco;
    String Descricao;

    // variaveis para o funcionamento do cod

    int qtdePessoas, qtdeDeHora, PRECO_POR_PESSOA_POR_HORA = 60;

//    public PasseioDeLancha(int numeroDePessoas) {
//        this.numeroDePessoas = numeroDePessoas;
//    }
//
//    public PasseioDeLancha(double PRECO_POR_PESSOA) {
//        this.PRECO_POR_PESSOA = PRECO_POR_PESSOA;
//    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int novaQtde) {
        this.numeroDePessoas = novaQtde;
    }

    public int getQtdeDeHoras() {
        return qtdeDeHoras;
    }

    public void setQtdeDeHoras(int novaQtde) {
        this.qtdeDeHoras = novaQtde;
    }

    public double getPRECO_POR_PESSOA() {
        return PRECO_POR_PESSOA;
    }

    public void setPRECO_POR_PESSOA(double novaQtde) {
        this.PRECO_POR_PESSOA = novaQtde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasseioDeLancha that = (PasseioDeLancha) o;
        return numeroDePessoas == that.numeroDePessoas && qtdeDeHoras == that.qtdeDeHoras && Double.compare(PRECO_POR_PESSOA, that.PRECO_POR_PESSOA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePessoas, qtdeDeHoras, PRECO_POR_PESSOA);
    }

    @Override
    public String toString() {
        return "PasseioDeLancha{" +
                "numeroDePessoas=" + numeroDePessoas +
                ", qtdeDeHoras=" + qtdeDeHoras +
                ", PRECO_POR_PESSOA=" + PRECO_POR_PESSOA +
                '}';
    }

    public double getPreco(int qtdePessoas, int qtdeDeHoras, int PRECO_POR_PESSOA_POR_HORA) {
        return qtdePessoas * qtdeDeHoras * PRECO_POR_PESSOA_POR_HORA;
    }

    public String getDescricao() {
        return Descricao;
    }
}










