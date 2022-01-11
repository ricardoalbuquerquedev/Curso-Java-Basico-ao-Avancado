package oo.Encapsulamento;

public class Pessoa {

    private String nome; // obs: o intelliJ consegue gerar p mim os métodos get/set

    private int idade; // pessoa tem o atributo idade.

    public Pessoa(String nome , int idade) {
        setNome(nome);// criei um construto
        setIdade(idade);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter
    public int getIdade() {    // criei um metodo
        return idade;
    }
     //Setter
    public void setIdade(int novaIdade) { //recebe o parâmetro do mesmo tipo q voce colocou la em cima idade
        novaIdade = Math.abs(novaIdade); // o que for negativo passa a ser positivo
        if (novaIdade >= 0 && novaIdade<=120) {
            this.idade = novaIdade;

        }
    }

    @Override
    public String toString() {
        return "Olá eu sou o"+ getNome() + "tenho"  + getIdade()+ "Anos";
    }
}
