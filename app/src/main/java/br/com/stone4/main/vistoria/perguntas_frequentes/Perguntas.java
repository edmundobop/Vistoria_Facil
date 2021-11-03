package br.com.stone4.main.vistoria.perguntas_frequentes;

public class Perguntas {

    private String pergunta, resposta;
    private boolean expansivel;

    public boolean isExpansivel() {
        return expansivel;
    }

    public void setExpansivel(boolean expansivel) {
        this.expansivel = expansivel;
    }

    public Perguntas(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.expansivel = false;
    }

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
        return "Perguntas{" +
                "pergunta='" + pergunta + '\'' +
                ", resposta='" + resposta + '\'' +
                '}';
    }
}
