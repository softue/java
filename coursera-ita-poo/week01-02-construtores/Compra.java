public class Compra {
    int valorTotal;
    int numeroParcelas;

	// construtor não pode ter o void, pois retorna a própria classe
    // compra à vista
    public Compra(int valor) {
        valorTotal = valor;
        numeroParcelas = 1;
    }

    // compra parcelada
    public Compra(int qtdParcelas, int valorParcela) {
        numeroParcelas = qtdParcelas;
        valorTotal = valorParcela * qtdParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }    

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela() {
        return valorTotal / numeroParcelas;
    }
    
}