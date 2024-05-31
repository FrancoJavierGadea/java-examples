package main;

import java.util.Arrays;
import java.util.List;

import main.biblioteca.Biblioteca;
import main.biblioteca.Libro;
import main.utils.LibrosLoader;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        //Filtrar libros por author
        //List<Libro> libros = biblioteca.getLibrosByAuthor("albert r. meyer");

        //Filtrar libros por tags
        //List<Libro> libros = biblioteca.getLibrosByTags(Arrays.asList("Computer Science"));
        List<Libro> libros = biblioteca.getLibrosByTags(Arrays.asList("Mathematics"));

        System.out.println(libros);
    }
}