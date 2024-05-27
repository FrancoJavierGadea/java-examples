package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Clase {
    
    private String name;
    private LocalDateTime date;
    private int duration;
    private List<String> tags;
    private List<Asistencia> asistencias = new ArrayList<>();

    public Clase(String name, LocalDateTime date, int duration, String[] tags) {

        this.name = name;
        this.date = date;
        this.duration = duration;
        this.tags = new ArrayList<>(
            Arrays.asList(tags)
        );
    }

    public LocalDateTime getEndDate(){

        return this.date.plusMinutes(this.duration);
    }

    public String getEndDateString(){

        return this.getEndDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public String getDateString(){

        return this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public boolean putAsistencia(Alumno alumno){

        LocalDateTime current = LocalDateTime.now();

        if(current.isAfter(this.getDate())){

            this.asistencias.add(
                new Asistencia(current, true, alumno)
            );

            return true;
        }
        
        System.out.println("La clase no a empezado, empieza: " + this.getDateString());

        return false; 
    }

    public List<Asistencia> getAsistencias(){

        return this.asistencias;
    }

    @Override
    public String toString() {

        return String.join("\n", 
            "Clase: " + this.name,
            "Inicio: " + this.getDateString(),
            "Fin: " + this.getEndDateString(),
            "Tags: " + String.join(" - ", this.tags)
        );
    }


    //MARK: Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
