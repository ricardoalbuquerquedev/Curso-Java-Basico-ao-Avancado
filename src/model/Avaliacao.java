package model;

public class Avaliacao {
    String pergunta;
    String resposta;

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;

        }

    @Override
    public String toString() {
        return "Avaliacao{" + "pergunta='" + pergunta + '\'' + ", resposta='" + resposta + '\'' + '}';
    }
}

