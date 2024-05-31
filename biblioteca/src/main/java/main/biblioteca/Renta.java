package main.biblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Renta {

    public static enum STATUS {
        PRESTADO,
        DEVUELTO,
        NO_DEVUELTO
    }

    private List<String> libros = new ArrayList<>();
    private LocalDateTime date;
    private int days;
    private Socio socio;
    private STATUS status;

    public Renta() {}


    public LocalDateTime getEndDate(){

        return this.date.plusDays(days);
    }

    public String getEndDateString(){

        return this.getEndDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public String getDateString(){

        return this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }


    //MARK: Getters and Setters
    public List<String> getLibros() {
        return this.libros;
    }

    public void setLibros(List<String> libros) {
        this.libros = libros;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Socio getSocio() {
        return this.socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public STATUS getStatus() {
        return this.status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    
}
