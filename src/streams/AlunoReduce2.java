package streams;

public class AlunoReduce2 {
    final String nome;
    final double nota;
    final boolean bomComportamento;

    public AlunoReduce2(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public AlunoReduce2(String nome, double nota, boolean bomComportamento, String nome1, double nota1, boolean bomComportamento1) {
        this(nome, nota, true);

    }
}
