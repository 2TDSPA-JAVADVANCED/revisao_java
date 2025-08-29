package org.example;

import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.*;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {

    public final static int UNDER_AGE_LIMIT = 18;


    public static void main(String[] args) {

        Movie filme1 = new Movie();
        filme1.setId(UUID.randomUUID());
        filme1.setName("Jurasic Park VI");
        filme1.setRate(14);
        filme1.setCategorires(Arrays.asList(MovieCategory.ACTION, MovieCategory.TERROR));

        Movie filme2 = new Movie();
        filme2.setId(UUID.randomUUID());
        filme2.setName("Quarteto Fantastico");
        filme2.setRate(10);
        filme2.setCategorires(Arrays.asList(MovieCategory.SCIFY));

        MovieCatalogInterface movieCatalog = new MovieCatalog();
        movieCatalog.addMovie(filme1);
        movieCatalog.addMovie(filme2);

        int idadeEspectador = 18;

        //List<Movie> listaEspectador = filtrarFilmePorIdade3(movieCatalog, idadeEspectador);

        List<Movie> listaEspectador = movieCatalog.filtrarPorCategoria(MovieCategory.ACTION);

        for (Movie m: listaEspectador){
            System.out.println(m.toString());
        }

    }




}