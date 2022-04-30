package com.ejercicio18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Serie series[] = crearSeries();
        Videojuego videojuegos[] = crearVideojuegos();

        List<Serie> seriesEntregadas;
        List<Videojuego> videojuegosEntregados;

        series[0].entregar();
        series[1].entregar();
        series[2].entregar();
        series[3].entregar();
        series[4].entregar();
        videojuegos[0].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

        seriesEntregadas = contarSeriesEntregadas(series);
        videojuegosEntregados = contarVideojuegosEntregados(videojuegos);

        System.out.println("Series entregadas: " + seriesEntregadas.size());
        for (Serie serie : seriesEntregadas) {
            System.out.println("\n"+ serie);
        }
        System.out.println("\nVideojuegos entregados: " + videojuegosEntregados.size());
        for (Videojuego videojuego : videojuegosEntregados) {
            System.out.println("\n" + videojuego);
        }

        mayorHorasVideoJuego(videojuegos);
        mayorTemporadasSerie(series);
    }

    public static Serie[] crearSeries() {
        Serie series[] = new Serie[5];

        series[0] = new Serie("Sense8", "Netflix", 3, "Fantasia");
        series[1] = new Serie("GoT", "HBO", 8, "Fantasia");
        series[2] = new Serie("Berserk", "AnimeFLV", 2, "Gore");
        series[3] = new Serie("Stranger Things", "Netflix", 3, "Suspenso");
        series[4] = new Serie("You", "Netflix", 4, "Drama");

        return series;
    }
    public static Videojuego[] crearVideojuegos() {
        Videojuego videojuegos[] = new Videojuego[5];

        videojuegos[0] = new Videojuego("Diablo III", 100, "Acción", "PC");
        videojuegos[1] = new Videojuego("Warcraft", 320, "Acción", "PC");
        videojuegos[2] = new Videojuego("God of War", 80, "Aventura", "PlayStation 2");
        videojuegos[3] = new Videojuego("Pokemón", 410, "Aventura", "Nintendo");
        videojuegos[4] = new Videojuego("Silent Hill", 95, "Acción", "PlayStation 2");

        return videojuegos;
    }

    public static List<Serie> contarSeriesEntregadas(Serie[] series) {
        List<Serie> seriesEntregadas = new ArrayList<Serie>();

        for (Serie serie : series) {
            if (serie.isEntregado()) {
                seriesEntregadas.add(serie);
            }
        }
        return seriesEntregadas;
    }

    public static List<Videojuego> contarVideojuegosEntregados(Videojuego[] videojuegos) {
        List<Videojuego> videojuegosEntregados = new ArrayList<Videojuego>();

        for (Videojuego videojuego : videojuegos) {
            if (videojuego.isEntregado()) {
                videojuegosEntregados.add(videojuego);
            }
        }
        return videojuegosEntregados;
    }

    public static void mayorTemporadasSerie (Serie [] series) {
        Serie serieMayorTemporadas;
        serieMayorTemporadas = series[0];
        for (int i = 0; i < series.length; i++) {
            if (serieMayorTemporadas.compareTo(series[i]) == -1) {
                serieMayorTemporadas = series[i];
            }
        }
        System.out.println("\nLa serie con el mayor número de temporadas es: \n" + serieMayorTemporadas);
    }

    public static void mayorHorasVideoJuego (Videojuego [] videojuegos) {
        Videojuego videojuegoMayor;
        videojuegoMayor = videojuegos[0];
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegoMayor.compareTo(videojuegos[i]) == -1) {
                videojuegoMayor = videojuegos[i];
            }
        }
        System.out.println("\nEl videojuego con el mayor número de horas estimadas para terminarlo es: \n" + videojuegoMayor);
    }
}
