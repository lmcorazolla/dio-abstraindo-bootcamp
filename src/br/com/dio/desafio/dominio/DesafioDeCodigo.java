package br.com.dio.desafio.dominio;

public class DesafioDeCodigo extends Conteudo{
    private int quantidadeDesafios;

    @Override
    public String toString() {
        return "Desafio de Código " +
                "título: '" + titulo + '\'' +
                ", descrição: '" + descricao + '\'' +
                ", quantidade de desafios: " + quantidadeDesafios +
                '\n';
    }

    public int getQuantidadeDesafios() {
        return quantidadeDesafios;
    }

    public void setQuantidadeDesafios(int quantidadeDesafios) {
        this.quantidadeDesafios = quantidadeDesafios;
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO*quantidadeDesafios;
    }
}
