//package week1;
//import week1.*;

/*

javac .\Carro.java; javac .\Principal.java; java Principal

*/

public class Principal {
    public static void main(String args[]) {
        
        /* Não precisei importar a classe Carro */
        
        /* Criando uma classe sem passar nenhum parâmetro */
        Carro carro1 = new Carro();
        carro1.potencia = 10;
        carro1.nome = "Corcel";
        carro1.velocidade = 0;
        carro1.imprimir();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.imprimir();

        /* 
            As modificações feitas na instância c1 irão afetar a instância c2? 
            Resposta: Não
        */
        Carro carro2 = new Carro();
        carro2.potencia = 15;
        carro2.velocidade = 0;
        carro2.nome = "Carango";
        carro2.imprimir();

        Carro carro3 = new Carro();
        carro3.potencia = 15;
        carro3.velocidade = 0;
        carro3.nome = "Corsel";
        carro3.imprimir();

    }
}