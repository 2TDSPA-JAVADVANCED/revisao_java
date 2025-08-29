package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieCatalog implements MovieCatalogInterface {

    ArrayList<Movie> movieCatalog = new ArrayList<>();

    @Override
    public void addMovie(Movie movie) {
        movieCatalog.add(movie);
    }

    @Override
    public List<Movie> filtrarFilmePorIdade(int idadeEspectador) {
        List<Movie> listaEspectador = new ArrayList<>();

        for (int i = 0; i < movieCatalog.size(); i++) {
            Movie m = movieCatalog.get(i);
            if (m.getRate() <= idadeEspectador) {
                listaEspectador.add(m);
            }
        }
        return listaEspectador;
    }

    public List<Movie> filtrarFilmePorIdade2(int idadeEspectador) {
        List<Movie> listaEspectador = new ArrayList<>();
        for (Movie m: movieCatalog){
            if (m.getRate() <= idadeEspectador) {
                listaEspectador.add(m);
            }
        }
        return listaEspectador;
    }

    public List<Movie> filtrarFilmePorIdade3(int idadeEspectador) {
        return movieCatalog
                .stream()
                .filter(m -> m.getRate() <= idadeEspectador)
                .collect(Collectors.toList());

    }

    @Override
    public List<Movie> filtrarPorCategoria(MovieCategory category) {

        return movieCatalog
                .stream()
                .filter(m -> m.isInCategoryList(Arrays.asList(category)))
                .collect(Collectors.toUnmodifiableList());

    }


}
