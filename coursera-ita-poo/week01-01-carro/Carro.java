//package week1;

/*

    "this"
    Palavra reservada usada para referenciar os elementos
    da classe (diferenciando, por exemplo, 
    o parâmetro do método do atributo da variável 
    quando elas possuem o mesmo nome)

    Construtores:
    " Os construtores eles são métodos especiais, certo, que a gente utiliza para criar novos objetos"
    - O construtor não precisa ter retorno igual a método normal
    - Toda classe tem pelo menos um construtor, 
    mesmo quando não definimos nenhum explicitamente.
    - Quando nenhum construtor é definido, 
    um vazio e sem parâmetros é criado para você.
        Carro c1 = new Carro();
    - Podemos ter mais de um construtor com tipos de parâmetros diferentes
        public class Carro {
            Carro (int potencia) {...}
            Carro (String marca) {...}
            Carro (int potencia, String marca) {...}
        }
    - Não podemos ter um construtor int recebendo potencia 
    e outro int recebendo velocidade
    - Ao criar um construtor, o default sem parâmetros
    para de funcionar? Parece que sim: "error: constructor Carro in class Carro cannot be applied to 
given types;"

*/

public class Carro {

    /* Atributos da classe Carro */
    int potencia;
    int velocidade;
    String nome;

    void acelerar() {
        velocidade += potencia;
    }

    void frear() {
        velocidade /= 2;
    }

    int getVelocidade() {
        return velocidade;
    }

    void imprimir() {
        //sysout
        System.out.println("O carro " + nome + " está a velocidade " + getVelocidade());
    }

    Carro() {

    }

    Carro (int potencia) {

    }


    public static void main(String args[]) {
        System.out.println("ola");
        Carro carro = new Carro();
        
    }
}