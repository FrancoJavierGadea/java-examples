package main.utils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import main.biblioteca.Libro;

public class LibrosLoader {
    
    public static List<Libro> getLibrosFromJSON(){

        try {

            File path = new File(
                LibrosLoader.class.getResource("/books.json").toURI()
            );
    
            FileInputStream stream = new FileInputStream(path);

            String rawJson = IOUtils.toString(stream, StandardCharsets.UTF_8);

            JSONObject json = new JSONObject(rawJson);

            JSONArray library = (JSONArray) json.get("library");

            ArrayList<Libro> libros = new ArrayList(json.getInt("total"));

            library.forEach((value) -> {

                JSONObject book = (JSONObject) value;

                Libro libro = new Libro();

                libro.setName((String) book.query("/book/title"));
                libro.setISBN((String) book.query("/book/ISBN"));
                libro.setPages((int) book.query("/book/pages"));

                try {
                    
                    libro.setAuthor((String) book.query("/book/author/name"));

                } catch (Exception e) {
                    
                }

                libro.setYear((int) book.query("/book/year"));
                libro.setSynopsis((String) book.query("/book/synopsis"));

                libros.add(libro);
            });

            return libros;
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        }

        return null;
    }
}
