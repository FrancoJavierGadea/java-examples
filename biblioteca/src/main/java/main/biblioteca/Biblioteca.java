package main.biblioteca;

import java.util.List;
import java.util.stream.Collectors;

import main.utils.LibrosLoader;

public class Biblioteca {
    
    private List<Libro> libros = LibrosLoader.getLibrosFromJSON();

    private List<Producto> productos = libros.stream().map(libro -> {
        
        Producto<Libro> producto = new Producto<>();

        producto.setId(libro.getISBN());
        producto.setStock((int) Math.round(Math.random() * 20 + 3));
        producto.setProduct(libro);
        producto.setState(Producto.STATE.ONLY_RENT);

        return producto;

    }).collect(Collectors.toList());


    public Biblioteca(){

        System.out.println(productos);
    }


    public List<Libro> getLibrosByAuthor(String author) {

        return this.libros.stream()
        .filter(libro -> {

            return libro.getAuthor().toLowerCase().contains(author.toLowerCase());
        })
        .collect(Collectors.toList());
    }

    public List<Libro> getLibrosByTags(List<String> tags) {

        return this.libros.stream()
        .filter(libro -> {

            return tags.stream().anyMatch(tag -> {

                return libro.getTags().contains(tag);
            });
        })
        .collect(Collectors.toList());
    }  
    
    public List<Libro> getLibrosByName(String name) {

        return this.libros.stream()
        .filter(libro -> {

            return libro.getName().toLowerCase().contains(name.toLowerCase());
        })
        .collect(Collectors.toList());
    }


    public List<Libro> getLibros() {
        return this.libros;
    }

    
}
