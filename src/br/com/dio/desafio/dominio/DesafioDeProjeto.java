package br.com.dio.desafio.dominio;

public class DesafioDeProjeto extends Conteudo{
    public int dificuldadeProjeto;

    @Override
    public String toString() {
        return "Desafio de Projeto: " +
                "titulo: '" + titulo + '\'' +
                ", descricão: '" + descricao + '\'' +
                ", dificuldade de projeto: " + dificuldadeProjeto +
                '\n';
    }

    public int getDificuldadeProjeto() {
        return dificuldadeProjeto;
    }

    public void setDificuldadeProjeto(int dificuldadeProjeto) {
        this.dificuldadeProjeto = dificuldadeProjeto;
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO*dificuldadeProjeto;
    }
}
