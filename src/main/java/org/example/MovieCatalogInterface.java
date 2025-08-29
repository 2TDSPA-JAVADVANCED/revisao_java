package org.example;

import java.util.List;

public interface MovieCatalogInterface {

    void addMovie(Movie movie);

    List<Movie> filtrarFilmePorIdade(int idadeEspectador);

    List<Movie> filtrarPorCategoria(MovieCategory category);

}
