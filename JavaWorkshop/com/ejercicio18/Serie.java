package com.ejercicio18;

public class Serie implements Entregable{

    protected String titulo;
    protected Integer numeroTemporadas;
    protected Boolean entregado;
    protected String genero;
    protected String creador;

    public Serie() {
        this.numeroTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador, Integer numeroTemporadas, String genero) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Titulo : " + titulo + "\nCreador : " + creador + "\nNúmero de temporadas : " + numeroTemporadas + "\nGenero : " +
                genero + "\nEntregado: " + entregado;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Integer compareTo(Object object) {
        Serie serieComparada = (Serie) object;
        Integer compareNumber = 0;
        if (this.numeroTemporadas > serieComparada.numeroTemporadas)
            compareNumber = 1;
        if (this.numeroTemporadas < serieComparada.numeroTemporadas)
            compareNumber = -1;
        return compareNumber;
    }
}
