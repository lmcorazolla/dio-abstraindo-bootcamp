package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " +
                "titulo: '" + getTitulo() + '\'' +
                ", descrição: '" + getDescricao() + '\'' +
                ", carga horária: " + cargaHoraria +
                '\n';
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
