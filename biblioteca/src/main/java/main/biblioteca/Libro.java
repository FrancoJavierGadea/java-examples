package main.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    
    private String ISBN;
    private String name;
    private int pages;
    private String author;
    private List<String> tags = new ArrayList<>();
    private String synopsis;
    private int year;

    public Libro(){}

    //MARK: Getters and Setters
    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getSynopsis() {
        return this.synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    //MARK: toString
    @Override
    public String toString() {

        return String.join("\n", "{",
            "  ISBN: " + this.ISBN,
            "  name: " + this.name,
            "  pages: " + this.pages,
            "  author: " + this.author,
            "  tags: " + String.join(" - ", this.tags),
            "  synopsis: " + this.synopsis,
            "  year: " + this.year,
        "}");
    }
}
