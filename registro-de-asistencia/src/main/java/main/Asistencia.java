package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Asistencia {

    private LocalDateTime date;
    private Boolean state = false;
    private Alumno alumno;


    public Asistencia(){}


    public Asistencia(LocalDateTime date, Boolean state, Alumno alumno) {
        this.date = date;
        this.state = state;
        this.alumno = alumno;
    }


    @Override
    public String toString() {

        return String.format("Asistencia{ Date: %s State: %s Alumno: %s }", 
            this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")),
            this.state,
            this.alumno.getName()
        );
    }
    

    //MARK: Getters and Setters
    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Boolean isState() {
        return this.state;
    }

    public Boolean getState() {
        return this.state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }


}

