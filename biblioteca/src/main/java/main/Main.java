package main;

import java.util.List;

import main.biblioteca.Libro;
import main.utils.LibrosLoader;

public class Main {

    public static void main(String[] args) {

        List<Libro> libros = LibrosLoader.getLibrosFromJSON();

        libros.stream().forEach(libro -> {

            System.out.println(libro.getISBN());
        });

        System.out.println(libros.get(40));
    }
}